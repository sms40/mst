package com.clarusft.api.transform.trade;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.trade.CashflowsResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class CashflowsResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.trade.CashflowsResponse> {
	@Override
	public CashflowsResponse parse(HttpResp httpResp, CashflowsResponse resp) throws IOException {
		if (resp == null) {
			resp = new CashflowsResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}