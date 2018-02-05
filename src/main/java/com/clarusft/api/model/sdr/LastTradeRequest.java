package com.clarusft.api.model.sdr;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class LastTradeRequest extends com.clarusft.api.model.ApiRequest {
	public LastTradeRequest() {
		super("SDR", "LastTrade", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setTicker(String ticker) {
		setParameter("ticker", ticker);
	}

	public LastTradeRequest withTicker(String ticker) {
		setParameter("ticker", ticker);
		return this;
	}


	public void setReportDate(java.time.LocalDate reportDate) {
		setParameter("reportDate", reportDate);
	}

	public LastTradeRequest withReportDate(java.time.LocalDate reportDate) {
		setParameter("reportDate", reportDate);
		return this;
	}


	public void setCleared(String cleared) {
		setParameter("cleared", cleared);
	}

	public LastTradeRequest withCleared(String cleared) {
		setParameter("cleared", cleared);
		return this;
	}


	public void setSef(String sef) {
		setParameter("sef", sef);
	}

	public LastTradeRequest withSef(String sef) {
		setParameter("sef", sef);
		return this;
	}


	public void setDco(String dco) {
		setParameter("dco", dco);
	}

	public LastTradeRequest withDco(String dco) {
		setParameter("dco", dco);
		return this;
	}


	public void setSource(String source) {
		setParameter("source", source);
	}

	public LastTradeRequest withSource(String source) {
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

	public String getDco() {
		return (String)getParameter("dco");
	}

	public String getSource() {
		return (String)getParameter("source");
	}


}