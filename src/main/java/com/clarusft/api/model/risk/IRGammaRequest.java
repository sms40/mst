package com.clarusft.api.model.risk;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class IRGammaRequest extends com.clarusft.api.model.ApiRequest {
	public IRGammaRequest() {
		super("Risk", "IRGamma", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
	}

	public IRGammaRequest withPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
		return this;
	}

	public void setPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
	}

	public IRGammaRequest withPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
		return this;
	}

	public void setWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
	}

	public IRGammaRequest withWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
		return this;
	}

	public void setWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
	}

	public IRGammaRequest withWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
		return this;
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public IRGammaRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}

	public void setMarket(java.lang.String market) {
		setParameter("market", market);
	}

	public IRGammaRequest withMarket(java.lang.String market) {
		setParameter("market", market);
		return this;
	}

	public void setMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
	}

	public IRGammaRequest withMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
		return this;
	}

	public void setMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
	}

	public IRGammaRequest withMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
		return this;
	}

	public void setShift(java.lang.String shift) {
		setParameter("shift", shift);
	}

	public IRGammaRequest withShift(java.lang.String shift) {
		setParameter("shift", shift);
		return this;
	}

	public void setLadder(java.lang.String ladder) {
		setParameter("ladder", ladder);
	}

	public IRGammaRequest withLadder(java.lang.String ladder) {
		setParameter("ladder", ladder);
		return this;
	}

	public void setTenors(java.util.Collection<String> tenors) {
		setParameter("tenors", tenors);
	}

	public IRGammaRequest withTenors(java.util.Collection<String> tenors) {
		setParameter("tenors", tenors);
		return this;
	}

	public void setTenors(String... tenors) {
		setParameter("tenors", java.util.Arrays.asList(tenors));
	}

	public IRGammaRequest withTenors(String... tenors) {
		setParameter("tenors", java.util.Arrays.asList(tenors));
		return this;
	}

	public void setScenarios(java.util.Collection<String> scenarios) {
		setParameter("scenarios", scenarios);
	}

	public IRGammaRequest withScenarios(java.util.Collection<String> scenarios) {
		setParameter("scenarios", scenarios);
		return this;
	}

	public void setScenarios(String... scenarios) {
		setParameter("scenarios", java.util.Arrays.asList(scenarios));
	}

	public IRGammaRequest withScenarios(String... scenarios) {
		setParameter("scenarios", java.util.Arrays.asList(scenarios));
		return this;
	}

	public void setReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
	}

	public IRGammaRequest withReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
		return this;
	}

	public void setRow(java.lang.String row) {
		setParameter("row", row);
	}

	public IRGammaRequest withRow(java.lang.String row) {
		setParameter("row", row);
		return this;
	}

	public void setCol(java.lang.String col) {
		setParameter("col", col);
	}

	public IRGammaRequest withCol(java.lang.String col) {
		setParameter("col", col);
		return this;
	}

	public void setTotalRow(java.lang.Boolean totalRow) {
		setParameter("totalRow", totalRow);
	}

	public IRGammaRequest withTotalRow(java.lang.Boolean totalRow) {
		setParameter("totalRow", totalRow);
		return this;
	}

	public void setTotalCol(java.lang.Boolean totalCol) {
		setParameter("totalCol", totalCol);
	}

	public IRGammaRequest withTotalCol(java.lang.Boolean totalCol) {
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

	public java.lang.String getShift() {
		return (java.lang.String)getParameter("shift");
	}

	public java.lang.String getLadder() {
		return (java.lang.String)getParameter("ladder");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getTenors() {
		return (java.util.Collection<String>)getParameter("tenors");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getScenarios() {
		return (java.util.Collection<String>)getParameter("scenarios");
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