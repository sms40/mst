package com.clarusft.api.transform.util;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.util.ActivityResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ActivityResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.util.ActivityResponse> {
	@Override
	public ActivityResponse parse(HttpResp httpResp, ActivityResponse resp) throws IOException {
		if (resp == null) {
			resp = new ActivityResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}