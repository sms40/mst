package com.clarusft.api.model;

public class PivotRequest extends ApiRequest {
	public PivotRequest() {
		super("Util", "Grid", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}
}
