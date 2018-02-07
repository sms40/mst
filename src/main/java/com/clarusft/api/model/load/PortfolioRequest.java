package com.clarusft.api.model.load;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class PortfolioRequest extends com.clarusft.api.model.ApiRequest {
	public PortfolioRequest() {
		super("Load", "Portfolio", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setPortfolioId(java.lang.String portfolioId) {
		setParameter("portfolioId", portfolioId);
	}

	public PortfolioRequest withPortfolioId(java.lang.String portfolioId) {
		setParameter("portfolioId", portfolioId);
		return this;
	}

	public void setPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
	}

	public PortfolioRequest withPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
		return this;
	}

	public void setPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
	}

	public PortfolioRequest withPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
		return this;
	}

	public void setGroupBy(java.lang.String groupBy) {
		setParameter("groupBy", groupBy);
	}

	public PortfolioRequest withGroupBy(java.lang.String groupBy) {
		setParameter("groupBy", groupBy);
		return this;
	}

	public void setAsOfDate(java.time.LocalDate asOfDate) {
		setParameter("asOfDate", asOfDate);
	}

	public PortfolioRequest withAsOfDate(java.time.LocalDate asOfDate) {
		setParameter("asOfDate", asOfDate);
		return this;
	}

	public void setShare(java.lang.Boolean share) {
		setParameter("share", share);
	}

	public PortfolioRequest withShare(java.lang.Boolean share) {
		setParameter("share", share);
		return this;
	}


	public java.lang.String getPortfolioId() {
		return (java.lang.String)getParameter("portfolioId");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getPortfolios() {
		return (java.util.Collection<String>)getParameter("portfolios");
	}

	public java.lang.String getGroupBy() {
		return (java.lang.String)getParameter("groupBy");
	}

	public java.time.LocalDate getAsOfDate() {
		return (java.time.LocalDate)getParameter("asOfDate");
	}

	public java.lang.Boolean getShare() {
		return (java.lang.Boolean)getParameter("share");
	}


}