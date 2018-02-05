package com.clarusft.api.model.margin;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class VMBufferRequest extends com.clarusft.api.model.ApiRequest {
	public VMBufferRequest() {
		super("Margin", "VMBuffer", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
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


	public void setMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
	}

	public VMBufferRequest withMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
		return this;
	}

	public void setMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
	}

	public VMBufferRequest withMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
		return this;
	}


	public void setReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
	}

	public VMBufferRequest withReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
		return this;
	}


	public void setRow(java.lang.String row) {
		setParameter("row", row);
	}

	public VMBufferRequest withRow(java.lang.String row) {
		setParameter("row", row);
		return this;
	}


	public void setTotalRow(java.lang.Boolean totalRow) {
		setParameter("totalRow", totalRow);
	}

	public VMBufferRequest withTotalRow(java.lang.Boolean totalRow) {
		setParameter("totalRow", totalRow);
		return this;
	}


	public void setObservatonPeriod(java.lang.String observatonPeriod) {
		setParameter("observatonPeriod", observatonPeriod);
	}

	public VMBufferRequest withObservatonPeriod(java.lang.String observatonPeriod) {
		setParameter("observatonPeriod", observatonPeriod);
		return this;
	}


	public void setFXRisk(java.lang.Boolean fXRisk) {
		setParameter("FXRisk", fXRisk);
	}

	public VMBufferRequest withFXRisk(java.lang.Boolean fXRisk) {
		setParameter("FXRisk", fXRisk);
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


	public void setMethod(String method) {
		setParameter("method", method);
	}

	public VMBufferRequest withMethod(String method) {
		setParameter("method", method);
		return this;
	}


	public void setScenarios(java.util.Collection<String> scenarios) {
		setParameter("scenarios", scenarios);
	}

	public VMBufferRequest withScenarios(java.util.Collection<String> scenarios) {
		setParameter("scenarios", scenarios);
		return this;
	}

	public void setScenarios(String... scenarios) {
		setParameter("scenarios", java.util.Arrays.asList(scenarios));
	}

	public VMBufferRequest withScenarios(String... scenarios) {
		setParameter("scenarios", java.util.Arrays.asList(scenarios));
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

	public java.lang.String getReportCcy() {
		return (java.lang.String)getParameter("reportCcy");
	}

	public java.lang.String getRow() {
		return (java.lang.String)getParameter("row");
	}

	public java.lang.Boolean getTotalRow() {
		return (java.lang.Boolean)getParameter("totalRow");
	}

	public java.lang.String getObservatonPeriod() {
		return (java.lang.String)getParameter("observatonPeriod");
	}

	public java.lang.Boolean getFXRisk() {
		return (java.lang.Boolean)getParameter("FXRisk");
	}

	public java.lang.Double getConfidence() {
		return (java.lang.Double)getParameter("Confidence");
	}

	public String getVaRLossMethod() {
		return (String)getParameter("VaRLossMethod");
	}

	public String getMethod() {
		return (String)getParameter("method");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getScenarios() {
		return (java.util.Collection<String>)getParameter("scenarios");
	}


}