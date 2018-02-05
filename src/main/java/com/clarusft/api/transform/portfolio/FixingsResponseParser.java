package com.clarusft.api.transform.portfolio;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.portfolio.FixingsResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FixingsResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.portfolio.FixingsResponse> {
	@Override
	public FixingsResponse parse(HttpResp httpResp, FixingsResponse resp) throws IOException {
		if (resp == null) {
			resp = new FixingsResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}