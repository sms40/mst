package com.clarusft.api.model.risk;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ThetaRequest extends com.clarusft.api.model.ApiRequest {
	public ThetaRequest() {
		super("Risk", "Theta", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
	}

	public ThetaRequest withPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
		return this;
	}

	public void setPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
	}

	public ThetaRequest withPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
		return this;
	}

	public void setWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
	}

	public ThetaRequest withWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
		return this;
	}

	public void setWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
	}

	public ThetaRequest withWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
		return this;
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public ThetaRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}

	public void setMarket(java.lang.String market) {
		setParameter("market", market);
	}

	public ThetaRequest withMarket(java.lang.String market) {
		setParameter("market", market);
		return this;
	}

	public void setMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
	}

	public ThetaRequest withMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
		return this;
	}

	public void setMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
	}

	public ThetaRequest withMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
		return this;
	}

	public void setScenarios(java.util.Collection<String> scenarios) {
		setParameter("scenarios", scenarios);
	}

	public ThetaRequest withScenarios(java.util.Collection<String> scenarios) {
		setParameter("scenarios", scenarios);
		return this;
	}

	public void setScenarios(String... scenarios) {
		setParameter("scenarios", java.util.Arrays.asList(scenarios));
	}

	public ThetaRequest withScenarios(String... scenarios) {
		setParameter("scenarios", java.util.Arrays.asList(scenarios));
		return this;
	}

	public void setNumDays(java.lang.Integer numDays) {
		setParameter("numDays", numDays);
	}

	public ThetaRequest withNumDays(java.lang.Integer numDays) {
		setParameter("numDays", numDays);
		return this;
	}

	public void setReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
	}

	public ThetaRequest withReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
		return this;
	}

	public void setRow(java.lang.String row) {
		setParameter("row", row);
	}

	public ThetaRequest withRow(java.lang.String row) {
		setParameter("row", row);
		return this;
	}

	public void setCol(java.lang.String col) {
		setParameter("col", col);
	}

	public ThetaRequest withCol(java.lang.String col) {
		setParameter("col", col);
		return this;
	}

	public void setTotalRow(java.lang.Boolean totalRow) {
		setParameter("totalRow", totalRow);
	}

	public ThetaRequest withTotalRow(java.lang.Boolean totalRow) {
		setParameter("totalRow", totalRow);
		return this;
	}

	public void setTotalCol(java.lang.Boolean totalCol) {
		setParameter("totalCol", totalCol);
	}

	public ThetaRequest withTotalCol(java.lang.Boolean totalCol) {
		setParameter("totalCol", totalCol);
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

	public java.lang.Integer getNumDays() {
		return (java.lang.Integer)getParameter("numDays");
	}

	public java.lang.String getReportCcy() {
		return (java.lang.String)getParameter("reportCcy");
	}

	public java.lang.String getRow() {
		return (java.lang.String)getParameter("row");
	}

	public java.lang.String getCol() {
		return (java.lang.String)getParameter("col");
	}

	public java.lang.Boolean getTotalRow() {
		return (java.lang.Boolean)getParameter("totalRow");
	}

	public java.lang.Boolean getTotalCol() {
		return (java.lang.Boolean)getParameter("totalCol");
	}


}