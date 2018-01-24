package com.clarusft.api.model.trade;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ConvertRequest extends com.clarusft.api.model.ApiRequest {
	public ConvertRequest() {
		super("Trade", "Convert", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
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


	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public ConvertRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}


	public String getTrade() {
		return (String)getParameter("trade");
	}

	public String getFormat() {
		return (String)getParameter("format");
	}

	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}


}