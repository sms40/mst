package com.clarusft.api.transform.risk;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.risk.VaRVectorsResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class VaRVectorsResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.risk.VaRVectorsResponse> {
	@Override
	public VaRVectorsResponse parse(HttpResp httpResp, VaRVectorsResponse resp) throws IOException {
		if (resp == null) {
			resp = new VaRVectorsResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}