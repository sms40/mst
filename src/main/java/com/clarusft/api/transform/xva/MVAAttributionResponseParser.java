package com.clarusft.api.transform.xva;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.xva.MVAAttributionResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class MVAAttributionResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.xva.MVAAttributionResponse> {
	@Override
	public MVAAttributionResponse parse(HttpResp httpResp, MVAAttributionResponse resp) throws IOException {
		if (resp == null) {
			resp = new MVAAttributionResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}