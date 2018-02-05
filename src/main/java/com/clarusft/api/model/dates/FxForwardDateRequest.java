package com.clarusft.api.model.dates;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FxForwardDateRequest extends com.clarusft.api.model.ApiRequest {
	public FxForwardDateRequest() {
		super("Dates", "FxForwardDate", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setFx(String fx) {
		setParameter("fx", fx);
	}

	public FxForwardDateRequest withFx(String fx) {
		setParameter("fx", fx);
		return this;
	}


	public void setTradeDate(String tradeDate) {
		setParameter("tradeDate", tradeDate);
	}

	public FxForwardDateRequest withTradeDate(String tradeDate) {
		setParameter("tradeDate", tradeDate);
		return this;
	}


	public void setMaturities(String maturities) {
		setParameter("maturities", maturities);
	}

	public FxForwardDateRequest withMaturities(String maturities) {
		setParameter("maturities", maturities);
		return this;
	}


	public String getFx() {
		return (String)getParameter("fx");
	}

	public String getTradeDate() {
		return (String)getParameter("tradeDate");
	}

	public String getMaturities() {
		return (String)getParameter("maturities");
	}


}