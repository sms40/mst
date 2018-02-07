package com.clarusft.api.model.portfolio;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class SummaryRequest extends com.clarusft.api.model.ApiRequest {
	public SummaryRequest() {
		super("Portfolio", "Summary", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setDataSource(java.lang.String dataSource) {
		setParameter("dataSource", dataSource);
	}

	public SummaryRequest withDataSource(java.lang.String dataSource) {
		setParameter("dataSource", dataSource);
		return this;
	}

	public void setFilter(java.lang.String filter) {
		setParameter("filter", filter);
	}

	public SummaryRequest withFilter(java.lang.String filter) {
		setParameter("filter", filter);
		return this;
	}


	public java.lang.String getDataSource() {
		return (java.lang.String)getParameter("dataSource");
	}

	public java.lang.String getFilter() {
		return (java.lang.String)getParameter("filter");
	}


}