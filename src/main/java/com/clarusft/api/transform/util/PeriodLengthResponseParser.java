package com.clarusft.api.transform.util;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.util.PeriodLengthResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class PeriodLengthResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.util.PeriodLengthResponse> {
	@Override
	public PeriodLengthResponse parse(HttpResp httpResp, PeriodLengthResponse resp) throws IOException {
		if (resp == null) {
			resp = new PeriodLengthResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}