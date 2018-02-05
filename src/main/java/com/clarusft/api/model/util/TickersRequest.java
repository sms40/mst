package com.clarusft.api.model.util;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class TickersRequest extends com.clarusft.api.model.ApiRequest {
	public TickersRequest() {
		super("Util", "Tickers", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setCurrency(String currency) {
		setParameter("currency", currency);
	}

	public TickersRequest withCurrency(String currency) {
		setParameter("currency", currency);
		return this;
	}


	public String getCurrency() {
		return (String)getParameter("currency");
	}


}