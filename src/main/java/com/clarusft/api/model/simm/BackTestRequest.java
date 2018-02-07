package com.clarusft.api.model.simm;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class BackTestRequest extends com.clarusft.api.model.ApiRequest {
	public BackTestRequest() {
		super("SIMM", "BackTest", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
	}

	public BackTestRequest withReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
		return this;
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public BackTestRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}

	public void setPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
	}

	public BackTestRequest withPortfolios(java.util.Collection<String> portfolios) {
		setParameter("portfolios", portfolios);
		return this;
	}

	public void setPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
	}

	public BackTestRequest withPortfolios(String... portfolios) {
		setParameter("portfolios", java.util.Arrays.asList(portfolios));
		return this;
	}

	public void setWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
	}

	public BackTestRequest withWhatif(java.util.Collection<String> whatif) {
		setParameter("whatif", whatif);
		return this;
	}

	public void setWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
	}

	public BackTestRequest withWhatif(String... whatif) {
		setParameter("whatif", java.util.Arrays.asList(whatif));
		return this;
	}

	public void setWhatifPortfolioID(java.lang.String whatifPortfolioID) {
		setParameter("whatifPortfolioID", whatifPortfolioID);
	}

	public BackTestRequest withWhatifPortfolioID(java.lang.String whatifPortfolioID) {
		setParameter("whatifPortfolioID", whatifPortfolioID);
		return this;
	}

	public void setAddons(java.lang.Boolean addons) {
		setParameter("addons", addons);
	}

	public BackTestRequest withAddons(java.lang.Boolean addons) {
		setParameter("addons", addons);
		return this;
	}

	public void setCcys(java.util.Collection<String> ccys) {
		setParameter("ccys", ccys);
	}

	public BackTestRequest withCcys(java.util.Collection<String> ccys) {
		setParameter("ccys", ccys);
		return this;
	}

	public void setCcys(String... ccys) {
		setParameter("ccys", java.util.Arrays.asList(ccys));
	}

	public BackTestRequest withCcys(String... ccys) {
		setParameter("ccys", java.util.Arrays.asList(ccys));
		return this;
	}

	public void setNumDates(java.lang.Integer numDates) {
		setParameter("numDates", numDates);
	}

	public BackTestRequest withNumDates(java.lang.Integer numDates) {
		setParameter("numDates", numDates);
		return this;
	}

	public void setStartDate(java.time.LocalDate startDate) {
		setParameter("startDate", startDate);
	}

	public BackTestRequest withStartDate(java.time.LocalDate startDate) {
		setParameter("startDate", startDate);
		return this;
	}

	public void setEndDate(java.time.LocalDate endDate) {
		setParameter("endDate", endDate);
	}

	public BackTestRequest withEndDate(java.time.LocalDate endDate) {
		setParameter("endDate", endDate);
		return this;
	}


	public java.lang.String getReportCcy() {
		return (java.lang.String)getParameter("reportCcy");
	}

	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getPortfolios() {
		return (java.util.Collection<String>)getParameter("portfolios");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getWhatif() {
		return (java.util.Collection<String>)getParameter("whatif");
	}

	public java.lang.String getWhatifPortfolioID() {
		return (java.lang.String)getParameter("whatifPortfolioID");
	}

	public java.lang.Boolean getAddons() {
		return (java.lang.Boolean)getParameter("addons");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getCcys() {
		return (java.util.Collection<String>)getParameter("ccys");
	}

	public java.lang.Integer getNumDates() {
		return (java.lang.Integer)getParameter("numDates");
	}

	public java.time.LocalDate getStartDate() {
		return (java.time.LocalDate)getParameter("startDate");
	}

	public java.time.LocalDate getEndDate() {
		return (java.time.LocalDate)getParameter("endDate");
	}


}