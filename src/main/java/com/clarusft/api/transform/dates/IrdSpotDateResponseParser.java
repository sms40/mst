package com.clarusft.api.transform.dates;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.dates.IrdSpotDateResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class IrdSpotDateResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.dates.IrdSpotDateResponse> {
	@Override
	public IrdSpotDateResponse parse(HttpResp httpResp, IrdSpotDateResponse resp) throws IOException {
		if (resp == null) {
			resp = new IrdSpotDateResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}