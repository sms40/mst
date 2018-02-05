package com.clarusft.api.transform.xva;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.xva.SensitivityResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class SensitivityResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.xva.SensitivityResponse> {
	@Override
	public SensitivityResponse parse(HttpResp httpResp, SensitivityResponse resp) throws IOException {
		if (resp == null) {
			resp = new SensitivityResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}