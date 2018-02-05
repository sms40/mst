package com.clarusft.api.transform.market;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.market.FXRatesResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FXRatesResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.market.FXRatesResponse> {
	@Override
	public FXRatesResponse parse(HttpResp httpResp, FXRatesResponse resp) throws IOException {
		if (resp == null) {
			resp = new FXRatesResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}