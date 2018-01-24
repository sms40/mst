package com.clarusft.api.model.portfolio;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class SummaryRequest extends com.clarusft.api.model.ApiRequest {
	public SummaryRequest() {
		super("Portfolio", "Summary", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
	}

	public void setDataSource(java.lang.String dataSource) {
		setParameter("dataSource", dataSource);
	}

	public SummaryRequest withDataSource(java.lang.String dataSource) {
		setParameter("dataSource", dataSource);
		return this;
	}


	public java.lang.String getDataSource() {
		return (java.lang.String)getParameter("dataSource");
	}


}