package com.clarusft.api.model.market;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class DFRequest extends com.clarusft.api.model.ApiRequest {
	public DFRequest() {
		super("Market", "DF", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public DFRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}


	public void setMarket(java.lang.String market) {
		setParameter("market", market);
	}

	public DFRequest withMarket(java.lang.String market) {
		setParameter("market", market);
		return this;
	}


	public void setMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
	}

	public DFRequest withMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
		return this;
	}

	public void setMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
	}

	public DFRequest withMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
		return this;
	}


	public void setCcys(java.util.Collection<String> ccys) {
		setParameter("ccys", ccys);
	}

	public DFRequest withCcys(java.util.Collection<String> ccys) {
		setParameter("ccys", ccys);
		return this;
	}

	public void setCcys(String... ccys) {
		setParameter("ccys", java.util.Arrays.asList(ccys));
	}

	public DFRequest withCcys(String... ccys) {
		setParameter("ccys", java.util.Arrays.asList(ccys));
		return this;
	}


	public void setFilter(java.lang.String filter) {
		setParameter("filter", filter);
	}

	public DFRequest withFilter(java.lang.String filter) {
		setParameter("filter", filter);
		return this;
	}


	public void setLadder(java.lang.String ladder) {
		setParameter("ladder", ladder);
	}

	public DFRequest withLadder(java.lang.String ladder) {
		setParameter("ladder", ladder);
		return this;
	}


	public void setTenors(java.util.Collection<String> tenors) {
		setParameter("tenors", tenors);
	}

	public DFRequest withTenors(java.util.Collection<String> tenors) {
		setParameter("tenors", tenors);
		return this;
	}

	public void setTenors(String... tenors) {
		setParameter("tenors", java.util.Arrays.asList(tenors));
	}

	public DFRequest withTenors(String... tenors) {
		setParameter("tenors", java.util.Arrays.asList(tenors));
		return this;
	}


	public void setNumYears(java.lang.Integer numYears) {
		setParameter("numYears", numYears);
	}

	public DFRequest withNumYears(java.lang.Integer numYears) {
		setParameter("numYears", numYears);
		return this;
	}


	public void setRow(java.lang.String row) {
		setParameter("row", row);
	}

	public DFRequest withRow(java.lang.String row) {
		setParameter("row", row);
		return this;
	}


	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}

	public java.lang.String getMarket() {
		return (java.lang.String)getParameter("market");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getMarketData() {
		return (java.util.Collection<String>)getParameter("marketData");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getCcys() {
		return (java.util.Collection<String>)getParameter("ccys");
	}

	public java.lang.String getFilter() {
		return (java.lang.String)getParameter("filter");
	}

	public java.lang.String getLadder() {
		return (java.lang.String)getParameter("ladder");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getTenors() {
		return (java.util.Collection<String>)getParameter("tenors");
	}

	public java.lang.Integer getNumYears() {
		return (java.lang.Integer)getParameter("numYears");
	}

	public java.lang.String getRow() {
		return (java.lang.String)getParameter("row");
	}


}