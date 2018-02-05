package com.clarusft.api.model.load;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class MarketRequest extends com.clarusft.api.model.ApiRequest {
	public MarketRequest() {
		super("Load", "Market", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setMarketId(java.lang.String marketId) {
		setParameter("marketId", marketId);
	}

	public MarketRequest withMarketId(java.lang.String marketId) {
		setParameter("marketId", marketId);
		return this;
	}


	public void setMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
	}

	public MarketRequest withMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
		return this;
	}

	public void setMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
	}

	public MarketRequest withMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
		return this;
	}


	public void setMarket(java.lang.String market) {
		setParameter("market", market);
	}

	public MarketRequest withMarket(java.lang.String market) {
		setParameter("market", market);
		return this;
	}


	public java.lang.String getMarketId() {
		return (java.lang.String)getParameter("marketId");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getMarketData() {
		return (java.util.Collection<String>)getParameter("marketData");
	}

	public java.lang.String getMarket() {
		return (java.lang.String)getParameter("market");
	}


}