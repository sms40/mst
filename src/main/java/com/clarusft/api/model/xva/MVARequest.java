package com.clarusft.api.model.xva;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class MVARequest extends com.clarusft.api.model.ApiRequest {
	public MVARequest() {
		super("XVA", "MVA", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
	}

	public MVARequest withPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
		return this;
	}

	public void setPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
	}

	public MVARequest withPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
		return this;
	}

	public void setWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
	}

	public MVARequest withWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
		return this;
	}

	public void setWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
	}

	public MVARequest withWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
		return this;
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public MVARequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}

	public void setMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
	}

	public MVARequest withMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
		return this;
	}

	public void setMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
	}

	public MVARequest withMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
		return this;
	}

	public void setModel(java.lang.String model) {
		setParameter("model", model);
	}

	public MVARequest withModel(java.lang.String model) {
		setParameter("model", model);
		return this;
	}

	public void setHouseClient(String houseClient) {
		setParameter("houseClient", houseClient);
	}

	public MVARequest withHouseClient(String houseClient) {
		setParameter("houseClient", houseClient);
		return this;
	}

	public void setMultiplier(java.lang.Double multiplier) {
		setParameter("multiplier", multiplier);
	}

	public MVARequest withMultiplier(java.lang.Double multiplier) {
		setParameter("multiplier", multiplier);
		return this;
	}

	public void setAddons(java.lang.Boolean addons) {
		setParameter("addons", addons);
	}

	public MVARequest withAddons(java.lang.Boolean addons) {
		setParameter("addons", addons);
		return this;
	}

	public void setScenarios(java.util.Collection<String> scenarios) {
		setParameter("scenarios", scenarios);
	}

	public MVARequest withScenarios(java.util.Collection<String> scenarios) {
		setParameter("scenarios", scenarios);
		return this;
	}

	public void setScenarios(String... scenarios) {
		setParameter("scenarios", java.util.Arrays.asList(scenarios));
	}

	public MVARequest withScenarios(String... scenarios) {
		setParameter("scenarios", java.util.Arrays.asList(scenarios));
		return this;
	}

	public void setAgePortfolio(java.lang.Boolean agePortfolio) {
		setParameter("agePortfolio", agePortfolio);
	}

	public MVARequest withAgePortfolio(java.lang.Boolean agePortfolio) {
		setParameter("agePortfolio", agePortfolio);
		return this;
	}

	public void setLadder(java.lang.String ladder) {
		setParameter("ladder", ladder);
	}

	public MVARequest withLadder(java.lang.String ladder) {
		setParameter("ladder", ladder);
		return this;
	}

	public void setReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
	}

	public MVARequest withReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
		return this;
	}

	public void setRow(java.lang.String row) {
		setParameter("row", row);
	}

	public MVARequest withRow(java.lang.String row) {
		setParameter("row", row);
		return this;
	}

	public void setTotalRow(java.lang.Boolean totalRow) {
		setParameter("totalRow", totalRow);
	}

	public MVARequest withTotalRow(java.lang.Boolean totalRow) {
		setParameter("totalRow", totalRow);
		return this;
	}

	public void setFundingSpread(java.lang.Double fundingSpread) {
		setParameter("fundingSpread", fundingSpread);
	}

	public MVARequest withFundingSpread(java.lang.Double fundingSpread) {
		setParameter("fundingSpread", fundingSpread);
		return this;
	}

	public void setUnits(java.lang.String units) {
		setParameter("units", units);
	}

	public MVARequest withUnits(java.lang.String units) {
		setParameter("units", units);
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

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getMarketData() {
		return (java.util.Collection<String>)getParameter("marketData");
	}

	public java.lang.String getModel() {
		return (java.lang.String)getParameter("model");
	}

	public String getHouseClient() {
		return (String)getParameter("houseClient");
	}

	public java.lang.Double getMultiplier() {
		return (java.lang.Double)getParameter("multiplier");
	}

	public java.lang.Boolean getAddons() {
		return (java.lang.Boolean)getParameter("addons");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getScenarios() {
		return (java.util.Collection<String>)getParameter("scenarios");
	}

	public java.lang.Boolean getAgePortfolio() {
		return (java.lang.Boolean)getParameter("agePortfolio");
	}

	public java.lang.String getLadder() {
		return (java.lang.String)getParameter("ladder");
	}

	public java.lang.String getReportCcy() {
		return (java.lang.String)getParameter("reportCcy");
	}

	public java.lang.String getRow() {
		return (java.lang.String)getParameter("row");
	}

	public java.lang.Boolean getTotalRow() {
		return (java.lang.Boolean)getParameter("totalRow");
	}

	public java.lang.Double getFundingSpread() {
		return (java.lang.Double)getParameter("fundingSpread");
	}

	public java.lang.String getUnits() {
		return (java.lang.String)getParameter("units");
	}


}