package com.clarusft.api.transform.dates;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.dates.FxOptionDateResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FxOptionDateResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.dates.FxOptionDateResponse> {
	@Override
	public FxOptionDateResponse parse(HttpResp httpResp, FxOptionDateResponse resp) throws IOException {
		if (resp == null) {
			resp = new FxOptionDateResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}