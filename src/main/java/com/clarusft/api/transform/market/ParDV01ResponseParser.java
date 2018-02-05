package com.clarusft.api.transform.market;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.market.ParDV01Response;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ParDV01ResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.market.ParDV01Response> {
	@Override
	public ParDV01Response parse(HttpResp httpResp, ParDV01Response resp) throws IOException {
		if (resp == null) {
			resp = new ParDV01Response();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}