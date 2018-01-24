package com.clarusft.api.transform.margin;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.margin.VMResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class VMResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.margin.VMResponse> {
	@Override
	public VMResponse parse(HttpResp httpResp, VMResponse resp) throws IOException {
		if (resp == null) {
			resp = new VMResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}