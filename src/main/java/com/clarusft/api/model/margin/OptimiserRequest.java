package com.clarusft.api.model.margin;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class OptimiserRequest extends com.clarusft.api.model.ApiRequest {
	public OptimiserRequest() {
		super("Margin", "Optimiser", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
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

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getCcyFilter() {
		return (java.util.Collection<String>)getParameter("ccyFilter");
	}


}