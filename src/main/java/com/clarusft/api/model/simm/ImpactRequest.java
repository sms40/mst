package com.clarusft.api.model.simm;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ImpactRequest extends com.clarusft.api.model.ApiRequest {
	public ImpactRequest() {
		super("SIMM", "Impact", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
	}

	public ImpactRequest withPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
		return this;
	}

	public void setPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
	}

	public ImpactRequest withPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
		return this;
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public ImpactRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}

	public void setMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
	}

	public ImpactRequest withMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
		return this;
	}

	public void setMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
	}

	public ImpactRequest withMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
		return this;
	}

	public void setParSwapLadder(java.lang.String parSwapLadder) {
		setParameter("parSwapLadder", parSwapLadder);
	}

	public ImpactRequest withParSwapLadder(java.lang.String parSwapLadder) {
		setParameter("parSwapLadder", parSwapLadder);
		return this;
	}

	public void setProduct(java.lang.String product) {
		setParameter("product", product);
	}

	public ImpactRequest withProduct(java.lang.String product) {
		setParameter("product", product);
		return this;
	}

	public void setNotionalSizes(java.util.Collection<java.lang.Integer> notionalSizes) {
		setParameter("notionalSizes", notionalSizes);
	}

	public ImpactRequest withNotionalSizes(java.util.Collection<java.lang.Integer> notionalSizes) {
		setParameter("notionalSizes", notionalSizes);
		return this;
	}

	public void setNotionalSizes(java.lang.Integer... notionalSizes) {
		setParameter("notionalSizes", java.util.Arrays.asList(notionalSizes));
	}

	public ImpactRequest withNotionalSizes(java.lang.Integer... notionalSizes) {
		setParameter("notionalSizes", java.util.Arrays.asList(notionalSizes));
		return this;
	}

	public void setDv01Sizes(java.util.Collection<java.lang.Integer> dv01Sizes) {
		setParameter("dv01Sizes", dv01Sizes);
	}

	public ImpactRequest withDv01Sizes(java.util.Collection<java.lang.Integer> dv01Sizes) {
		setParameter("dv01Sizes", dv01Sizes);
		return this;
	}

	public void setDv01Sizes(java.lang.Integer... dv01Sizes) {
		setParameter("dv01Sizes", java.util.Arrays.asList(dv01Sizes));
	}

	public ImpactRequest withDv01Sizes(java.lang.Integer... dv01Sizes) {
		setParameter("dv01Sizes", java.util.Arrays.asList(dv01Sizes));
		return this;
	}

	public void setReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
	}

	public ImpactRequest withReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
		return this;
	}

	public void setParSwapTenors(java.util.Collection<String> parSwapTenors) {
		setParameter("parSwapTenors", parSwapTenors);
	}

	public ImpactRequest withParSwapTenors(java.util.Collection<String> parSwapTenors) {
		setParameter("parSwapTenors", parSwapTenors);
		return this;
	}

	public void setParSwapTenors(String... parSwapTenors) {
		setParameter("parSwapTenors", java.util.Arrays.asList(parSwapTenors));
	}

	public ImpactRequest withParSwapTenors(String... parSwapTenors) {
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
	public java.util.Collection<java.lang.Integer> getNotionalSizes() {
		return (java.util.Collection<java.lang.Integer>)getParameter("notionalSizes");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<java.lang.Integer> getDv01Sizes() {
		return (java.util.Collection<java.lang.Integer>)getParameter("dv01Sizes");
	}

	public java.lang.String getReportCcy() {
		return (java.lang.String)getParameter("reportCcy");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getParSwapTenors() {
		return (java.util.Collection<String>)getParameter("parSwapTenors");
	}


}