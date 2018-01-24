package com.clarusft.api.transform.margin;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.margin.OptimiserResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class OptimiserResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.margin.OptimiserResponse> {
	@Override
	public OptimiserResponse parse(HttpResp httpResp, OptimiserResponse resp) throws IOException {
		if (resp == null) {
			resp = new OptimiserResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}