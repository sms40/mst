package com.clarusft.api.model;

public interface SupportsDrilldown extends HasStats, HasAttributes {
	static final String KEY = "com.clarusft.api.model.SupportsDrilldown.drilldownProvider";
	
	public default void setDrilldownProvider(DrilldownProvider drilldownProvider) {
		setAttribute(KEY, drilldownProvider);
	}
	
	public default DrilldownProvider getDrilldownProvider() {
		return (DrilldownProvider) getAttribute(KEY);
	}
	
	public default DrilldownResponse drilldown(String row, String col, String view) {
		DrilldownProvider drilldownProvider = getDrilldownProvider();
		
		Integer gridId = null;
		
		String gridIdS = getStats().get("GridId");
		if (gridIdS != null) {
			gridId = Integer.parseInt(gridIdS);
		}
		
		return drilldownProvider.drilldown(gridId, row, col, view);
	}
}
