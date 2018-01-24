package com.clarusft.api.transform.hedge;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.hedge.Equivalents01Response;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class Equivalents01ResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.hedge.Equivalents01Response> {
	@Override
	public Equivalents01Response parse(HttpResp httpResp, Equivalents01Response resp) throws IOException {
		if (resp == null) {
			resp = new Equivalents01Response();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}