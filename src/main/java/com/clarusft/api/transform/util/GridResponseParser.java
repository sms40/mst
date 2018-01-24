package com.clarusft.api.transform.util;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.util.GridResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class GridResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.util.GridResponse> {
	@Override
	public GridResponse parse(HttpResp httpResp, GridResponse resp) throws IOException {
		if (resp == null) {
			resp = new GridResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}