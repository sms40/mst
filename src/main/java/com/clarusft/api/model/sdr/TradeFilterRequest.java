package com.clarusft.api.model.sdr;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class TradeFilterRequest extends com.clarusft.api.model.ApiRequest {
	public TradeFilterRequest() {
		super("SDR", "TradeFilter", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setReportDate(java.time.LocalDate reportDate) {
		setParameter("reportDate", reportDate);
	}

	public TradeFilterRequest withReportDate(java.time.LocalDate reportDate) {
		setParameter("reportDate", reportDate);
		return this;
	}

	public void setCleared(String cleared) {
		setParameter("cleared", cleared);
	}

	public TradeFilterRequest withCleared(String cleared) {
		setParameter("cleared", cleared);
		return this;
	}

	public void setSef(String sef) {
		setParameter("sef", sef);
	}

	public TradeFilterRequest withSef(String sef) {
		setParameter("sef", sef);
		return this;
	}

	public void setSource(String source) {
		setParameter("source", source);
	}

	public TradeFilterRequest withSource(String source) {
		setParameter("source", source);
		return this;
	}

	public void setTaxonomy(String taxonomy) {
		setParameter("taxonomy", taxonomy);
	}

	public TradeFilterRequest withTaxonomy(String taxonomy) {
		setParameter("taxonomy", taxonomy);
		return this;
	}

	public void setCurrency(String currency) {
		setParameter("currency", currency);
	}

	public TradeFilterRequest withCurrency(String currency) {
		setParameter("currency", currency);
		return this;
	}

	public void setPackage(String p) {
		setParameter("package", p);
	}

	public TradeFilterRequest withPackage(String p) {
		setParameter("package", p);
		return this;
	}

	public void setSubtype(String subtype) {
		setParameter("subtype", subtype);
	}

	public TradeFilterRequest withSubtype(String subtype) {
		setParameter("subtype", subtype);
		return this;
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

	public String getTaxonomy() {
		return (String)getParameter("taxonomy");
	}

	public String getCurrency() {
		return (String)getParameter("currency");
	}

	public String getPackage() {
		return (String)getParameter("package");
	}

	public String getSubtype() {
		return (String)getParameter("subtype");
	}


}