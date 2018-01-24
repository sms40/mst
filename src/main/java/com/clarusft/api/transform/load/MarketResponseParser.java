package com.clarusft.api.transform.load;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.load.MarketResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class MarketResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.load.MarketResponse> {
	@Override
	public MarketResponse parse(HttpResp httpResp, MarketResponse resp) throws IOException {
		if (resp == null) {
			resp = new MarketResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}