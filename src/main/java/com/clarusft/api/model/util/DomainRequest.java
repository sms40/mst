package com.clarusft.api.model.util;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class DomainRequest extends com.clarusft.api.model.ApiRequest {
	public DomainRequest() {
		super("Util", "Domain", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setDomainId(java.lang.String domainId) {
		setParameter("domainId", domainId);
	}

	public DomainRequest withDomainId(java.lang.String domainId) {
		setParameter("domainId", domainId);
		return this;
	}


	public java.lang.String getDomainId() {
		return (java.lang.String)getParameter("domainId");
	}


}