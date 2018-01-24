package com.clarusft.api.model.sdr;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class VolumeRequest extends com.clarusft.api.model.ApiRequest {
	public VolumeRequest() {
		super("SDR", "Volume", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
	}

	public void setTicker(String ticker) {
		setParameter("ticker", ticker);
	}

	public VolumeRequest withTicker(String ticker) {
		setParameter("ticker", ticker);
		return this;
	}


	public void setReportDate(java.time.LocalDate reportDate) {
		setParameter("reportDate", reportDate);
	}

	public VolumeRequest withReportDate(java.time.LocalDate reportDate) {
		setParameter("reportDate", reportDate);
		return this;
	}


	public void setStartDate(java.time.LocalDate startDate) {
		setParameter("startDate", startDate);
	}

	public VolumeRequest withStartDate(java.time.LocalDate startDate) {
		setParameter("startDate", startDate);
		return this;
	}


	public void setEndDate(java.time.LocalDate endDate) {
		setParameter("endDate", endDate);
	}

	public VolumeRequest withEndDate(java.time.LocalDate endDate) {
		setParameter("endDate", endDate);
		return this;
	}


	public void setCleared(String cleared) {
		setParameter("cleared", cleared);
	}

	public VolumeRequest withCleared(String cleared) {
		setParameter("cleared", cleared);
		return this;
	}


	public void setSef(String sef) {
		setParameter("sef", sef);
	}

	public VolumeRequest withSef(String sef) {
		setParameter("sef", sef);
		return this;
	}


	public void setSource(String source) {
		setParameter("source", source);
	}

	public VolumeRequest withSource(String source) {
		setParameter("source", source);
		return this;
	}


	public void setVolumeType(String volumeType) {
		setParameter("volumeType", volumeType);
	}

	public VolumeRequest withVolumeType(String volumeType) {
		setParameter("volumeType", volumeType);
		return this;
	}


	public String getTicker() {
		return (String)getParameter("ticker");
	}

	public java.time.LocalDate getReportDate() {
		return (java.time.LocalDate)getParameter("reportDate");
	}

	public java.time.LocalDate getStartDate() {
		return (java.time.LocalDate)getParameter("startDate");
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

	public String getVolumeType() {
		return (String)getParameter("volumeType");
	}


}