package com.clarusft.api.transform.credit;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.credit.SACCRResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class SACCRResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.credit.SACCRResponse> {
	@Override
	public SACCRResponse parse(HttpResp httpResp, SACCRResponse resp) throws IOException {
		if (resp == null) {
			resp = new SACCRResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}