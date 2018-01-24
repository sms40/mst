package com.clarusft.api.transform.sdr;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.sdr.LastTradeResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class LastTradeResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.sdr.LastTradeResponse> {
	@Override
	public LastTradeResponse parse(HttpResp httpResp, LastTradeResponse resp) throws IOException {
		if (resp == null) {
			resp = new LastTradeResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}