package com.clarusft.api.transform.util;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.util.TickersResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class TickersResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.util.TickersResponse> {
	@Override
	public TickersResponse parse(HttpResp httpResp, TickersResponse resp) throws IOException {
		if (resp == null) {
			resp = new TickersResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}