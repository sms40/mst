package com.clarusft.api.transform.margin;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.margin.VMBufferResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class VMBufferResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.margin.VMBufferResponse> {
	@Override
	public VMBufferResponse parse(HttpResp httpResp, VMBufferResponse resp) throws IOException {
		if (resp == null) {
			resp = new VMBufferResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}