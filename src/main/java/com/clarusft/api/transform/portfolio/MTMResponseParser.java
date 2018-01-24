package com.clarusft.api.transform.portfolio;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.portfolio.MTMResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class MTMResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.portfolio.MTMResponse> {
	@Override
	public MTMResponse parse(HttpResp httpResp, MTMResponse resp) throws IOException {
		if (resp == null) {
			resp = new MTMResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}