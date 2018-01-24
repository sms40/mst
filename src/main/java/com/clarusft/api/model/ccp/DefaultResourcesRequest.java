package com.clarusft.api.model.ccp;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class DefaultResourcesRequest extends com.clarusft.api.model.ApiRequest {
	public DefaultResourcesRequest() {
		super("CCP", "DefaultResources", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
	}

	public void setReportDate(java.time.LocalDate reportDate) {
		setParameter("reportDate", reportDate);
	}

	public DefaultResourcesRequest withReportDate(java.time.LocalDate reportDate) {
		setParameter("reportDate", reportDate);
		return this;
	}


	public void setClearingHouse(String clearingHouse) {
		setParameter("clearingHouse", clearingHouse);
	}

	public DefaultResourcesRequest withClearingHouse(String clearingHouse) {
		setParameter("clearingHouse", clearingHouse);
		return this;
	}


	public void setReportLevelIdentifier(String reportLevelIdentifier) {
		setParameter("reportLevelIdentifier", reportLevelIdentifier);
	}

	public DefaultResourcesRequest withReportLevelIdentifier(String reportLevelIdentifier) {
		setParameter("reportLevelIdentifier", reportLevelIdentifier);
		return this;
	}


	public java.time.LocalDate getReportDate() {
		return (java.time.LocalDate)getParameter("reportDate");
	}

	public String getClearingHouse() {
		return (String)getParameter("clearingHouse");
	}

	public String getReportLevelIdentifier() {
		return (String)getParameter("reportLevelIdentifier");
	}


}