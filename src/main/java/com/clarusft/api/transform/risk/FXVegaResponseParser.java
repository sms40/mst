package com.clarusft.api.transform.risk;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.risk.FXVegaResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FXVegaResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.risk.FXVegaResponse> {
	@Override
	public FXVegaResponse parse(HttpResp httpResp, FXVegaResponse resp) throws IOException {
		if (resp == null) {
			resp = new FXVegaResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}