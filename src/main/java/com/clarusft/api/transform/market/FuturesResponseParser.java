package com.clarusft.api.transform.market;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.market.FuturesResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FuturesResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.market.FuturesResponse> {
	@Override
	public FuturesResponse parse(HttpResp httpResp, FuturesResponse resp) throws IOException {
		if (resp == null) {
			resp = new FuturesResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}