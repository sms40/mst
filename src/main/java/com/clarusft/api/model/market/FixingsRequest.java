package com.clarusft.api.model.market;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FixingsRequest extends com.clarusft.api.model.ApiRequest {
	public FixingsRequest() {
		super("Market", "Fixings", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public FixingsRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}

	public void setMarket(String market) {
		setParameter("market", market);
	}

	public FixingsRequest withMarket(String market) {
		setParameter("market", market);
		return this;
	}

	public void setCurrency(String currency) {
		setParameter("currency", currency);
	}

	public FixingsRequest withCurrency(String currency) {
		setParameter("currency", currency);
		return this;
	}

	public void setMaturities(String maturities) {
		setParameter("maturities", maturities);
	}

	public FixingsRequest withMaturities(String maturities) {
		setParameter("maturities", maturities);
		return this;
	}

	public void setFirstFixingDate(java.time.LocalDate firstFixingDate) {
		setParameter("firstFixingDate", firstFixingDate);
	}

	public FixingsRequest withFirstFixingDate(java.time.LocalDate firstFixingDate) {
		setParameter("firstFixingDate", firstFixingDate);
		return this;
	}

	public void setLastFixingDate(java.time.LocalDate lastFixingDate) {
		setParameter("lastFixingDate", lastFixingDate);
	}

	public FixingsRequest withLastFixingDate(java.time.LocalDate lastFixingDate) {
		setParameter("lastFixingDate", lastFixingDate);
		return this;
	}

	public void setFixingType(String fixingType) {
		setParameter("fixingType", fixingType);
	}

	public FixingsRequest withFixingType(String fixingType) {
		setParameter("fixingType", fixingType);
		return this;
	}

	public void setFormat(String format) {
		setParameter("format", format);
	}

	public FixingsRequest withFormat(String format) {
		setParameter("format", format);
		return this;
	}


	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}

	public String getMarket() {
		return (String)getParameter("market");
	}

	public String getCurrency() {
		return (String)getParameter("currency");
	}

	public String getMaturities() {
		return (String)getParameter("maturities");
	}

	public java.time.LocalDate getFirstFixingDate() {
		return (java.time.LocalDate)getParameter("firstFixingDate");
	}

	public java.time.LocalDate getLastFixingDate() {
		return (java.time.LocalDate)getParameter("lastFixingDate");
	}

	public String getFixingType() {
		return (String)getParameter("fixingType");
	}

	public String getFormat() {
		return (String)getParameter("format");
	}


}