package com.clarusft.api.model.margin;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class VMBufferRequest extends com.clarusft.api.model.ApiRequest {
	public VMBufferRequest() {
		super("Margin", "VMBuffer", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
	}

	public void setPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
	}

	public VMBufferRequest withPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
		return this;
	}

	public void setPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
	}

	public VMBufferRequest withPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
		return this;
	}


	public void setWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
	}

	public VMBufferRequest withWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
		return this;
	}

	public void setWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
	}

	public VMBufferRequest withWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
		return this;
	}


	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public VMBufferRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}


	public void setObservatonPeriod(java.lang.String observatonPeriod) {
		setParameter("observatonPeriod", observatonPeriod);
	}

	public VMBufferRequest withObservatonPeriod(java.lang.String observatonPeriod) {
		setParameter("observatonPeriod", observatonPeriod);
		return this;
	}


	public void setConfidence(java.lang.Double confidence) {
		setParameter("Confidence", confidence);
	}

	public VMBufferRequest withConfidence(java.lang.Double confidence) {
		setParameter("Confidence", confidence);
		return this;
	}


	public void setVaRLossMethod(String vaRLossMethod) {
		setParameter("VaRLossMethod", vaRLossMethod);
	}

	public VMBufferRequest withVaRLossMethod(String vaRLossMethod) {
		setParameter("VaRLossMethod", vaRLossMethod);
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

	public java.lang.String getObservatonPeriod() {
		return (java.lang.String)getParameter("observatonPeriod");
	}

	public java.lang.Double getConfidence() {
		return (java.lang.Double)getParameter("Confidence");
	}

	public String getVaRLossMethod() {
		return (String)getParameter("VaRLossMethod");
	}


}