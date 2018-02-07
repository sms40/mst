package com.clarusft.api.model.margin;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class AttributionRequest extends com.clarusft.api.model.ApiRequest {
	public AttributionRequest() {
		super("Margin", "Attribution", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
	}

	public AttributionRequest withPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
		return this;
	}

	public void setPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
	}

	public AttributionRequest withPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
		return this;
	}

	public void setWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
	}

	public AttributionRequest withWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
		return this;
	}

	public void setWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
	}

	public AttributionRequest withWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
		return this;
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public AttributionRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}

	public void setMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
	}

	public AttributionRequest withMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
		return this;
	}

	public void setMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
	}

	public AttributionRequest withMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
		return this;
	}

	public void setModel(java.lang.String model) {
		setParameter("model", model);
	}

	public AttributionRequest withModel(java.lang.String model) {
		setParameter("model", model);
		return this;
	}

	public void setHouseClient(String houseClient) {
		setParameter("houseClient", houseClient);
	}

	public AttributionRequest withHouseClient(String houseClient) {
		setParameter("houseClient", houseClient);
		return this;
	}

	public void setMultiplier(java.lang.Double multiplier) {
		setParameter("multiplier", multiplier);
	}

	public AttributionRequest withMultiplier(java.lang.Double multiplier) {
		setParameter("multiplier", multiplier);
		return this;
	}

	public void setAddons(java.lang.Boolean addons) {
		setParameter("addons", addons);
	}

	public AttributionRequest withAddons(java.lang.Boolean addons) {
		setParameter("addons", addons);
		return this;
	}

	public void setReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
	}

	public AttributionRequest withReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
		return this;
	}

	public void setView(String view) {
		setParameter("view", view);
	}

	public AttributionRequest withView(String view) {
		setParameter("view", view);
		return this;
	}

	public void setAttributeMethod(String attributeMethod) {
		setParameter("attributeMethod", attributeMethod);
	}

	public AttributionRequest withAttributeMethod(String attributeMethod) {
		setParameter("attributeMethod", attributeMethod);
		return this;
	}

	public void setAttributeBy(java.lang.String attributeBy) {
		setParameter("attributeBy", attributeBy);
	}

	public AttributionRequest withAttributeBy(java.lang.String attributeBy) {
		setParameter("attributeBy", attributeBy);
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

	public java.lang.String getReportCcy() {
		return (java.lang.String)getParameter("reportCcy");
	}

	public String getView() {
		return (String)getParameter("view");
	}

	public String getAttributeMethod() {
		return (String)getParameter("attributeMethod");
	}

	public java.lang.String getAttributeBy() {
		return (java.lang.String)getParameter("attributeBy");
	}


}