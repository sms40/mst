package com.clarusft.api.transform.load;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.HttpResp;
import com.clarusft.api.model.load.LadderResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class LadderResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.load.LadderResponse> {
	@Override
	public LadderResponse parse(HttpResp httpResp, LadderResponse resp) throws IOException {
		if (resp == null) {
			resp = new LadderResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}