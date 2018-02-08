package com.clarusft.api.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clarusft.api.http.HttpResp;

public class ApiResponse implements HasStats, HasAttributes {
	private HttpResp httpResponse;
	private Map<String,String> stats = new HashMap<>();
	private final Map<String, Object> attributes = new HashMap<>();
	
	public HttpResp getHttpResponse() {
		return httpResponse;
	}
	public void setHttpResponse(HttpResp httpResponse) {
		this.httpResponse = httpResponse;
	}
	@Override
	public Map<String, String> getStats() {
		return stats;
	}
	public void setStats(Map<String, String> stats) {
		this.stats.clear();
		if (stats != null) {
			this.stats.putAll(stats);
		}
	}

	@Override
	public void setAttribute(String key, Object attribute) {
		this.attributes.put(key, attribute);
	}

	@Override
	public Object getAttribute(String key) {
		return this.attributes.get(key);
	}
	
	@Override
	public String toString() {
		return httpResponse != null ? httpResponse.toString() : null;
	}
	
	public String getWarnings() {
		if (httpResponse != null) {
			Map<String, List<String>> headers = httpResponse.getResponseHeaders();
			if (headers.containsKey("X-Clarus-Messages")) {
				List<String> messages = headers.get("X-Clarus-Messages");
				if (messages != null && !messages.isEmpty()) {
					return messages.get(0);
				}
			}
		}

		return null;
	}
	
	public double getRequestTime() {
		return getRequestTimeMs() / 1000.0;
	}
	
	public long getRequestTimeMs() {
		if (httpResponse != null) {
			return httpResponse.getElapsedTimeMs();
		} else {
			return 0;
		}
	}
}
