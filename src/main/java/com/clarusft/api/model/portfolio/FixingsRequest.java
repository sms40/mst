package com.clarusft.api.model.portfolio;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FixingsRequest extends com.clarusft.api.model.ApiRequest {
	public FixingsRequest() {
		super("Portfolio", "Fixings", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
	}

	public FixingsRequest withPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
		return this;
	}

	public void setPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
	}

	public FixingsRequest withPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
		return this;
	}

	public void setWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
	}

	public FixingsRequest withWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
		return this;
	}

	public void setWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
	}

	public FixingsRequest withWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
		return this;
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public FixingsRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}

	public void setMarket(java.lang.String market) {
		setParameter("market", market);
	}

	public FixingsRequest withMarket(java.lang.String market) {
		setParameter("market", market);
		return this;
	}

	public void setMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
	}

	public FixingsRequest withMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
		return this;
	}

	public void setMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
	}

	public FixingsRequest withMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
		return this;
	}

	public void setReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
	}

	public FixingsRequest withReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
		return this;
	}

	public void setRow(java.lang.String row) {
		setParameter("row", row);
	}

	public FixingsRequest withRow(java.lang.String row) {
		setParameter("row", row);
		return this;
	}

	public void setCol(java.lang.String col) {
		setParameter("col", col);
	}

	public FixingsRequest withCol(java.lang.String col) {
		setParameter("col", col);
		return this;
	}

	public void setTotalRow(java.lang.Boolean totalRow) {
		setParameter("totalRow", totalRow);
	}

	public FixingsRequest withTotalRow(java.lang.Boolean totalRow) {
		setParameter("totalRow", totalRow);
		return this;
	}

	public void setTotalCol(java.lang.Boolean totalCol) {
		setParameter("totalCol", totalCol);
	}

	public FixingsRequest withTotalCol(java.lang.Boolean totalCol) {
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