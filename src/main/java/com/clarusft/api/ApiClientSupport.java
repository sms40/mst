package com.clarusft.api;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

import com.clarusft.api.model.ApiRequest;
import com.clarusft.api.model.ApiResponse;
import com.clarusft.api.transform.ApiResponseParser;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

@ThreadSafe
public class ApiClientSupport {
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
			
			return parser.parse(resp, null);
		} catch (IOException e) {
			throw new ApiException("Error making API request", e);
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
	}
	
	protected void readResponse(HttpURLConnection conn, HttpResp resp) throws IOException {
		resp.setResponseCode(conn.getResponseCode());
		resp.setResponseHeaders(conn.getHeaderFields());
		
        try (ByteArrayOutputStream responseOut = new ByteArrayOutputStream()) {
        	try {
        		copy(conn.getInputStream(), responseOut);
        	} catch (IOException e) {
        		 copy(conn.getErrorStream(), responseOut);
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
}
