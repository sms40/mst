package com.clarusft.api.transform.compliance;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.compliance.ClearingEligibleResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ClearingEligibleResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.compliance.ClearingEligibleResponse> {
	@Override
	public ClearingEligibleResponse parse(HttpResp httpResp, ClearingEligibleResponse resp) throws IOException {
		if (resp == null) {
			resp = new ClearingEligibleResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}