package com.clarusft.api.model.dates;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ScheduleRequest extends com.clarusft.api.model.ApiRequest {
	public ScheduleRequest() {
		super("Dates", "Schedule", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setStartDate(java.time.LocalDate startDate) {
		setParameter("startDate", startDate);
	}

	public ScheduleRequest withStartDate(java.time.LocalDate startDate) {
		setParameter("startDate", startDate);
		return this;
	}


	public void setEndDate(java.time.LocalDate endDate) {
		setParameter("endDate", endDate);
	}

	public ScheduleRequest withEndDate(java.time.LocalDate endDate) {
		setParameter("endDate", endDate);
		return this;
	}


	public void setRollConvention(String rollConvention) {
		setParameter("rollConvention", rollConvention);
	}

	public ScheduleRequest withRollConvention(String rollConvention) {
		setParameter("rollConvention", rollConvention);
		return this;
	}


	public void setFrequency(String frequency) {
		setParameter("frequency", frequency);
	}

	public ScheduleRequest withFrequency(String frequency) {
		setParameter("frequency", frequency);
		return this;
	}


	public void setCurrency(String currency) {
		setParameter("currency", currency);
	}

	public ScheduleRequest withCurrency(String currency) {
		setParameter("currency", currency);
		return this;
	}


	public void setBusDayConvention(String busDayConvention) {
		setParameter("busDayConvention", busDayConvention);
	}

	public ScheduleRequest withBusDayConvention(String busDayConvention) {
		setParameter("busDayConvention", busDayConvention);
		return this;
	}


	public java.time.LocalDate getStartDate() {
		return (java.time.LocalDate)getParameter("startDate");
	}

	public java.time.LocalDate getEndDate() {
		return (java.time.LocalDate)getParameter("endDate");
	}

	public String getRollConvention() {
		return (String)getParameter("rollConvention");
	}

	public String getFrequency() {
		return (String)getParameter("frequency");
	}

	public String getCurrency() {
		return (String)getParameter("currency");
	}

	public String getBusDayConvention() {
		return (String)getParameter("busDayConvention");
	}


}