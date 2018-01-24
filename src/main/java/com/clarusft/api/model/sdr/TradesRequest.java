package com.clarusft.api.model.sdr;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class TradesRequest extends com.clarusft.api.model.ApiRequest {
	public TradesRequest() {
		super("SDR", "Trades", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
	}

	public void setTicker(String ticker) {
		setParameter("ticker", ticker);
	}

	public TradesRequest withTicker(String ticker) {
		setParameter("ticker", ticker);
		return this;
	}


	public void setReportDate(java.time.LocalDate reportDate) {
		setParameter("reportDate", reportDate);
	}

	public TradesRequest withReportDate(java.time.LocalDate reportDate) {
		setParameter("reportDate", reportDate);
		return this;
	}


	public void setCleared(String cleared) {
		setParameter("cleared", cleared);
	}

	public TradesRequest withCleared(String cleared) {
		setParameter("cleared", cleared);
		return this;
	}


	public void setSef(String sef) {
		setParameter("sef", sef);
	}

	public TradesRequest withSef(String sef) {
		setParameter("sef", sef);
		return this;
	}


	public void setSource(String source) {
		setParameter("source", source);
	}

	public TradesRequest withSource(String source) {
		setParameter("source", source);
		return this;
	}


	public String getTicker() {
		return (String)getParameter("ticker");
	}

	public java.time.LocalDate getReportDate() {
		return (java.time.LocalDate)getParameter("reportDate");
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