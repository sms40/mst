package com.clarusft.api.model;

public class TransposeRequest extends ApiRequest {
	public TransposeRequest() {
		super("Util", "Grid", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}
}
