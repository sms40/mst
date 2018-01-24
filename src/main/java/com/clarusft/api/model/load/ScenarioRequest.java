package com.clarusft.api.model.load;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ScenarioRequest extends com.clarusft.api.model.ApiRequest {
	public ScenarioRequest() {
		super("Load", "Scenario", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
	}

	public void setScenarioId(java.lang.String scenarioId) {
		setParameter("scenarioId", scenarioId);
	}

	public ScenarioRequest withScenarioId(java.lang.String scenarioId) {
		setParameter("scenarioId", scenarioId);
		return this;
	}


	public void setShifts(java.lang.String shifts) {
		setParameter("shifts", shifts);
	}

	public ScenarioRequest withShifts(java.lang.String shifts) {
		setParameter("shifts", shifts);
		return this;
	}


	public void setFactorExpression(java.lang.String factorExpression) {
		setParameter("factorExpression", factorExpression);
	}

	public ScenarioRequest withFactorExpression(java.lang.String factorExpression) {
		setParameter("factorExpression", factorExpression);
		return this;
	}


	public void setShiftType(String shiftType) {
		setParameter("shiftType", shiftType);
	}

	public ScenarioRequest withShiftType(String shiftType) {
		setParameter("shiftType", shiftType);
		return this;
	}


	public java.lang.String getScenarioId() {
		return (java.lang.String)getParameter("scenarioId");
	}

	public java.lang.String getShifts() {
		return (java.lang.String)getParameter("shifts");
	}

	public java.lang.String getFactorExpression() {
		return (java.lang.String)getParameter("factorExpression");
	}

	public String getShiftType() {
		return (String)getParameter("shiftType");
	}


}