package com.clarusft.api.model.sdr;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class VolumeADVRequest extends com.clarusft.api.model.ApiRequest {
	public VolumeADVRequest() {
		super("SDR", "VolumeADV", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setTicker(java.lang.String ticker) {
		setParameter("ticker", ticker);
	}

	public VolumeADVRequest withTicker(java.lang.String ticker) {
		setParameter("ticker", ticker);
		return this;
	}

	public void setReportDate(java.time.LocalDate reportDate) {
		setParameter("reportDate", reportDate);
	}

	public VolumeADVRequest withReportDate(java.time.LocalDate reportDate) {
		setParameter("reportDate", reportDate);
		return this;
	}

	public void setCleared(String cleared) {
		setParameter("cleared", cleared);
	}

	public VolumeADVRequest withCleared(String cleared) {
		setParameter("cleared", cleared);
		return this;
	}

	public void setSef(String sef) {
		setParameter("sef", sef);
	}

	public VolumeADVRequest withSef(String sef) {
		setParameter("sef", sef);
		return this;
	}

	public void setSource(String source) {
		setParameter("source", source);
	}

	public VolumeADVRequest withSource(String source) {
		setParameter("source", source);
		return this;
	}

	public void setVolumeType(String volumeType) {
		setParameter("volumeType", volumeType);
	}

	public VolumeADVRequest withVolumeType(String volumeType) {
		setParameter("volumeType", volumeType);
		return this;
	}


	public java.lang.String getTicker() {
		return (java.lang.String)getParameter("ticker");
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

	public String getVolumeType() {
		return (String)getParameter("volumeType");
	}


}