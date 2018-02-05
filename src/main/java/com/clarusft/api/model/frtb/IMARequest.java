package com.clarusft.api.model.frtb;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class IMARequest extends com.clarusft.api.model.ApiRequest {
	public IMARequest() {
		super("FRTB", "IMA", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
	}

	public IMARequest withPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
		return this;
	}

	public void setPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
	}

	public IMARequest withPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
		return this;
	}


	public void setWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
	}

	public IMARequest withWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
		return this;
	}

	public void setWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
	}

	public IMARequest withWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
		return this;
	}


	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public IMARequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}


	public void setMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
	}

	public IMARequest withMarketData(java.util.Collection<String> marketData) {
		setParameter("marketData", marketData);
		return this;
	}

	public void setMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
	}

	public IMARequest withMarketData(String... marketData) {
		setParameter("marketData", java.util.Arrays.asList(marketData));
		return this;
	}


	public void setReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
	}

	public IMARequest withReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
		return this;
	}


	public void setRow(java.lang.String row) {
		setParameter("row", row);
	}

	public IMARequest withRow(java.lang.String row) {
		setParameter("row", row);
		return this;
	}


	public void setTotalRow(java.lang.Boolean totalRow) {
		setParameter("totalRow", totalRow);
	}

	public IMARequest withTotalRow(java.lang.Boolean totalRow) {
		setParameter("totalRow", totalRow);
		return this;
	}


	public void setShiftSet(java.lang.String shiftSet) {
		setParameter("shiftSet", shiftSet);
	}

	public IMARequest withShiftSet(java.lang.String shiftSet) {
		setParameter("shiftSet", shiftSet);
		return this;
	}


	public void setMethod(String method) {
		setParameter("method", method);
	}

	public IMARequest withMethod(String method) {
		setParameter("method", method);
		return this;
	}


	public void setFXRisk(java.lang.Boolean fXRisk) {
		setParameter("FXRisk", fXRisk);
	}

	public IMARequest withFXRisk(java.lang.Boolean fXRisk) {
		setParameter("FXRisk", fXRisk);
		return this;
	}


	public void setVaRLossMethod(String vaRLossMethod) {
		setParameter("VaRLossMethod", vaRLossMethod);
	}

	public IMARequest withVaRLossMethod(String vaRLossMethod) {
		setParameter("VaRLossMethod", vaRLossMethod);
		return this;
	}


	public void setConfidence(java.lang.Double confidence) {
		setParameter("Confidence", confidence);
	}

	public IMARequest withConfidence(java.lang.Double confidence) {
		setParameter("Confidence", confidence);
		return this;
	}


	public void setCcys(java.util.Collection<String> ccys) {
		setParameter("ccys", ccys);
	}

	public IMARequest withCcys(java.util.Collection<String> ccys) {
		setParameter("ccys", ccys);
		return this;
	}

	public void setCcys(String... ccys) {
		setParameter("ccys", java.util.Arrays.asList(ccys));
	}

	public IMARequest withCcys(String... ccys) {
		setParameter("ccys", java.util.Arrays.asList(ccys));
		return this;
	}


	public void setScenarios(java.util.Collection<String> scenarios) {
		setParameter("scenarios", scenarios);
	}

	public IMARequest withScenarios(java.util.Collection<String> scenarios) {
		setParameter("scenarios", scenarios);
		return this;
	}

	public void setScenarios(String... scenarios) {
		setParameter("scenarios", java.util.Arrays.asList(scenarios));
	}

	public IMARequest withScenarios(String... scenarios) {
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

	public java.lang.String getShiftSet() {
		return (java.lang.String)getParameter("shiftSet");
	}

	public String getMethod() {
		return (String)getParameter("method");
	}

	public java.lang.Boolean getFXRisk() {
		return (java.lang.Boolean)getParameter("FXRisk");
	}

	public String getVaRLossMethod() {
		return (String)getParameter("VaRLossMethod");
	}

	public java.lang.Double getConfidence() {
		return (java.lang.Double)getParameter("Confidence");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getCcys() {
		return (java.util.Collection<String>)getParameter("ccys");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getScenarios() {
		return (java.util.Collection<String>)getParameter("scenarios");
	}


}