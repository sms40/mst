package com.clarusft.api.model.dates;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class MaintenancePeriodsRequest extends com.clarusft.api.model.ApiRequest {
	public MaintenancePeriodsRequest() {
		super("Dates", "MaintenancePeriods", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
	}

	public void setCentralBank(java.lang.String centralBank) {
		setParameter("centralBank", centralBank);
	}

	public MaintenancePeriodsRequest withCentralBank(java.lang.String centralBank) {
		setParameter("centralBank", centralBank);
		return this;
	}


	public void setCurrency(String currency) {
		setParameter("currency", currency);
	}

	public MaintenancePeriodsRequest withCurrency(String currency) {
		setParameter("currency", currency);
		return this;
	}


	public void setYear(java.lang.Integer year) {
		setParameter("year", year);
	}

	public MaintenancePeriodsRequest withYear(java.lang.Integer year) {
		setParameter("year", year);
		return this;
	}


	public java.lang.String getCentralBank() {
		return (java.lang.String)getParameter("centralBank");
	}

	public String getCurrency() {
		return (String)getParameter("currency");
	}

	public java.lang.Integer getYear() {
		return (java.lang.Integer)getParameter("year");
	}


}