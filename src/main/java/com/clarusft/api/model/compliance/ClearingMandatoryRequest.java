package com.clarusft.api.model.compliance;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ClearingMandatoryRequest extends com.clarusft.api.model.ApiRequest {
	public ClearingMandatoryRequest() {
		super("Compliance", "ClearingMandatory", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
	}

	public void setTrade(String trade) {
		setParameter("trade", trade);
	}

	public ClearingMandatoryRequest withTrade(String trade) {
		setParameter("trade", trade);
		return this;
	}


	public void setCountry(String country) {
		setParameter("country", country);
	}

	public ClearingMandatoryRequest withCountry(String country) {
		setParameter("country", country);
		return this;
	}


	public String getTrade() {
		return (String)getParameter("trade");
	}

	public String getCountry() {
		return (String)getParameter("country");
	}


}