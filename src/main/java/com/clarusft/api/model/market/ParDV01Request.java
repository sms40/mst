package com.clarusft.api.model.market;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ParDV01Request extends com.clarusft.api.model.ApiRequest {
	public ParDV01Request() {
		super("Market", "ParDV01", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setMarket(java.lang.String market) {
		setParameter("market", market);
	}

	public ParDV01Request withMarket(java.lang.String market) {
		setParameter("market", market);
		return this;
	}

	public void setCcys(java.util.Collection<String> ccys) {
		setParameter("ccys", ccys);
	}

	public ParDV01Request withCcys(java.util.Collection<String> ccys) {
		setParameter("ccys", ccys);
		return this;
	}

	public void setCcys(String... ccys) {
		setParameter("ccys", java.util.Arrays.asList(ccys));
	}

	public ParDV01Request withCcys(String... ccys) {
		setParameter("ccys", java.util.Arrays.asList(ccys));
		return this;
	}

	public void setLadder(java.lang.String ladder) {
		setParameter("ladder", ladder);
	}

	public ParDV01Request withLadder(java.lang.String ladder) {
		setParameter("ladder", ladder);
		return this;
	}

	public void setTenors(java.util.Collection<String> tenors) {
		setParameter("tenors", tenors);
	}

	public ParDV01Request withTenors(java.util.Collection<String> tenors) {
		setParameter("tenors", tenors);
		return this;
	}

	public void setTenors(String... tenors) {
		setParameter("tenors", java.util.Arrays.asList(tenors));
	}

	public ParDV01Request withTenors(String... tenors) {
		setParameter("tenors", java.util.Arrays.asList(tenors));
		return this;
	}

	public void setMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
	}

	public ParDV01Request withMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
		return this;
	}

	public void setMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
	}

	public ParDV01Request withMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
		return this;
	}


	public java.lang.String getMarket() {
		return (java.lang.String)getParameter("market");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getCcys() {
		return (java.util.Collection<String>)getParameter("ccys");
	}

	public java.lang.String getLadder() {
		return (java.lang.String)getParameter("ladder");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getTenors() {
		return (java.util.Collection<String>)getParameter("tenors");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getMarketData() {
		return (java.util.Collection<String>)getParameter("marketData");
	}


}