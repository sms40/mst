package com.clarusft.api.transform.frtb;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.frtb.ModellableRFTradesResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ModellableRFTradesResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.frtb.ModellableRFTradesResponse> {
	@Override
	public ModellableRFTradesResponse parse(HttpResp httpResp, ModellableRFTradesResponse resp) throws IOException {
		if (resp == null) {
			resp = new ModellableRFTradesResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}