package com.clarusft.api.transform.dates;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.dates.MaintenancePeriodsResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class MaintenancePeriodsResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.dates.MaintenancePeriodsResponse> {
	@Override
	public MaintenancePeriodsResponse parse(HttpResp httpResp, MaintenancePeriodsResponse resp) throws IOException {
		if (resp == null) {
			resp = new MaintenancePeriodsResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}