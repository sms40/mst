package com.clarusft.api.transform.etd;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.etd.ETDIMResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ETDIMResponseParser extends com.clarusft.api.transform.ApiResponseParser<com.clarusft.api.model.etd.ETDIMResponse> {
	@Override
	public ETDIMResponse parse(HttpResp httpResp, ETDIMResponse resp) throws IOException {
		if (resp == null) {
			resp = new ETDIMResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}