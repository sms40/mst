package com.clarusft.api.model.dates;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FxOptionDateRequest extends com.clarusft.api.model.ApiRequest {
	public FxOptionDateRequest() {
		super("Dates", "FxOptionDate", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
	}

	public void setFx(String fx) {
		setParameter("fx", fx);
	}

	public FxOptionDateRequest withFx(String fx) {
		setParameter("fx", fx);
		return this;
	}


	public void setTradeDate(String tradeDate) {
		setParameter("tradeDate", tradeDate);
	}

	public FxOptionDateRequest withTradeDate(String tradeDate) {
		setParameter("tradeDate", tradeDate);
		return this;
	}


	public void setMaturities(String maturities) {
		setParameter("maturities", maturities);
	}

	public FxOptionDateRequest withMaturities(String maturities) {
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