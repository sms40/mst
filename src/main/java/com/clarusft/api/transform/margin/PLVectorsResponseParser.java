package com.clarusft.api.transform.margin;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.margin.PLVectorsResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class PLVectorsResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.margin.PLVectorsResponse> {
	@Override
	public PLVectorsResponse parse(HttpResp httpResp, PLVectorsResponse resp) throws IOException {
		if (resp == null) {
			resp = new PLVectorsResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}