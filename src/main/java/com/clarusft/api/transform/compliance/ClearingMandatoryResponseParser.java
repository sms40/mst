package com.clarusft.api.transform.compliance;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.compliance.ClearingMandatoryResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ClearingMandatoryResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.compliance.ClearingMandatoryResponse> {
	@Override
	public ClearingMandatoryResponse parse(HttpResp httpResp, ClearingMandatoryResponse resp) throws IOException {
		if (resp == null) {
			resp = new ClearingMandatoryResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}