package com.clarusft.api.model.simm;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class SensitivityRequest extends com.clarusft.api.model.ApiRequest {
	public SensitivityRequest() {
		super("SIMM", "Sensitivity", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public SensitivityRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}


	public void setTrades(String trades) {
		setParameter("trades", trades);
	}

	public SensitivityRequest withTrades(String trades) {
		setParameter("trades", trades);
		return this;
	}


	public void setAggregationLevel(String aggregationLevel) {
		setParameter("aggregationLevel", aggregationLevel);
	}

	public SensitivityRequest withAggregationLevel(String aggregationLevel) {
		setParameter("aggregationLevel", aggregationLevel);
		return this;
	}


	public void setPortfolioID(java.lang.String portfolioID) {
		setParameter("portfolioID", portfolioID);
	}

	public SensitivityRequest withPortfolioID(java.lang.String portfolioID) {
		setParameter("portfolioID", portfolioID);
		return this;
	}


	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}

	public String getTrades() {
		return (String)getParameter("trades");
	}

	public String getAggregationLevel() {
		return (String)getParameter("aggregationLevel");
	}

	public java.lang.String getPortfolioID() {
		return (java.lang.String)getParameter("portfolioID");
	}


}