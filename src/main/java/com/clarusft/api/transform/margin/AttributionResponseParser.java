package com.clarusft.api.transform.margin;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.margin.AttributionResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class AttributionResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.margin.AttributionResponse> {
	@Override
	public AttributionResponse parse(HttpResp httpResp, AttributionResponse resp) throws IOException {
		if (resp == null) {
			resp = new AttributionResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}