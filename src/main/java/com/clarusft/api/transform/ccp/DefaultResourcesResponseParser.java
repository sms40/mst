package com.clarusft.api.transform.ccp;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.ccp.DefaultResourcesResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class DefaultResourcesResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.ccp.DefaultResourcesResponse> {
	@Override
	public DefaultResourcesResponse parse(HttpResp httpResp, DefaultResourcesResponse resp) throws IOException {
		if (resp == null) {
			resp = new DefaultResourcesResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}