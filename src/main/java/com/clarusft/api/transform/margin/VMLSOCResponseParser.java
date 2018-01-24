package com.clarusft.api.transform.margin;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.margin.VMLSOCResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class VMLSOCResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.margin.VMLSOCResponse> {
	@Override
	public VMLSOCResponse parse(HttpResp httpResp, VMLSOCResponse resp) throws IOException {
		if (resp == null) {
			resp = new VMLSOCResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}