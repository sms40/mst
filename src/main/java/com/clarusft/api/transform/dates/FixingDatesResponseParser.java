package com.clarusft.api.transform.dates;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.dates.FixingDatesResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FixingDatesResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.dates.FixingDatesResponse> {
	@Override
	public FixingDatesResponse parse(HttpResp httpResp, FixingDatesResponse resp) throws IOException {
		if (resp == null) {
			resp = new FixingDatesResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}