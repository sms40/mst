package com.clarusft.api.model.frtb;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ModellableRFTradesRequest extends com.clarusft.api.model.ApiRequest {
	public ModellableRFTradesRequest() {
		super("FRTB", "ModellableRFTrades", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
	}

	public void setTicker(java.lang.String ticker) {
		setParameter("ticker", ticker);
	}

	public ModellableRFTradesRequest withTicker(java.lang.String ticker) {
		setParameter("ticker", ticker);
		return this;
	}


	public void setEndDate(java.time.LocalDate endDate) {
		setParameter("endDate", endDate);
	}

	public ModellableRFTradesRequest withEndDate(java.time.LocalDate endDate) {
		setParameter("endDate", endDate);
		return this;
	}


	public void setCleared(String cleared) {
		setParameter("cleared", cleared);
	}

	public ModellableRFTradesRequest withCleared(String cleared) {
		setParameter("cleared", cleared);
		return this;
	}


	public void setSef(String sef) {
		setParameter("sef", sef);
	}

	public ModellableRFTradesRequest withSef(String sef) {
		setParameter("sef", sef);
		return this;
	}


	public void setSource(String source) {
		setParameter("source", source);
	}

	public ModellableRFTradesRequest withSource(String source) {
		setParameter("source", source);
		return this;
	}


	public void setSummary(java.lang.Boolean summary) {
		setParameter("summary", summary);
	}

	public ModellableRFTradesRequest withSummary(java.lang.Boolean summary) {
		setParameter("summary", summary);
		return this;
	}


	public java.lang.String getTicker() {
		return (java.lang.String)getParameter("ticker");
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

	public java.lang.Boolean getSummary() {
		return (java.lang.Boolean)getParameter("summary");
	}


}