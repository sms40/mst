package com.clarusft.api.transform.xva;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.xva.FVAResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FVAResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.xva.FVAResponse> {
	@Override
	public FVAResponse parse(HttpResp httpResp, FVAResponse resp) throws IOException {
		if (resp == null) {
			resp = new FVAResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}