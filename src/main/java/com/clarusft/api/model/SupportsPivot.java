package com.clarusft.api.model;

public interface SupportsPivot extends HasStats, HasAttributes {
	static final String KEY = "com.clarusft.api.model.SupportsPivot.pivotProvider";
	static final String VIEW_LATEST = "Latest";
	static final String CCY_USD = "USD";
	
	public default void setPivotProvider(PivotProvider provider) {
		setAttribute(KEY, provider);
	}
	
	public default PivotProvider getPivotProvider() {
		return (PivotProvider) getAttribute(KEY);
	}
	
	public void onPivot(PivotResponse pivotResponse);
	
	public default void pivot(String row, String col) {
		pivot(row, col, CCY_USD /*or null?*/, VIEW_LATEST);
	}
	
	public default void pivot(String row, String col, String ccy) {
		pivot(row, col, ccy, VIEW_LATEST);
	}
	
	public default void pivot(String row, String col, String ccy, String view) {
		PivotProvider provider = getPivotProvider();
		
		Integer gridId = getStatInteger("GridId");
		
		PivotResponse pivotResponse = provider.pivot(gridId, row, col, ccy, view);
		onPivot(pivotResponse);
	}
}
