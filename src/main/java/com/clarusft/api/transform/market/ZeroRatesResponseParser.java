package com.clarusft.api.transform.market;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.market.ZeroRatesResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ZeroRatesResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.market.ZeroRatesResponse> {
	@Override
	public ZeroRatesResponse parse(HttpResp httpResp, ZeroRatesResponse resp) throws IOException {
		if (resp == null) {
			resp = new ZeroRatesResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}