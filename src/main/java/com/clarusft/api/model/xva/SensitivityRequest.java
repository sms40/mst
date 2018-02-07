package com.clarusft.api.model.xva;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class SensitivityRequest extends com.clarusft.api.model.ApiRequest {
	public SensitivityRequest() {
		super("XVA", "Sensitivity", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
	}

	public SensitivityRequest withPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
		return this;
	}

	public void setPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
	}

	public SensitivityRequest withPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
		return this;
	}

	public void setWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
	}

	public SensitivityRequest withWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
		return this;
	}

	public void setWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
	}

	public SensitivityRequest withWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
		return this;
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public SensitivityRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}

	public void setMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
	}

	public SensitivityRequest withMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
		return this;
	}

	public void setMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
	}

	public SensitivityRequest withMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
		return this;
	}

	public void setModel(java.lang.String model) {
		setParameter("model", model);
	}

	public SensitivityRequest withModel(java.lang.String model) {
		setParameter("model", model);
		return this;
	}

	public void setHouseClient(String houseClient) {
		setParameter("houseClient", houseClient);
	}

	public SensitivityRequest withHouseClient(String houseClient) {
		setParameter("houseClient", houseClient);
		return this;
	}

	public void setMultiplier(java.lang.Double multiplier) {
		setParameter("multiplier", multiplier);
	}

	public SensitivityRequest withMultiplier(java.lang.Double multiplier) {
		setParameter("multiplier", multiplier);
		return this;
	}

	public void setAddons(java.lang.Boolean addons) {
		setParameter("addons", addons);
	}

	public SensitivityRequest withAddons(java.lang.Boolean addons) {
		setParameter("addons", addons);
		return this;
	}

	public void setShiftFactor(java.lang.String shiftFactor) {
		setParameter("shiftFactor", shiftFactor);
	}

	public SensitivityRequest withShiftFactor(java.lang.String shiftFactor) {
		setParameter("shiftFactor", shiftFactor);
		return this;
	}

	public void setShift(java.lang.Integer shift) {
		setParameter("shift", shift);
	}

	public SensitivityRequest withShift(java.lang.Integer shift) {
		setParameter("shift", shift);
		return this;
	}

	public void setAgePortfolio(java.lang.Boolean agePortfolio) {
		setParameter("agePortfolio", agePortfolio);
	}

	public SensitivityRequest withAgePortfolio(java.lang.Boolean agePortfolio) {
		setParameter("agePortfolio", agePortfolio);
		return this;
	}

	public void setLadder(java.lang.String ladder) {
		setParameter("ladder", ladder);
	}

	public SensitivityRequest withLadder(java.lang.String ladder) {
		setParameter("ladder", ladder);
		return this;
	}

	public void setReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
	}

	public SensitivityRequest withReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
		return this;
	}

	public void setRow(java.lang.String row) {
		setParameter("row", row);
	}

	public SensitivityRequest withRow(java.lang.String row) {
		setParameter("row", row);
		return this;
	}

	public void setTotalRow(java.lang.Boolean totalRow) {
		setParameter("totalRow", totalRow);
	}

	public SensitivityRequest withTotalRow(java.lang.Boolean totalRow) {
		setParameter("totalRow", totalRow);
		return this;
	}

	public void setFundingSpread(java.lang.Double fundingSpread) {
		setParameter("fundingSpread", fundingSpread);
	}

	public SensitivityRequest withFundingSpread(java.lang.Double fundingSpread) {
		setParameter("fundingSpread", fundingSpread);
		return this;
	}

	public void setUnits(java.lang.String units) {
		setParameter("units", units);
	}

	public SensitivityRequest withUnits(java.lang.String units) {
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

	public java.lang.String getShiftFactor() {
		return (java.lang.String)getParameter("shiftFactor");
	}

	public java.lang.Integer getShift() {
		return (java.lang.Integer)getParameter("shift");
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