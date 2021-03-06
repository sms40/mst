package com.clarusft.api.model.util;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class PeriodLengthRequest extends com.clarusft.api.model.ApiRequest {
	public PeriodLengthRequest() {
		super("Util", "PeriodLength", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setStartDate(java.time.LocalDate startDate) {
		setParameter("startDate", startDate);
	}

	public PeriodLengthRequest withStartDate(java.time.LocalDate startDate) {
		setParameter("startDate", startDate);
		return this;
	}

	public void setEndDate(java.time.LocalDate endDate) {
		setParameter("endDate", endDate);
	}

	public PeriodLengthRequest withEndDate(java.time.LocalDate endDate) {
		setParameter("endDate", endDate);
		return this;
	}

	public void setDaycount(String daycount) {
		setParameter("daycount", daycount);
	}

	public PeriodLengthRequest withDaycount(String daycount) {
		setParameter("daycount", daycount);
		return this;
	}

	public void setHolidays(String holidays) {
		setParameter("holidays", holidays);
	}

	public PeriodLengthRequest withHolidays(String holidays) {
		setParameter("holidays", holidays);
		return this;
	}

	public void setBusDay(String busDay) {
		setParameter("busDay", busDay);
	}

	public PeriodLengthRequest withBusDay(String busDay) {
		setParameter("busDay", busDay);
		return this;
	}


	public java.time.LocalDate getStartDate() {
		return (java.time.LocalDate)getParameter("startDate");
	}

	public java.time.LocalDate getEndDate() {
		return (java.time.LocalDate)getParameter("endDate");
	}

	public String getDaycount() {
		return (String)getParameter("daycount");
	}

	public String getHolidays() {
		return (String)getParameter("holidays");
	}

	public String getBusDay() {
		return (String)getParameter("busDay");
	}


}