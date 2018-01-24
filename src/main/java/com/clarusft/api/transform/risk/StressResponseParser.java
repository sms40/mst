package com.clarusft.api.transform.risk;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.risk.StressResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class StressResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.risk.StressResponse> {
	@Override
	public StressResponse parse(HttpResp httpResp, StressResponse resp) throws IOException {
		if (resp == null) {
			resp = new StressResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}