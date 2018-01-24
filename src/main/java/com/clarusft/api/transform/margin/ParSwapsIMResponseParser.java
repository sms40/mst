package com.clarusft.api.transform.margin;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.margin.ParSwapsIMResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ParSwapsIMResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.margin.ParSwapsIMResponse> {
	@Override
	public ParSwapsIMResponse parse(HttpResp httpResp, ParSwapsIMResponse resp) throws IOException {
		if (resp == null) {
			resp = new ParSwapsIMResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}