package com.clarusft.api.model.margin;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ParSwapsIMRequest extends com.clarusft.api.model.ApiRequest {
	public ParSwapsIMRequest() {
		super("Margin", "ParSwapsIM", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public ParSwapsIMRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}

	public void setMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
	}

	public ParSwapsIMRequest withMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
		return this;
	}

	public void setMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
	}

	public ParSwapsIMRequest withMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
		return this;
	}

	public void setModel(java.lang.String model) {
		setParameter("model", model);
	}

	public ParSwapsIMRequest withModel(java.lang.String model) {
		setParameter("model", model);
		return this;
	}

	public void setHouseClient(String houseClient) {
		setParameter("houseClient", houseClient);
	}

	public ParSwapsIMRequest withHouseClient(String houseClient) {
		setParameter("houseClient", houseClient);
		return this;
	}

	public void setMultiplier(java.lang.Double multiplier) {
		setParameter("multiplier", multiplier);
	}

	public ParSwapsIMRequest withMultiplier(java.lang.Double multiplier) {
		setParameter("multiplier", multiplier);
		return this;
	}

	public void setAddons(java.lang.Boolean addons) {
		setParameter("addons", addons);
	}

	public ParSwapsIMRequest withAddons(java.lang.Boolean addons) {
		setParameter("addons", addons);
		return this;
	}

	public void setProduct(java.lang.String product) {
		setParameter("product", product);
	}

	public ParSwapsIMRequest withProduct(java.lang.String product) {
		setParameter("product", product);
		return this;
	}

	public void setNotionalSizes(java.util.Collection<java.lang.Integer> notionalSizes) {
		setParameter("notionalSizes", notionalSizes);
	}

	public ParSwapsIMRequest withNotionalSizes(java.util.Collection<java.lang.Integer> notionalSizes) {
		setParameter("notionalSizes", notionalSizes);
		return this;
	}

	public void setNotionalSizes(java.lang.Integer... notionalSizes) {
		setParameter("notionalSizes", java.util.Arrays.asList(notionalSizes));
	}

	public ParSwapsIMRequest withNotionalSizes(java.lang.Integer... notionalSizes) {
		setParameter("notionalSizes", java.util.Arrays.asList(notionalSizes));
		return this;
	}

	public void setDv01Sizes(java.util.Collection<java.lang.Integer> dv01Sizes) {
		setParameter("dv01Sizes", dv01Sizes);
	}

	public ParSwapsIMRequest withDv01Sizes(java.util.Collection<java.lang.Integer> dv01Sizes) {
		setParameter("dv01Sizes", dv01Sizes);
		return this;
	}

	public void setDv01Sizes(java.lang.Integer... dv01Sizes) {
		setParameter("dv01Sizes", java.util.Arrays.asList(dv01Sizes));
	}

	public ParSwapsIMRequest withDv01Sizes(java.lang.Integer... dv01Sizes) {
		setParameter("dv01Sizes", java.util.Arrays.asList(dv01Sizes));
		return this;
	}

	public void setReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
	}

	public ParSwapsIMRequest withReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
		return this;
	}

	public void setParSwapTenors(java.util.Collection<String> parSwapTenors) {
		setParameter("parSwapTenors", parSwapTenors);
	}

	public ParSwapsIMRequest withParSwapTenors(java.util.Collection<String> parSwapTenors) {
		setParameter("parSwapTenors", parSwapTenors);
		return this;
	}

	public void setParSwapTenors(String... parSwapTenors) {
		setParameter("parSwapTenors", java.util.Arrays.asList(parSwapTenors));
	}

	public ParSwapsIMRequest withParSwapTenors(String... parSwapTenors) {
		setParameter("parSwapTenors", java.util.Arrays.asList(parSwapTenors));
		return this;
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