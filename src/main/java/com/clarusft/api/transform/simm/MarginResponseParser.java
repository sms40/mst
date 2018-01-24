package com.clarusft.api.transform.simm;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.simm.MarginResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class MarginResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.simm.MarginResponse> {
	@Override
	public MarginResponse parse(HttpResp httpResp, MarginResponse resp) throws IOException {
		if (resp == null) {
			resp = new MarginResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}