package com.clarusft.api.model.dates;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FixingDatesRequest extends com.clarusft.api.model.ApiRequest {
	public FixingDatesRequest() {
		super("Dates", "FixingDates", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
	}

	public void setFixingDate(String fixingDate) {
		setParameter("fixingDate", fixingDate);
	}

	public FixingDatesRequest withFixingDate(String fixingDate) {
		setParameter("fixingDate", fixingDate);
		return this;
	}


	public void setFloatingRateOption(String floatingRateOption) {
		setParameter("floatingRateOption", floatingRateOption);
	}

	public FixingDatesRequest withFloatingRateOption(String floatingRateOption) {
		setParameter("floatingRateOption", floatingRateOption);
		return this;
	}


	public void setMaturity(String maturity) {
		setParameter("maturity", maturity);
	}

	public FixingDatesRequest withMaturity(String maturity) {
		setParameter("maturity", maturity);
		return this;
	}


	public String getFixingDate() {
		return (String)getParameter("fixingDate");
	}

	public String getFloatingRateOption() {
		return (String)getParameter("floatingRateOption");
	}

	public String getMaturity() {
		return (String)getParameter("maturity");
	}


}