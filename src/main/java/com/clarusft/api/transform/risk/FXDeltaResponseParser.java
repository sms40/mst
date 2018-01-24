package com.clarusft.api.transform.risk;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.risk.FXDeltaResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FXDeltaResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.risk.FXDeltaResponse> {
	@Override
	public FXDeltaResponse parse(HttpResp httpResp, FXDeltaResponse resp) throws IOException {
		if (resp == null) {
			resp = new FXDeltaResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}