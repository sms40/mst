package com.clarusft.api.model.market;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class CurveUsageRequest extends com.clarusft.api.model.ApiRequest {
	public CurveUsageRequest() {
		super("Market", "CurveUsage", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public CurveUsageRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}


	public void setMarket(String market) {
		setParameter("market", market);
	}

	public CurveUsageRequest withMarket(String market) {
		setParameter("market", market);
		return this;
	}


	public void setCurrency(String currency) {
		setParameter("currency", currency);
	}

	public CurveUsageRequest withCurrency(String currency) {
		setParameter("currency", currency);
		return this;
	}


	public void setFormat(String format) {
		setParameter("Format", format);
	}

	public CurveUsageRequest withFormat(String format) {
		setParameter("Format", format);
		return this;
	}


	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}

	public String getMarket() {
		return (String)getParameter("market");
	}

	public String getCurrency() {
		return (String)getParameter("currency");
	}

	public String getFormat() {
		return (String)getParameter("Format");
	}


}