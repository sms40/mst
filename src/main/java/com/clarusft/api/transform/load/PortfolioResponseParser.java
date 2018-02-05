package com.clarusft.api.transform.load;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.load.PortfolioResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class PortfolioResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.load.PortfolioResponse> {
	@Override
	public PortfolioResponse parse(HttpResp httpResp, PortfolioResponse resp) throws IOException {
		if (resp == null) {
			resp = new PortfolioResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}