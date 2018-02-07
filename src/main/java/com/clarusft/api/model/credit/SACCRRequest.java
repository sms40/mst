package com.clarusft.api.model.credit;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class SACCRRequest extends com.clarusft.api.model.ApiRequest {
	public SACCRRequest() {
		super("Credit", "SACCR", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
	}

	public SACCRRequest withPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
		return this;
	}

	public void setPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
	}

	public SACCRRequest withPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
		return this;
	}

	public void setWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
	}

	public SACCRRequest withWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
		return this;
	}

	public void setWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
	}

	public SACCRRequest withWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
		return this;
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public SACCRRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}

	public void setMarket(java.lang.String market) {
		setParameter("market", market);
	}

	public SACCRRequest withMarket(java.lang.String market) {
		setParameter("market", market);
		return this;
	}

	public void setMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
	}

	public SACCRRequest withMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
		return this;
	}

	public void setMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
	}

	public SACCRRequest withMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
		return this;
	}

	public void setScenarios(java.util.Collection<String> scenarios) {
		setParameter("scenarios", scenarios);
	}

	public SACCRRequest withScenarios(java.util.Collection<String> scenarios) {
		setParameter("scenarios", scenarios);
		return this;
	}

	public void setScenarios(String... scenarios) {
		setParameter("scenarios", java.util.Arrays.asList(scenarios));
	}

	public SACCRRequest withScenarios(String... scenarios) {
		setParameter("scenarios", java.util.Arrays.asList(scenarios));
		return this;
	}

	public void setOffsetMaturities(java.lang.Boolean offsetMaturities) {
		setParameter("offsetMaturities", offsetMaturities);
	}

	public SACCRRequest withOffsetMaturities(java.lang.Boolean offsetMaturities) {
		setParameter("offsetMaturities", offsetMaturities);
		return this;
	}

	public void setReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
	}

	public SACCRRequest withReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
		return this;
	}


	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getPortfolios() {
		return (java.util.Collection<String>)getParameter("portfolios");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getWhatif() {
		return (java.util.Collection<String>)getParameter("whatif");
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
	public java.util.Collection<String> getScenarios() {
		return (java.util.Collection<String>)getParameter("scenarios");
	}

	public java.lang.Boolean getOffsetMaturities() {
		return (java.lang.Boolean)getParameter("offsetMaturities");
	}

	public java.lang.String getReportCcy() {
		return (java.lang.String)getParameter("reportCcy");
	}


}