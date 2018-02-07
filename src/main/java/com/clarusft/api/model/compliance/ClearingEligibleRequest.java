package com.clarusft.api.model.compliance;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ClearingEligibleRequest extends com.clarusft.api.model.ApiRequest {
	public ClearingEligibleRequest() {
		super("Compliance", "ClearingEligible", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setTrade(String trade) {
		setParameter("trade", trade);
	}

	public ClearingEligibleRequest withTrade(String trade) {
		setParameter("trade", trade);
		return this;
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public ClearingEligibleRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}

	public void setCcp(String ccp) {
		setParameter("ccp", ccp);
	}

	public ClearingEligibleRequest withCcp(String ccp) {
		setParameter("ccp", ccp);
		return this;
	}


	public String getTrade() {
		return (String)getParameter("trade");
	}

	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}

	public String getCcp() {
		return (String)getParameter("ccp");
	}


}