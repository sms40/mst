package com.clarusft.api.model.compliance;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class SEFMandatoryRequest extends com.clarusft.api.model.ApiRequest {
	public SEFMandatoryRequest() {
		super("Compliance", "SEFMandatory", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setTrade(String trade) {
		setParameter("trade", trade);
	}

	public SEFMandatoryRequest withTrade(String trade) {
		setParameter("trade", trade);
		return this;
	}


	public String getTrade() {
		return (String)getParameter("trade");
	}


}