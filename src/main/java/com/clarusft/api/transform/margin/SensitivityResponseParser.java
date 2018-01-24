package com.clarusft.api.transform.margin;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.margin.SensitivityResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class SensitivityResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.margin.SensitivityResponse> {
	@Override
	public SensitivityResponse parse(HttpResp httpResp, SensitivityResponse resp) throws IOException {
		if (resp == null) {
			resp = new SensitivityResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}