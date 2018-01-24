package com.clarusft.api.model.risk;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class VaRRequest extends com.clarusft.api.model.ApiRequest {
	public VaRRequest() {
		super("Risk", "VaR", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
	}

	public void setPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
	}

	public VaRRequest withPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
		return this;
	}

	public void setPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
	}

	public VaRRequest withPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
		return this;
	}


	public void setWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
	}

	public VaRRequest withWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
		return this;
	}

	public void setWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
	}

	public VaRRequest withWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
		return this;
	}


	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public VaRRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}


	public void setShiftSet(java.lang.String shiftSet) {
		setParameter("shiftSet", shiftSet);
	}

	public VaRRequest withShiftSet(java.lang.String shiftSet) {
		setParameter("shiftSet", shiftSet);
		return this;
	}


	public void setVaRLossMethod(String vaRLossMethod) {
		setParameter("VaRLossMethod", vaRLossMethod);
	}

	public VaRRequest withVaRLossMethod(String vaRLossMethod) {
		setParameter("VaRLossMethod", vaRLossMethod);
		return this;
	}


	public void setConfidence(java.lang.Double confidence) {
		setParameter("Confidence", confidence);
	}

	public VaRRequest withConfidence(java.lang.Double confidence) {
		setParameter("Confidence", confidence);
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

	public java.lang.String getShiftSet() {
		return (java.lang.String)getParameter("shiftSet");
	}

	public String getVaRLossMethod() {
		return (String)getParameter("VaRLossMethod");
	}

	public java.lang.Double getConfidence() {
		return (java.lang.Double)getParameter("Confidence");
	}


}