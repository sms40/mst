package com.clarusft.api.transform.trade;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.trade.PriceResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class PriceResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.trade.PriceResponse> {
	@Override
	public PriceResponse parse(HttpResp httpResp, PriceResponse resp) throws IOException {
		if (resp == null) {
			resp = new PriceResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}