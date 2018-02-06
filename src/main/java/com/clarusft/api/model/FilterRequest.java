package com.clarusft.api.model;

public class FilterRequest extends ApiRequest {
	public FilterRequest() {
		super("Util", "Grid", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}
}
