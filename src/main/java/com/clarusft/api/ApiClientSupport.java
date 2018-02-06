package com.clarusft.api;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.clarusft.api.exception.ApiException;
import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.ApiRequest;
import com.clarusft.api.model.ApiResponse;
import com.clarusft.api.model.SupportsDrilldown;
import com.clarusft.api.model.SupportsFilter;
import com.clarusft.api.model.SupportsPivot;
import com.clarusft.api.model.SupportsTranspose;
import com.clarusft.api.transform.ApiResponseParser;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

@ThreadSafe
public abstract class ApiClientSupport {
	protected final String baseUrl;
	protected final String apiKey;
	protected final String apiSecret;
	protected final int connectTimeout;
	protected final int readTimeout;
	
	protected final ObjectMapper jsonMapper = new ObjectMapper();
	{
		jsonMapper.setSerializationInclusion(Include.NON_NULL);
		
		SimpleModule module = new SimpleModule("com.clarusft.api.CustomModule");
		module.addSerializer(new LocalDateSerializer());
		module.addSerializer(new BigDecimalSerializer());
		jsonMapper.registerModules(module);
	}
	
	public ApiClientSupport(ApiClientBuilder builder) {
		this.baseUrl = builder.baseUrl;
		this.apiKey = builder.apiKey;
		this.apiSecret = builder.apiSecret;
		this.connectTimeout = builder.connectTimeout;
		this.readTimeout = builder.readTimeout;
	}
	

	protected <RESP extends ApiResponse> RESP requestImpl(ApiRequest request, ApiResponseParser<RESP> parser) {
		HttpURLConnection conn = null;
		try {
			conn = openConnection(request);
			initConn(conn, request);
			
			postRequest(conn, request);
			
			HttpResp resp = new HttpResp();
			readResponse(conn, resp);
			
			RESP response = parser.parse(resp, null);
			setAttributes(response);
			return response;
		} catch (IOException e) {
			throw new ApiException("Error making API request", e);
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
	}
	
	protected <RESP extends ApiResponse>  void setAttributes(RESP response) {
		if (response instanceof SupportsDrilldown) {
			setDrilldownProvider((SupportsDrilldown) response);
		}
		if (response instanceof SupportsPivot) {
			setPivotProvider((SupportsPivot) response);
		}
		if (response instanceof SupportsFilter) {
			setFilterProvider((SupportsFilter) response);
		}
		if (response instanceof SupportsTranspose) {
			setTransposeProvider((SupportsTranspose) response);
		}
	}

	protected abstract void setDrilldownProvider(SupportsDrilldown response);
	
	protected abstract void setPivotProvider(SupportsPivot response);
	
	protected abstract void setFilterProvider(SupportsFilter response);
	
	protected abstract void setTransposeProvider(SupportsTranspose response);

	protected void readResponse(HttpURLConnection conn, HttpResp resp) throws IOException {
		resp.setResponseCode(conn.getResponseCode());
		resp.setResponseHeaders(conn.getHeaderFields());
		
		try (ByteArrayOutputStream responseOut = new ByteArrayOutputStream()) {
			try {
				try (InputStream in=conn.getInputStream()) {
					copy(in, responseOut);	
				}
			} catch (IOException e) {
				try (InputStream in=conn.getErrorStream()) {
					copy(in, responseOut);
				}
			}

			resp.setResponseBody(responseOut.toString("UTF-8"));
		}
    }
	
	private static void copy(InputStream in, OutputStream out)
            throws IOException {
    	if (in != null) {
    		byte[] buffer = new byte[4096];
            int len;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }	
    	}
    }
	
	protected HttpURLConnection openConnection(ApiRequest request) throws IOException {
        String apiUrl = baseUrl + request.getApiCategory() + "/" + request.getApiName();
        if (request.getOutputType() != null) {
        	apiUrl += "." + request.getOutputType();
        }

        URL url = new URL(apiUrl);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        

        return conn;
    }
	
	protected void postRequest(HttpURLConnection conn, ApiRequest request) throws IOException {
        byte[] reqBytes = jsonMapper.writeValueAsBytes(request.getParameters());

//        System.out.println(jsonMapper.writeValueAsString(req));

        try (OutputStream out = conn.getOutputStream()) {
            out.write(reqBytes);
            out.flush();
        }
    }

	protected void initConn(HttpURLConnection conn, ApiRequest request) throws IOException {
		if (request.getHttpMethod() != null) {
			conn.setRequestMethod(request.getHttpMethod());
		} else {
			conn.setRequestMethod("POST");	
		}
		
        conn.setRequestProperty("Content-Type", "application/json");
        
        //TODO user agent
//        String userAgent = getParameter(USER_AGENT);
//        if (!Is.empty(userAgent)) {
//        	conn.setRequestProperty("User-Agent", userAgent);	
//        }

        setTimeouts(conn);
        setAuthHeader(conn);

        conn.setDoOutput(true);
        conn.setDoInput(true);
	}
	
	private void setTimeouts(HttpURLConnection conn) {
        if (this.connectTimeout > 0) {
            conn.setConnectTimeout(connectTimeout);
        }
        if (this.readTimeout > 0) {
            conn.setReadTimeout(readTimeout);
        }
    }

    private void setAuthHeader(HttpURLConnection conn) throws UnsupportedEncodingException {

        String auth = this.apiKey + ":" + this.apiSecret;

        byte[] authB64Array =  Base64.getEncoder().encode(auth.getBytes("UTF-8"));
        String authB64 = new String(authB64Array, "UTF-8");
        conn.setRequestProperty("Authorization", "Basic "+authB64);
    }
    
    public List<String> read(List<String> fileNames) throws IOException {
		String resourcePath = System.getenv("CHARM_RESOURCE_PATH");
		
		if (resourcePath != null && resourcePath.length() > 0) {
			return readResources(fileNames, resourcePath);
		} else {
			return readFiles(fileNames);
		}
	}
    
    public String read(String fileName) throws IOException {
		String resourcePath = System.getenv("CHARM_RESOURCE_PATH");
		
		if (resourcePath != null && resourcePath.length() > 0) {
			return readResource(fileName, resourcePath);
		} else {
			return readFile(fileName);
		}
	}
    
    private String readFile(String fileName) throws IOException {
    	ResourceReader<String> reader = new FileResourceReaderAsString();
    	
    	return reader.readResource(fileName);
    }

	private List<String> readFiles(List<String> fileNames) throws IOException {
		ResourceReader<String> reader = new FileResourceReaderAsString();
		
		return reader.readAll(fileNames);
	}
	
	private String readResource(String resourceName, String resourcePath) throws IOException {
		ResourceReader<String> reader = getResourceReader(resourcePath);
		
		return reader.readResource(resourceName);
	}

	private List<String> readResources(List<String> resourceNames, String resourcePath) throws IOException {
		ResourceReader<String> reader = getResourceReader(resourcePath);
		
		return reader.readAll(resourceNames);
	}

	private ResourceReader<String> getResourceReader(String resourcePath) {
		ResourceReader<String> reader = null;
		
		if (resourcePath.startsWith("http")) {
			reader = new HttpResourceReaderAsString(resourcePath);
		} else {
			throw new IllegalArgumentException("Unsupported resource path: "+resourcePath);
		}
		return reader;
	}

	
	protected abstract class ResourceReader<R> {
		public abstract R readResource(String resourceName) throws IOException;
		
		public List<R> readAll(List<String> resourceNames) throws IOException {
			List<R> results = new ArrayList<>();
			
			for (String resourceName:resourceNames) {
				R r = this.readResource(resourceName);
				results.add(r);
			}
			
			return results;
		}
	}
	
	protected class FileResourceReaderAsString extends ResourceReader<String> {

		@Override
		public String readResource(String resourceName) throws IOException {
			Path p = Paths.get(resourceName);
			try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
				Files.copy(p, baos);
				
				return new String(baos.toByteArray(), "UTF-8"); //TODO ought to let caller specify the charset
			}
		}
	}
	
	protected class FileResourceReaderAsStream extends ResourceReader<DataStream> {

		@Override
		public DataStream readResource(String resourceName) throws IOException {
			Path p = Paths.get(resourceName);
			return new DataStream() {

				@Override
				public InputStream open() throws IOException {
					return new BufferedInputStream(Files.newInputStream(p));
				}
			};
		}
	}
	
	protected abstract class HttpResourceReader<R> extends ResourceReader<R> {
		protected final String resourcePath;
		
		protected HttpResourceReader(String resourcePath) {
			this.resourcePath = resourcePath;
		}

		@Override
		public R readResource(String resourceName) throws IOException {
			String resourceUrl;
			try {
				resourceUrl = this.resourcePath + URLEncoder.encode(resourceName, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				//shouldn't happen
				throw new RuntimeException(e);
			}
			
			URL url = new URL(resourceUrl);
			HttpURLConnection conn = null;
	        try {
	        	conn = (HttpURLConnection) url.openConnection();
	        	
	        	conn.setRequestMethod("GET");
	        	
	        	setTimeouts(conn);
	            setAuthHeader(conn);
	            
	        	conn.setDoOutput(true);
	        	
	        	int responseCode = conn.getResponseCode();
	        	if (responseCode != 200) {
	        		throw new IOException("Could not fetch specified resource [Response Code "+responseCode+"]");
	        	}
	        	
	        	try (InputStream in=conn.getInputStream()){
	        		return read(in);
	        	}
	        	
	        } finally {
	        	if (conn != null) {
	        		conn.disconnect();
	        	}
	        }
		}
		
		protected abstract R read(InputStream in) throws IOException;
	}
	
	protected class HttpResourceReaderAsString extends HttpResourceReader<String> {

		protected HttpResourceReaderAsString(String resourcePath) {
			super(resourcePath);
		}

		@Override
		protected String read(InputStream in) throws IOException {	
			try (ByteArrayOutputStream baos=new ByteArrayOutputStream()) {
				copy(in, baos);
				
				return new String(baos.toByteArray(), "UTF-8"); //TODO ought to let caller specify the charset
			}
		}
	}
	
	protected class HttpResourceReaderAsStream extends HttpResourceReader<DataStream> {
		protected HttpResourceReaderAsStream(String resourcePath) {
			super(resourcePath);
		}

		@Override
		protected DataStream read(InputStream in) throws IOException {	
			final Path tmpf = Files.createTempFile("http", null);
			
			Files.copy(in, tmpf, StandardCopyOption.REPLACE_EXISTING);
			
			return new DataStream() {
				
				@Override
				public InputStream open() throws IOException {
					return new BufferedInputStream(Files.newInputStream(tmpf));
				}
			};
		}
	}
}
