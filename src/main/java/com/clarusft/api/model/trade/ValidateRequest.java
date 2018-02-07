package com.clarusft.api.model.trade;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ValidateRequest extends com.clarusft.api.model.ApiRequest {
	public ValidateRequest() {
		super("Trade", "Validate", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setTrades(String trades) {
		setParameter("trades", trades);
	}

	public ValidateRequest withTrades(String trades) {
		setParameter("trades", trades);
		return this;
	}

	public void setRuleFilter(String ruleFilter) {
		setParameter("ruleFilter", ruleFilter);
	}

	public ValidateRequest withRuleFilter(String ruleFilter) {
		setParameter("ruleFilter", ruleFilter);
		return this;
	}


	public String getTrades() {
		return (String)getParameter("trades");
	}

	public String getRuleFilter() {
		return (String)getParameter("ruleFilter");
	}


}