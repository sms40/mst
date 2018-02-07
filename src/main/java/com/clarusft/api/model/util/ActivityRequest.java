package com.clarusft.api.model.util;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ActivityRequest extends com.clarusft.api.model.ApiRequest {
	public ActivityRequest() {
		super("Util", "Activity", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setPeriod(java.lang.String period) {
		setParameter("period", period);
	}

	public ActivityRequest withPeriod(java.lang.String period) {
		setParameter("period", period);
		return this;
	}

	public void setSource(java.lang.String source) {
		setParameter("Source", source);
	}

	public ActivityRequest withSource(java.lang.String source) {
		setParameter("Source", source);
		return this;
	}

	public void setService(java.lang.String service) {
		setParameter("Service", service);
	}

	public ActivityRequest withService(java.lang.String service) {
		setParameter("Service", service);
		return this;
	}

	public void setStatus(java.lang.String status) {
		setParameter("Status", status);
	}

	public ActivityRequest withStatus(java.lang.String status) {
		setParameter("Status", status);
		return this;
	}

	public void setRow(java.lang.String row) {
		setParameter("row", row);
	}

	public ActivityRequest withRow(java.lang.String row) {
		setParameter("row", row);
		return this;
	}

	public void setFilter(java.lang.String filter) {
		setParameter("filter", filter);
	}

	public ActivityRequest withFilter(java.lang.String filter) {
		setParameter("filter", filter);
		return this;
	}


	public java.lang.String getPeriod() {
		return (java.lang.String)getParameter("period");
	}

	public java.lang.String getSource() {
		return (java.lang.String)getParameter("Source");
	}

	public java.lang.String getService() {
		return (java.lang.String)getParameter("Service");
	}

	public java.lang.String getStatus() {
		return (java.lang.String)getParameter("Status");
	}

	public java.lang.String getRow() {
		return (java.lang.String)getParameter("row");
	}

	public java.lang.String getFilter() {
		return (java.lang.String)getParameter("filter");
	}


}