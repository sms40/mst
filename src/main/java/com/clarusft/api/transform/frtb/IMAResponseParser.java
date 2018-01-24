package com.clarusft.api.transform.frtb;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.frtb.IMAResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class IMAResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.frtb.IMAResponse> {
	@Override
	public IMAResponse parse(HttpResp httpResp, IMAResponse resp) throws IOException {
		if (resp == null) {
			resp = new IMAResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}