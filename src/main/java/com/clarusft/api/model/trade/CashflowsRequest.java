package com.clarusft.api.model.trade;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class CashflowsRequest extends com.clarusft.api.model.ApiRequest {
	public CashflowsRequest() {
		super("Trade", "Cashflows", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
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

	public void setMarket(String market) {
		setParameter("market", market);
	}

	public CashflowsRequest withMarket(String market) {
		setParameter("market", market);
		return this;
	}

	public void setMarketData(String marketData) {
		setParameter("marketData", marketData);
	}

	public CashflowsRequest withMarketData(String marketData) {
		setParameter("marketData", marketData);
		return this;
	}

	public void setIdFilter(java.lang.String idFilter) {
		setParameter("idFilter", idFilter);
	}

	public CashflowsRequest withIdFilter(java.lang.String idFilter) {
		setParameter("idFilter", idFilter);
		return this;
	}

	public void setView(String view) {
		setParameter("view", view);
	}

	public CashflowsRequest withView(String view) {
		setParameter("view", view);
		return this;
	}


	public String getTrade() {
		return (String)getParameter("trade");
	}

	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}

	public String getMarket() {
		return (String)getParameter("market");
	}

	public String getMarketData() {
		return (String)getParameter("marketData");
	}

	public java.lang.String getIdFilter() {
		return (java.lang.String)getParameter("idFilter");
	}

	public String getView() {
		return (String)getParameter("view");
	}


}