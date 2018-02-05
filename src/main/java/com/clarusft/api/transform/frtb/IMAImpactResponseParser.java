package com.clarusft.api.transform.frtb;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.frtb.IMAImpactResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class IMAImpactResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.frtb.IMAImpactResponse> {
	@Override
	public IMAImpactResponse parse(HttpResp httpResp, IMAImpactResponse resp) throws IOException {
		if (resp == null) {
			resp = new IMAImpactResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}