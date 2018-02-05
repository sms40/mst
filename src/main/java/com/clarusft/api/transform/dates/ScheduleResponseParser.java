package com.clarusft.api.transform.dates;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.dates.ScheduleResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ScheduleResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.dates.ScheduleResponse> {
	@Override
	public ScheduleResponse parse(HttpResp httpResp, ScheduleResponse resp) throws IOException {
		if (resp == null) {
			resp = new ScheduleResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}