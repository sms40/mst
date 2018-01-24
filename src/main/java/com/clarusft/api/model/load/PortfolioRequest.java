package com.clarusft.api.model.load;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class PortfolioRequest extends com.clarusft.api.model.ApiRequest {
	public PortfolioRequest() {
		super("Load", "Portfolio", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
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


	public java.lang.String getPortfolioId() {
		return (java.lang.String)getParameter("portfolioId");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getPortfolios() {
		return (java.util.Collection<String>)getParameter("portfolios");
	}


}