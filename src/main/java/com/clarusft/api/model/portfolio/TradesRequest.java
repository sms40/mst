package com.clarusft.api.model.portfolio;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class TradesRequest extends com.clarusft.api.model.ApiRequest {
	public TradesRequest() {
		super("Portfolio", "Trades", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public TradesRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}


	public void setPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
	}

	public TradesRequest withPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
		return this;
	}

	public void setPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
	}

	public TradesRequest withPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
		return this;
	}


	public void setTradeAttributes(java.util.Collection<String> tradeAttributes) {
		setParameter("tradeAttributes", tradeAttributes);
	}

	public TradesRequest withTradeAttributes(java.util.Collection<String> tradeAttributes) {
		setParameter("tradeAttributes", tradeAttributes);
		return this;
	}

	public void setTradeAttributes(String... tradeAttributes) {
		setParameter("tradeAttributes", java.util.Arrays.asList(tradeAttributes));
	}

	public TradesRequest withTradeAttributes(String... tradeAttributes) {
		setParameter("tradeAttributes", java.util.Arrays.asList(tradeAttributes));
		return this;
	}


	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getPortfolios() {
		return (java.util.Collection<String>)getParameter("portfolios");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getTradeAttributes() {
		return (java.util.Collection<String>)getParameter("tradeAttributes");
	}


}