package com.clarusft.api.transform.hedge;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.hedge.EquivalentsResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class EquivalentsResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.hedge.EquivalentsResponse> {
	@Override
	public EquivalentsResponse parse(HttpResp httpResp, EquivalentsResponse resp) throws IOException {
		if (resp == null) {
			resp = new EquivalentsResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}