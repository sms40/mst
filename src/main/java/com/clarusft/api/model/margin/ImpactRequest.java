package com.clarusft.api.model.margin;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ImpactRequest extends com.clarusft.api.model.ApiRequest {
	public ImpactRequest() {
		super("Margin", "Impact", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
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


	public void setModel(java.lang.String model) {
		setParameter("model", model);
	}

	public ImpactRequest withModel(java.lang.String model) {
		setParameter("model", model);
		return this;
	}


	public void setProduct(java.lang.String product) {
		setParameter("product", product);
	}

	public ImpactRequest withProduct(java.lang.String product) {
		setParameter("product", product);
		return this;
	}


	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getPortfolios() {
		return (java.util.Collection<String>)getParameter("portfolios");
	}

	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}

	public java.lang.String getModel() {
		return (java.lang.String)getParameter("model");
	}

	public java.lang.String getProduct() {
		return (java.lang.String)getParameter("product");
	}


}