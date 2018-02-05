package com.clarusft.api.transform.load;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.load.ScenarioResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ScenarioResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.load.ScenarioResponse> {
	@Override
	public ScenarioResponse parse(HttpResp httpResp, ScenarioResponse resp) throws IOException {
		if (resp == null) {
			resp = new ScenarioResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}