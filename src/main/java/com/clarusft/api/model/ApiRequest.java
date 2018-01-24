package com.clarusft.api.model;

import java.util.HashMap;
import java.util.Map;

public class ApiRequest {
	private final Map<String, Object> parameters = new HashMap<>();
	
	public static final String HTTP_POST = "POST";
	public static final String HTTP_GET = "GET";
	
	private String apiCategory, apiName, outputType, httpMethod;
	
	public ApiRequest() {
	}
		
	public ApiRequest(String apiCategory, String apiName) {
		this.apiCategory = apiCategory;
		this.apiName = apiName;
	}
	
	public ApiRequest(String apiCategory, String apiName, String outputType) {
		this.apiCategory = apiCategory;
		this.apiName = apiName;
		this.outputType = outputType;
	}
	
	public ApiRequest(String apiCategory, String apiName, String outputType, String httpMethod) {
		this.apiCategory = apiCategory;
		this.apiName = apiName;
		this.outputType = outputType;
		this.httpMethod = httpMethod;
	}
	
	public Map<String, Object> getParameters() {
		return parameters;
	}

	public void setParameter(String name, Object value) {
		this.parameters.put(name, value);
	}
	
	public Object getParameter(String name) {
		return this.parameters.get(name);
	}

	public String getApiCategory() {
		return apiCategory;
	}

	public void setApiCategory(String apiCategory) {
		this.apiCategory = apiCategory;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getOutputType() {
		return outputType;
	}

	public void setOutputType(String outputType) {
		this.outputType = outputType;
	}

	public String getHttpMethod() {
		return httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}
	
}
