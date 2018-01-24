package com.clarusft.api.transform.risk;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.risk.IRGammaResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class IRGammaResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.risk.IRGammaResponse> {
	@Override
	public IRGammaResponse parse(HttpResp httpResp, IRGammaResponse resp) throws IOException {
		if (resp == null) {
			resp = new IRGammaResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}