package com.clarusft.api.transform.frtb;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.frtb.SAResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class SAResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.frtb.SAResponse> {
	@Override
	public SAResponse parse(HttpResp httpResp, SAResponse resp) throws IOException {
		if (resp == null) {
			resp = new SAResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}