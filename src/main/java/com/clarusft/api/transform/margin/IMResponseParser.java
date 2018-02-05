package com.clarusft.api.transform.margin;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.margin.IMResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class IMResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.margin.IMResponse> {
	@Override
	public IMResponse parse(HttpResp httpResp, IMResponse resp) throws IOException {
		if (resp == null) {
			resp = new IMResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}