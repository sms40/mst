package com.clarusft.api.transform.simm;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.simm.BackTestResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class BackTestResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.simm.BackTestResponse> {
	@Override
	public BackTestResponse parse(HttpResp httpResp, BackTestResponse resp) throws IOException {
		if (resp == null) {
			resp = new BackTestResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}