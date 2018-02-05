package com.clarusft.api.model.util;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class GridRequest extends com.clarusft.api.model.ApiRequest {
	public GridRequest() {
		super("Util", "Grid", com.clarusft.api.http.OutputTypes.CSV, com.clarusft.api.http.HttpMethod.POST);
	}

	public void setView(String view) {
		setParameter("view", view);
	}

	public GridRequest withView(String view) {
		setParameter("view", view);
		return this;
	}


	public void setReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
	}

	public GridRequest withReportCcy(java.lang.String reportCcy) {
		setParameter("reportCcy", reportCcy);
		return this;
	}


	public void setRow(java.lang.String row) {
		setParameter("row", row);
	}

	public GridRequest withRow(java.lang.String row) {
		setParameter("row", row);
		return this;
	}


	public void setCol(java.lang.String col) {
		setParameter("col", col);
	}

	public GridRequest withCol(java.lang.String col) {
		setParameter("col", col);
		return this;
	}


	public void setFilter(java.lang.String filter) {
		setParameter("filter", filter);
	}

	public GridRequest withFilter(java.lang.String filter) {
		setParameter("filter", filter);
		return this;
	}


	public void setGridId(java.lang.Integer gridId) {
		setParameter("GridId", gridId);
	}

	public GridRequest withGridId(java.lang.Integer gridId) {
		setParameter("GridId", gridId);
		return this;
	}


	public void setDrilldownRow(java.lang.String drilldownRow) {
		setParameter("drilldownRow", drilldownRow);
	}

	public GridRequest withDrilldownRow(java.lang.String drilldownRow) {
		setParameter("drilldownRow", drilldownRow);
		return this;
	}


	public void setDrilldownCol(java.lang.String drilldownCol) {
		setParameter("drilldownCol", drilldownCol);
	}

	public GridRequest withDrilldownCol(java.lang.String drilldownCol) {
		setParameter("drilldownCol", drilldownCol);
		return this;
	}


	public void setDrilldownView(String drilldownView) {
		setParameter("drilldownView", drilldownView);
	}

	public GridRequest withDrilldownView(String drilldownView) {
		setParameter("drilldownView", drilldownView);
		return this;
	}


	public void setMaxRows(java.lang.Integer maxRows) {
		setParameter("maxRows", maxRows);
	}

	public GridRequest withMaxRows(java.lang.Integer maxRows) {
		setParameter("maxRows", maxRows);
		return this;
	}


	public void setMaxCols(java.lang.Integer maxCols) {
		setParameter("maxCols", maxCols);
	}

	public GridRequest withMaxCols(java.lang.Integer maxCols) {
		setParameter("maxCols", maxCols);
		return this;
	}


	public void setTotalRow(java.lang.Boolean totalRow) {
		setParameter("totalRow", totalRow);
	}

	public GridRequest withTotalRow(java.lang.Boolean totalRow) {
		setParameter("totalRow", totalRow);
		return this;
	}


	public void setTotalCol(java.lang.Boolean totalCol) {
		setParameter("totalCol", totalCol);
	}

	public GridRequest withTotalCol(java.lang.Boolean totalCol) {
		setParameter("totalCol", totalCol);
		return this;
	}


	public String getView() {
		return (String)getParameter("view");
	}

	public java.lang.String getReportCcy() {
		return (java.lang.String)getParameter("reportCcy");
	}

	public java.lang.String getRow() {
		return (java.lang.String)getParameter("row");
	}

	public java.lang.String getCol() {
		return (java.lang.String)getParameter("col");
	}

	public java.lang.String getFilter() {
		return (java.lang.String)getParameter("filter");
	}

	public java.lang.Integer getGridId() {
		return (java.lang.Integer)getParameter("GridId");
	}

	public java.lang.String getDrilldownRow() {
		return (java.lang.String)getParameter("drilldownRow");
	}

	public java.lang.String getDrilldownCol() {
		return (java.lang.String)getParameter("drilldownCol");
	}

	public String getDrilldownView() {
		return (String)getParameter("drilldownView");
	}

	public java.lang.Integer getMaxRows() {
		return (java.lang.Integer)getParameter("maxRows");
	}

	public java.lang.Integer getMaxCols() {
		return (java.lang.Integer)getParameter("maxCols");
	}

	public java.lang.Boolean getTotalRow() {
		return (java.lang.Boolean)getParameter("totalRow");
	}

	public java.lang.Boolean getTotalCol() {
		return (java.lang.Boolean)getParameter("totalCol");
	}


}