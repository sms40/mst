package com.clarusft.api.transform.portfolio;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.portfolio.CashResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class CashResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.portfolio.CashResponse> {
	@Override
	public CashResponse parse(HttpResp httpResp, CashResponse resp) throws IOException {
		if (resp == null) {
			resp = new CashResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}