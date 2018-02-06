package com.clarusft.api.model;

public interface SupportsDrilldown extends HasStats, HasAttributes {
	static final String KEY = "com.clarusft.api.model.SupportsDrilldown.drilldownProvider";
	static final String VIEW_DEFAULT = "Default";
	
	public default void setDrilldownProvider(DrilldownProvider drilldownProvider) {
		setAttribute(KEY, drilldownProvider);
	}
	
	public default DrilldownProvider getDrilldownProvider() {
		return (DrilldownProvider) getAttribute(KEY);
	}
	
	public default DrilldownResponse drilldown(String row, String col) {
		return drilldown(row, col, VIEW_DEFAULT);
	}
	
	public default DrilldownResponse drilldown(String row, String col, String view) {
		DrilldownProvider drilldownProvider = getDrilldownProvider();
		
		Integer gridId = getStatInteger("GridId");
		
		return drilldownProvider.drilldown(gridId, row, col, view);
	}
}
