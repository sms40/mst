package com.clarusft.api.transform.compliance;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.compliance.SEFMandatoryResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class SEFMandatoryResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.compliance.SEFMandatoryResponse> {
	@Override
	public SEFMandatoryResponse parse(HttpResp httpResp, SEFMandatoryResponse resp) throws IOException {
		if (resp == null) {
			resp = new SEFMandatoryResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}