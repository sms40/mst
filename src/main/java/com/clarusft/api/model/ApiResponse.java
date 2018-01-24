package com.clarusft.api.model;

import java.util.HashMap;
import java.util.Map;

import com.clarusft.api.HttpResp;

public class ApiResponse {
	private HttpResp httpResponse;
	private Map<String,String> stats = new HashMap<>();
	
	public HttpResp getHttpResponse() {
		return httpResponse;
	}
	public void setHttpResponse(HttpResp httpResponse) {
		this.httpResponse = httpResponse;
	}
	public Map<String, String> getStats() {
		return stats;
	}
	public void setStats(Map<String, String> stats) {
		this.stats.clear();
		if (stats != null) {
			this.stats.putAll(stats);
		}
	}
}
