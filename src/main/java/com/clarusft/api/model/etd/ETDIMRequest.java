package com.clarusft.api.model.etd;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ETDIMRequest extends com.clarusft.api.model.ApiRequest {
	public ETDIMRequest() {
		super("ETD", "ETDIM", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setEtdportfolio(java.lang.String etdportfolio) {
		setParameter("etdportfolio", etdportfolio);
	}

	public ETDIMRequest withEtdportfolio(java.lang.String etdportfolio) {
		setParameter("etdportfolio", etdportfolio);
		return this;
	}


	public void setDetail(java.lang.String detail) {
		setParameter("detail", detail);
	}

	public ETDIMRequest withDetail(java.lang.String detail) {
		setParameter("detail", detail);
		return this;
	}


	public java.lang.String getEtdportfolio() {
		return (java.lang.String)getParameter("etdportfolio");
	}

	public java.lang.String getDetail() {
		return (java.lang.String)getParameter("detail");
	}


}