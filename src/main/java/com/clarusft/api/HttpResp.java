package com.clarusft.api;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HttpResp {
	private int responseCode;
	private String responseBody;
	private final Map<String, List<String>> responseHeaders = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
	
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}
	public Map<String, List<String>> getResponseHeaders() {
		return responseHeaders;
	}
	public void setResponseHeaders(Map<String, List<String>> responseHeaders) {
		this.responseHeaders.clear();
		if (responseHeaders != null) {
			for (Map.Entry<String, List<String>> e:responseHeaders.entrySet()) {
				if (e.getKey() != null) {
					this.responseHeaders.put(e.getKey(), e.getValue());
				}
			}
			
		}
	}
	
	public String getFirstHeader(String headerName) {
		List<String> headers = responseHeaders.get(headerName);
		if (headers != null && headers.size() > 0) {
			return headers.get(0);
		} else {
			return null;
		}
	}
	
	@Override
	public String toString() {
		return "Response [code=" + responseCode + ", text=" + responseBody + "]";
	}
}