package com.clarusft.api.transform.trade;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.trade.ConvertResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ConvertResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.trade.ConvertResponse> {
	@Override
	public ConvertResponse parse(HttpResp httpResp, ConvertResponse resp) throws IOException {
		if (resp == null) {
			resp = new ConvertResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}