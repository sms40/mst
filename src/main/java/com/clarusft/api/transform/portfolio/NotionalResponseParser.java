package com.clarusft.api.transform.portfolio;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.portfolio.NotionalResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class NotionalResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.portfolio.NotionalResponse> {
	@Override
	public NotionalResponse parse(HttpResp httpResp, NotionalResponse resp) throws IOException {
		if (resp == null) {
			resp = new NotionalResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}