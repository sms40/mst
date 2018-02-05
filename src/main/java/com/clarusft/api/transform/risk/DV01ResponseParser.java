package com.clarusft.api.transform.risk;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.risk.DV01Response;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class DV01ResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.risk.DV01Response> {
	@Override
	public DV01Response parse(HttpResp httpResp, DV01Response resp) throws IOException {
		if (resp == null) {
			resp = new DV01Response();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}