package com.clarusft.api.transform.market;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.market.ParRatesResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ParRatesResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.market.ParRatesResponse> {
	@Override
	public ParRatesResponse parse(HttpResp httpResp, ParRatesResponse resp) throws IOException {
		if (resp == null) {
			resp = new ParRatesResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}