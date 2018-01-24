package com.clarusft.api.transform.risk;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.risk.IRDeltaResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class IRDeltaResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.risk.IRDeltaResponse> {
	@Override
	public IRDeltaResponse parse(HttpResp httpResp, IRDeltaResponse resp) throws IOException {
		if (resp == null) {
			resp = new IRDeltaResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}