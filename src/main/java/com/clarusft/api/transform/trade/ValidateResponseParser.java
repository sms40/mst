package com.clarusft.api.transform.trade;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.trade.ValidateResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ValidateResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.trade.ValidateResponse> {
	@Override
	public ValidateResponse parse(HttpResp httpResp, ValidateResponse resp) throws IOException {
		if (resp == null) {
			resp = new ValidateResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}