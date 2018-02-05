package com.clarusft.api.transform.market;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.market.DFResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class DFResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.market.DFResponse> {
	@Override
	public DFResponse parse(HttpResp httpResp, DFResponse resp) throws IOException {
		if (resp == null) {
			resp = new DFResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}