package com.clarusft.api.transform.margin;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.margin.ImpactResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ImpactResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.margin.ImpactResponse> {
	@Override
	public ImpactResponse parse(HttpResp httpResp, ImpactResponse resp) throws IOException {
		if (resp == null) {
			resp = new ImpactResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}