package com.clarusft.api.transform.portfolio;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.portfolio.CashByDateResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class CashByDateResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.portfolio.CashByDateResponse> {
	@Override
	public CashByDateResponse parse(HttpResp httpResp, CashByDateResponse resp) throws IOException {
		if (resp == null) {
			resp = new CashByDateResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}