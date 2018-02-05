package com.clarusft.api.transform.frtb;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.frtb.SAImpactResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class SAImpactResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.frtb.SAImpactResponse> {
	@Override
	public SAImpactResponse parse(HttpResp httpResp, SAImpactResponse resp) throws IOException {
		if (resp == null) {
			resp = new SAImpactResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}