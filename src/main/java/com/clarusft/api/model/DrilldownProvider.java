package com.clarusft.api.model;

import com.clarusft.api.exception.ApiException;

public interface DrilldownProvider {
	public abstract DrilldownResponse drilldown(Integer gridId, String row, String col, String view) throws ApiException;
}
