package com.clarusft.api.model.market;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FXRatesRequest extends com.clarusft.api.model.ApiRequest {
	public FXRatesRequest() {
		super("Market", "FXRates", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public FXRatesRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}

	public void setMarket(java.lang.String market) {
		setParameter("market", market);
	}

	public FXRatesRequest withMarket(java.lang.String market) {
		setParameter("market", market);
		return this;
	}


	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}

	public java.lang.String getMarket() {
		return (java.lang.String)getParameter("market");
	}


}