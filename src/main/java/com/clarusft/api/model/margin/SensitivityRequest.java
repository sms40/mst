package com.clarusft.api.model.margin;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class SensitivityRequest extends com.clarusft.api.model.ApiRequest {
	public SensitivityRequest() {
		super("Margin", "Sensitivity", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
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


	public void setModel(java.lang.String model) {
		setParameter("model", model);
	}

	public SensitivityRequest withModel(java.lang.String model) {
		setParameter("model", model);
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

	public java.lang.String getModel() {
		return (java.lang.String)getParameter("model");
	}

	public java.lang.String getShiftFactor() {
		return (java.lang.String)getParameter("shiftFactor");
	}

	public java.lang.Integer getShift() {
		return (java.lang.Integer)getParameter("shift");
	}


}