package com.clarusft.api.model;

public class DrilldownResponse extends DefaultCsvResponse 
implements SupportsDrilldown, SupportsPivot, SupportsFilter, SupportsTranspose {
	private DrilldownProvider drilldownProvider;
	
	@Override
	public void setDrilldownProvider(DrilldownProvider drilldownProvider) {
		this.drilldownProvider = drilldownProvider;
	}

	@Override
	public DrilldownProvider getDrilldownProvider() {
		return drilldownProvider;
	}

}
