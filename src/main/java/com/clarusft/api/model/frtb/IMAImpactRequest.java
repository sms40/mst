package com.clarusft.api.model.frtb;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class IMAImpactRequest extends com.clarusft.api.model.ApiRequest {
	public IMAImpactRequest() {
		super("FRTB", "IMAImpact", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
	}

	public IMAImpactRequest withPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
		return this;
	}

	public void setPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
	}

	public IMAImpactRequest withPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
		return this;
	}


	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public IMAImpactRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}


	public void setMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
	}

	public IMAImpactRequest withMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
		return this;
	}

	public void setMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
	}

	public IMAImpactRequest withMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
		return this;
	}


	public void setParSwapLadder(java.lang.String parSwapLadder) {
		setParameter("parSwapLadder", parSwapLadder);
	}

	public IMAImpactRequest withParSwapLadder(java.lang.String parSwapLadder) {
		setParameter("parSwapLadder", parSwapLadder);
		return this;
	}


	public void setProduct(java.lang.String product) {
		setParameter("product", product);
	}

	public IMAImpactRequest withProduct(java.lang.String product) {
		setParameter("product", product);
		return this;
	}


	public void setNotionalSizes(java.util.Collection<String> notionalSizes) {
		setParameter("notionalSizes", notionalSizes);
	}

	public IMAImpactRequest withNotionalSizes(java.util.Collection<String> notionalSizes) {
		setParameter("notionalSizes", notionalSizes);
		return this;
	}

	public void setNotionalSizes(String... notionalSizes) {
		setParameter("notionalSizes", java.util.Arrays.asList(notionalSizes));
	}

	public IMAImpactRequest withNotionalSizes(String... notionalSizes) {
		setParameter("notionalSizes", java.util.Arrays.asList(notionalSizes));
		return this;
	}


	public void setDv01Sizes(java.util.Collection<String> dv01Sizes) {
		setParameter("dv01Sizes", dv01Sizes);
	}

	public IMAImpactRequest withDv01Sizes(java.util.Collection<String> dv01Sizes) {
		setParameter("dv01Sizes", dv01Sizes);
		return this;
	}

	public void setDv01Sizes(String... dv01Sizes) {
		setParameter("dv01Sizes", java.util.Arrays.asList(dv01Sizes));
	}

	public IMAImpactRequest withDv01Sizes(String... dv01Sizes) {
		setParameter("dv01Sizes", java.util.Arrays.asList(dv01Sizes));
		return this;
	}


	public void setReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
	}

	public IMAImpactRequest withReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
		return this;
	}


	public void setParSwapTenors(java.util.Collection<String> parSwapTenors) {
		setParameter("parSwapTenors", parSwapTenors);
	}

	public IMAImpactRequest withParSwapTenors(java.util.Collection<String> parSwapTenors) {
		setParameter("parSwapTenors", parSwapTenors);
		return this;
	}

	public void setParSwapTenors(String... parSwapTenors) {
		setParameter("parSwapTenors", java.util.Arrays.asList(parSwapTenors));
	}

	public IMAImpactRequest withParSwapTenors(String... parSwapTenors) {
		setParameter("parSwapTenors", java.util.Arrays.asList(parSwapTenors));
		return this;
	}


	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getPortfolios() {
		return (java.util.Collection<String>)getParameter("portfolios");
	}

	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getMarketData() {
		return (java.util.Collection<String>)getParameter("marketData");
	}

	public java.lang.String getParSwapLadder() {
		return (java.lang.String)getParameter("parSwapLadder");
	}

	public java.lang.String getProduct() {
		return (java.lang.String)getParameter("product");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getNotionalSizes() {
		return (java.util.Collection<String>)getParameter("notionalSizes");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getDv01Sizes() {
		return (java.util.Collection<String>)getParameter("dv01Sizes");
	}

	public java.lang.String getReportCcy() {
		return (java.lang.String)getParameter("reportCcy");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getParSwapTenors() {
		return (java.util.Collection<String>)getParameter("parSwapTenors");
	}


}