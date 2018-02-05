package com.clarusft.api.transform.portfolio;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.portfolio.SummaryResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class SummaryResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.portfolio.SummaryResponse> {
	@Override
	public SummaryResponse parse(HttpResp httpResp, SummaryResponse resp) throws IOException {
		if (resp == null) {
			resp = new SummaryResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}