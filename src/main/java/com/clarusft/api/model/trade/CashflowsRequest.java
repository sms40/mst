package com.clarusft.api.model.trade;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class CashflowsRequest extends com.clarusft.api.model.ApiRequest {
	public CashflowsRequest() {
		super("Trade", "Cashflows", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
	}

	public void setTrade(String trade) {
		setParameter("trade", trade);
	}

	public CashflowsRequest withTrade(String trade) {
		setParameter("trade", trade);
		return this;
	}


	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public CashflowsRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}


	public String getTrade() {
		return (String)getParameter("trade");
	}

	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}


}