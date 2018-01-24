package com.clarusft.api.transform.risk;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.risk.ThetaResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ThetaResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.risk.ThetaResponse> {
	@Override
	public ThetaResponse parse(HttpResp httpResp, ThetaResponse resp) throws IOException {
		if (resp == null) {
			resp = new ThetaResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}