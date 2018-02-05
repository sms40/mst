package com.clarusft.api.transform.risk;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.risk.IRVegaResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class IRVegaResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.risk.IRVegaResponse> {
	@Override
	public IRVegaResponse parse(HttpResp httpResp, IRVegaResponse resp) throws IOException {
		if (resp == null) {
			resp = new IRVegaResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}