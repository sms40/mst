package com.clarusft.api.model.trade;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class PriceRequest extends com.clarusft.api.model.ApiRequest {
	public PriceRequest() {
		super("Trade", "Price", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
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


	public String getTrade() {
		return (String)getParameter("trade");
	}

	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}

	public String getMeasures() {
		return (String)getParameter("measures");
	}


}