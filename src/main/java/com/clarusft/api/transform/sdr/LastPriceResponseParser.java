package com.clarusft.api.transform.sdr;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.sdr.LastPriceResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class LastPriceResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.sdr.LastPriceResponse> {
	@Override
	public LastPriceResponse parse(HttpResp httpResp, LastPriceResponse resp) throws IOException {
		if (resp == null) {
			resp = new LastPriceResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}