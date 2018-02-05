package com.clarusft.api.model.load;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class LadderRequest extends com.clarusft.api.model.ApiRequest {
	public LadderRequest() {
		super("Load", "Ladder", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setLadderId(java.lang.String ladderId) {
		setParameter("ladderId", ladderId);
	}

	public LadderRequest withLadderId(java.lang.String ladderId) {
		setParameter("ladderId", ladderId);
		return this;
	}


	public void setTenors(java.util.Collection<String> tenors) {
		setParameter("tenors", tenors);
	}

	public LadderRequest withTenors(java.util.Collection<String> tenors) {
		setParameter("tenors", tenors);
		return this;
	}

	public void setTenors(String... tenors) {
		setParameter("tenors", java.util.Arrays.asList(tenors));
	}

	public LadderRequest withTenors(String... tenors) {
		setParameter("tenors", java.util.Arrays.asList(tenors));
		return this;
	}


	public java.lang.String getLadderId() {
		return (java.lang.String)getParameter("ladderId");
	}

	@SuppressWarnings("unchecked")
	public java.util.Collection<String> getTenors() {
		return (java.util.Collection<String>)getParameter("tenors");
	}


}