package com.clarusft.api.model.trade;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class PriceRequest extends com.clarusft.api.model.ApiRequest {
	public PriceRequest() {
		super("Trade", "Price", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setTrade(String trade) {
		setParameter("trade", trade);
	}

	public PriceRequest withTrade(String trade) {
		setParameter("trade", trade);
		return this;
	}


	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public PriceRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}


	public void setMeasures(String measures) {
		setParameter("measures", measures);
	}

	public PriceRequest withMeasures(String measures) {
		setParameter("measures", measures);
		return this;
	}


	public void setMarket(String market) {
		setParameter("market", market);
	}

	public PriceRequest withMarket(String market) {
		setParameter("market", market);
		return this;
	}


	public void setMarketData(String marketData) {
		setParameter("marketData", marketData);
	}

	public PriceRequest withMarketData(String marketData) {
		setParameter("marketData", marketData);
		return this;
	}


	public String getTrade() {
		return (String)getParameter("trade");
	}

	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}

	public String getMeasures() {
		return (String)getParameter("measures");
	}

	public String getMarket() {
		return (String)getParameter("market");
	}

	public String getMarketData() {
		return (String)getParameter("marketData");
	}


}