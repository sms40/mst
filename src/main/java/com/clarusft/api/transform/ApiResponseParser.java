package com.clarusft.api.transform;

import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.ApiResponse;

public abstract class ApiResponseParser<RESP extends ApiResponse> {
	public RESP parse(HttpResp httpResp, RESP resp) throws IOException {
		if (resp != null) {
			resp.setHttpResponse(httpResp);
			
			String statsStr = httpResp.getFirstHeader("X-Clarus-Stats");
			if (statsStr != null) {
				Map<String,String> stats = toMap(statsStr);
				resp.setStats(stats);				
			}
		}
		
		return resp;
	}

	protected static Map<String, String> toMap(String s) {
		Map<String, String> m = Pattern.compile("\\s*;\\s*").splitAsStream(s).map(str -> str.split("=", 2)).collect(Collectors.toMap(arr -> arr[0], arr -> arr.length > 1 ? arr[1] : null));
		return m;
	}
	
	public static void main(String[] args) {
		String s = "A=10;B=30";
		Map<String, String> m = toMap(s);
		
		System.out.println(m);
	}
}
