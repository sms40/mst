package com.clarusft.api.transform.risk;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.risk.VaRResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class VaRResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.risk.VaRResponse> {
	@Override
	public VaRResponse parse(HttpResp httpResp, VaRResponse resp) throws IOException {
		if (resp == null) {
			resp = new VaRResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}