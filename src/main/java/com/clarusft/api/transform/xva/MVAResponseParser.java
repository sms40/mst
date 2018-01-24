package com.clarusft.api.transform.xva;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.xva.MVAResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class MVAResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.xva.MVAResponse> {
	@Override
	public MVAResponse parse(HttpResp httpResp, MVAResponse resp) throws IOException {
		if (resp == null) {
			resp = new MVAResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}