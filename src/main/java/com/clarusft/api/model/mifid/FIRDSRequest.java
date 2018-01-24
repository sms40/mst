package com.clarusft.api.model.mifid;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FIRDSRequest extends com.clarusft.api.model.ApiRequest {
	public FIRDSRequest() {
		super("MIFID", "FIRDS", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
	}

	public void setIsin(String isin) {
		setParameter("isin", isin);
	}

	public FIRDSRequest withIsin(String isin) {
		setParameter("isin", isin);
		return this;
	}


	public void setTradingVenue(java.lang.String tradingVenue) {
		setParameter("tradingVenue", tradingVenue);
	}

	public FIRDSRequest withTradingVenue(java.lang.String tradingVenue) {
		setParameter("tradingVenue", tradingVenue);
		return this;
	}


	public void setClassificationType(java.lang.String classificationType) {
		setParameter("classificationType", classificationType);
	}

	public FIRDSRequest withClassificationType(java.lang.String classificationType) {
		setParameter("classificationType", classificationType);
		return this;
	}


	public void setIndex(java.lang.String index) {
		setParameter("index", index);
	}

	public FIRDSRequest withIndex(java.lang.String index) {
		setParameter("index", index);
		return this;
	}


	public void setTerm(String term) {
		setParameter("term", term);
	}

	public FIRDSRequest withTerm(String term) {
		setParameter("term", term);
		return this;
	}


	public void setMaturityDate(java.time.LocalDate maturityDate) {
		setParameter("maturityDate", maturityDate);
	}

	public FIRDSRequest withMaturityDate(java.time.LocalDate maturityDate) {
		setParameter("maturityDate", maturityDate);
		return this;
	}


	public void setCurrency(String currency) {
		setParameter("currency", currency);
	}

	public FIRDSRequest withCurrency(String currency) {
		setParameter("currency", currency);
		return this;
	}


	public String getIsin() {
		return (String)getParameter("isin");
	}

	public java.lang.String getTradingVenue() {
		return (java.lang.String)getParameter("tradingVenue");
	}

	public java.lang.String getClassificationType() {
		return (java.lang.String)getParameter("classificationType");
	}

	public java.lang.String getIndex() {
		return (java.lang.String)getParameter("index");
	}

	public String getTerm() {
		return (String)getParameter("term");
	}

	public java.time.LocalDate getMaturityDate() {
		return (java.time.LocalDate)getParameter("maturityDate");
	}

	public String getCurrency() {
		return (String)getParameter("currency");
	}


}