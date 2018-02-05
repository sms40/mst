package com.clarusft.api.transform.util;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.util.DomainResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class DomainResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.util.DomainResponse> {
	@Override
	public DomainResponse parse(HttpResp httpResp, DomainResponse resp) throws IOException {
		if (resp == null) {
			resp = new DomainResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}