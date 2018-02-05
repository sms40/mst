package com.clarusft.api.transform.sdr;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.sdr.TradeFilterResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class TradeFilterResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.sdr.TradeFilterResponse> {
	@Override
	public TradeFilterResponse parse(HttpResp httpResp, TradeFilterResponse resp) throws IOException {
		if (resp == null) {
			resp = new TradeFilterResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}