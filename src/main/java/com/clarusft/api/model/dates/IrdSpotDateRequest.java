package com.clarusft.api.model.dates;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class IrdSpotDateRequest extends com.clarusft.api.model.ApiRequest {
	public IrdSpotDateRequest() {
		super("Dates", "IrdSpotDate", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
	}

	public void setCurrency(String currency) {
		setParameter("currency", currency);
	}

	public IrdSpotDateRequest withCurrency(String currency) {
		setParameter("currency", currency);
		return this;
	}


	public void setTradeDate(String tradeDate) {
		setParameter("tradeDate", tradeDate);
	}

	public IrdSpotDateRequest withTradeDate(String tradeDate) {
		setParameter("tradeDate", tradeDate);
		return this;
	}


	public String getCurrency() {
		return (String)getParameter("currency");
	}

	public String getTradeDate() {
		return (String)getParameter("tradeDate");
	}


}