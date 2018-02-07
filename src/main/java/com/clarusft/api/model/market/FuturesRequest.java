package com.clarusft.api.model.market;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FuturesRequest extends com.clarusft.api.model.ApiRequest {
	public FuturesRequest() {
		super("Market", "Futures", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setExchange(java.lang.String exchange) {
		setParameter("exchange", exchange);
	}

	public FuturesRequest withExchange(java.lang.String exchange) {
		setParameter("exchange", exchange);
		return this;
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public FuturesRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}

	public void setMarket(String market) {
		setParameter("market", market);
	}

	public FuturesRequest withMarket(String market) {
		setParameter("market", market);
		return this;
	}


	public java.lang.String getExchange() {
		return (java.lang.String)getParameter("exchange");
	}

	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}

	public String getMarket() {
		return (String)getParameter("market");
	}


}