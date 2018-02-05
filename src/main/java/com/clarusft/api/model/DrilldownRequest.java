package com.clarusft.api.model;

public class DrilldownRequest extends ApiRequest {
	public DrilldownRequest() {
		super("Util", "Grid", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}
}
