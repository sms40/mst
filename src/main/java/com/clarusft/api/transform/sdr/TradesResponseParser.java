package com.clarusft.api.transform.sdr;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.sdr.TradesResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class TradesResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.sdr.TradesResponse> {
	@Override
	public TradesResponse parse(HttpResp httpResp, TradesResponse resp) throws IOException {
		if (resp == null) {
			resp = new TradesResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}