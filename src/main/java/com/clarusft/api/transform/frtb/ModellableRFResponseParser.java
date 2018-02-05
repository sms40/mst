package com.clarusft.api.transform.frtb;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.frtb.ModellableRFResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ModellableRFResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.frtb.ModellableRFResponse> {
	@Override
	public ModellableRFResponse parse(HttpResp httpResp, ModellableRFResponse resp) throws IOException {
		if (resp == null) {
			resp = new ModellableRFResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}