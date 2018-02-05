package com.clarusft.api.model.trade;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ConvertRequest extends com.clarusft.api.model.ApiRequest {
	public ConvertRequest() {
		super("Trade", "Convert", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setTrade(String trade) {
		setParameter("trade", trade);
	}

	public ConvertRequest withTrade(String trade) {
		setParameter("trade", trade);
		return this;
	}


	public void setFormat(String format) {
		setParameter("format", format);
	}

	public ConvertRequest withFormat(String format) {
		setParameter("format", format);
		return this;
	}


	public void setReverse(java.lang.Boolean reverse) {
		setParameter("reverse", reverse);
	}

	public ConvertRequest withReverse(java.lang.Boolean reverse) {
		setParameter("reverse", reverse);
		return this;
	}


	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public ConvertRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}


	public void setMarket(String market) {
		setParameter("market", market);
	}

	public ConvertRequest withMarket(String market) {
		setParameter("market", market);
		return this;
	}


	public void setVersion(java.lang.String version) {
		setParameter("version", version);
	}

	public ConvertRequest withVersion(java.lang.String version) {
		setParameter("version", version);
		return this;
	}


	public String getTrade() {
		return (String)getParameter("trade");
	}

	public String getFormat() {
		return (String)getParameter("format");
	}

	public java.lang.Boolean getReverse() {
		return (java.lang.Boolean)getParameter("reverse");
	}

	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}

	public String getMarket() {
		return (String)getParameter("market");
	}

	public java.lang.String getVersion() {
		return (java.lang.String)getParameter("version");
	}


}