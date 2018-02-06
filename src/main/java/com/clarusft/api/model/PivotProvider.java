package com.clarusft.api.model;

import com.clarusft.api.exception.ApiException;

public interface PivotProvider {
	public abstract PivotResponse pivot(Integer gridId, String row, String col, String ccy, String view) throws ApiException;
}
