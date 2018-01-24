package com.clarusft.api.transform.dates;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.dates.FxForwardDateResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FxForwardDateResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.dates.FxForwardDateResponse> {
	@Override
	public FxForwardDateResponse parse(HttpResp httpResp, FxForwardDateResponse resp) throws IOException {
		if (resp == null) {
			resp = new FxForwardDateResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}