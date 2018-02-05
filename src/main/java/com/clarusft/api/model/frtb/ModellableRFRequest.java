package com.clarusft.api.model.frtb;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ModellableRFRequest extends com.clarusft.api.model.ApiRequest {
	public ModellableRFRequest() {
		super("FRTB", "ModellableRF", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setRiskFactors(String riskFactors) {
		setParameter("riskFactors", riskFactors);
	}

	public ModellableRFRequest withRiskFactors(String riskFactors) {
		setParameter("riskFactors", riskFactors);
		return this;
	}


	public void setTicker(String ticker) {
		setParameter("ticker", ticker);
	}

	public ModellableRFRequest withTicker(String ticker) {
		setParameter("ticker", ticker);
		return this;
	}


	public void setEndDate(java.time.LocalDate endDate) {
		setParameter("endDate", endDate);
	}

	public ModellableRFRequest withEndDate(java.time.LocalDate endDate) {
		setParameter("endDate", endDate);
		return this;
	}


	public void setCleared(String cleared) {
		setParameter("cleared", cleared);
	}

	public ModellableRFRequest withCleared(String cleared) {
		setParameter("cleared", cleared);
		return this;
	}


	public void setSef(String sef) {
		setParameter("sef", sef);
	}

	public ModellableRFRequest withSef(String sef) {
		setParameter("sef", sef);
		return this;
	}


	public void setSource(String source) {
		setParameter("source", source);
	}

	public ModellableRFRequest withSource(String source) {
		setParameter("source", source);
		return this;
	}


	public String getRiskFactors() {
		return (String)getParameter("riskFactors");
	}

	public String getTicker() {
		return (String)getParameter("ticker");
	}

	public java.time.LocalDate getEndDate() {
		return (java.time.LocalDate)getParameter("endDate");
	}

	public String getCleared() {
		return (String)getParameter("cleared");
	}

	public String getSef() {
		return (String)getParameter("sef");
	}

	public String getSource() {
		return (String)getParameter("source");
	}


}