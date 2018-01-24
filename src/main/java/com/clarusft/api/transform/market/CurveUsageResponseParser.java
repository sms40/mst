package com.clarusft.api.transform.market;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.market.CurveUsageResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class CurveUsageResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.market.CurveUsageResponse> {
	@Override
	public CurveUsageResponse parse(HttpResp httpResp, CurveUsageResponse resp) throws IOException {
		if (resp == null) {
			resp = new CurveUsageResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}