package com.clarusft.api.transform.portfolio;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.portfolio.TradesResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class TradesResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.portfolio.TradesResponse> {
	@Override
	public TradesResponse parse(HttpResp httpResp, TradesResponse resp) throws IOException {
		if (resp == null) {
			resp = new TradesResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}