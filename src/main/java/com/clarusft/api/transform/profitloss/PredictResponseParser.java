package com.clarusft.api.transform.profitloss;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.profitloss.PredictResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class PredictResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.profitloss.PredictResponse> {
	@Override
	public PredictResponse parse(HttpResp httpResp, PredictResponse resp) throws IOException {
		if (resp == null) {
			resp = new PredictResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}