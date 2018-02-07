package com.clarusft.api.model.margin;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class OptimiserRequest extends com.clarusft.api.model.ApiRequest {
	public OptimiserRequest() {
		super("Margin", "Optimiser", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
	}

	public OptimiserRequest withPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
		return this;
	}

	public void setPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
	}

	public OptimiserRequest withPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
		return this;
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public OptimiserRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}

	public void setOptimisation(String optimisation) {
		setParameter("optimisation", optimisation);
	}

	public OptimiserRequest withOptimisation(String optimisation) {
		setParameter("optimisation", optimisation);
		return this;
	}

	public void setMinSaving(java.lang.Double minSaving) {
		setParameter("minSaving", minSaving);
	}

	public OptimiserRequest withMinSaving(java.lang.Double minSaving) {
		setParameter("minSaving", minSaving);
		return this;
	}

	public void setMaxTradesToMove(java.lang.Integer maxTradesToMove) {
		setParameter("maxTradesToMove", maxTradesToMove);
	}

	public OptimiserRequest withMaxTradesToMove(java.lang.Integer maxTradesToMove) {
		setParameter("maxTradesToMove", maxTradesToMove);
		return this;
	}

	public void setReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
	}

	public OptimiserRequest withReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
		return this;
	}

	public void setCcyFilter(java.util.Collection<String> ccyFilter) {
		setParameter("ccyFilter", ccyFilter);
	}

	public OptimiserRequest withCcyFilter(java.util.Collection<String> ccyFilter) {
		setParameter("ccyFilter", ccyFilter);
		return this;
	}

	public void setCcyFilter(String... ccyFilter) {
		setParameter("ccyFilter", java.util.Arrays.asList(ccyFilter));
	}

	public OptimiserRequest withCcyFilter(String... ccyFilter) {
		setParameter("ccyFilter", java.util.Arrays.asList(ccyFilter));
		return this;
	}

	public void setLargest(java.lang.Integer largest) {
		setParameter("largest", largest);
	}

	public OptimiserRequest withLargest(java.lang.Integer largest) {
		setParameter("largest", largest);
		return this;
	}

	public void setMeasure(java.lang.String measure) {
		setParameter("measure", measure);
	}

	public OptimiserRequest withMeasure(java.lang.String measure) {
		setParameter("measure", measure);
		return this;
	}

	public void setBenefitOnly(java.lang.Boolean benefitOnly) {
		setParameter("benefitOnly", benefitOnly);
	}

	public OptimiserRequest withBenefitOnly(java.lang.Boolean benefitOnly) {
		setParameter("benefitOnly", benefitOnly);
		return this;
	}

	public void setIgnoreEligibility(java.lang.Boolean ignoreEligibility) {
		setParameter("ignoreEligibility", ignoreEligibility);
	}

	public OptimiserRequest withIgnoreEligibility(java.lang.Boolean ignoreEligibility) {
		setParameter("ignoreEligibility", ignoreEligibility);
		return this;
	}

	public void setBackLoading(java.lang.Boolean backLoading) {
		setParameter("backLoading", backLoading);
	}

	public OptimiserRequest withBackLoading(java.lang.Boolean backLoading) {
		setParameter("backLoading", backLoading);
		return this;
	}


	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getPortfolios() {
		return (java.util.Collection<String>)getParameter("portfolios");
	}

	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}

	public String getOptimisation() {
		return (String)getParameter("optimisation");
	}

	public java.lang.Double getMinSaving() {
		return (java.lang.Double)getParameter("minSaving");
	}

	public java.lang.Integer getMaxTradesToMove() {
		return (java.lang.Integer)getParameter("maxTradesToMove");
	}

	public java.lang.String getReportCcy() {
		return (java.lang.String)getParameter("reportCcy");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getCcyFilter() {
		return (java.util.Collection<String>)getParameter("ccyFilter");
	}

	public java.lang.Integer getLargest() {
		return (java.lang.Integer)getParameter("largest");
	}

	public java.lang.String getMeasure() {
		return (java.lang.String)getParameter("measure");
	}

	public java.lang.Boolean getBenefitOnly() {
		return (java.lang.Boolean)getParameter("benefitOnly");
	}

	public java.lang.Boolean getIgnoreEligibility() {
		return (java.lang.Boolean)getParameter("ignoreEligibility");
	}

	public java.lang.Boolean getBackLoading() {
		return (java.lang.Boolean)getParameter("backLoading");
	}


}