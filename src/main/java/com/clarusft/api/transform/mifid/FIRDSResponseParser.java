package com.clarusft.api.transform.mifid;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.mifid.FIRDSResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class FIRDSResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.mifid.FIRDSResponse> {
	@Override
	public FIRDSResponse parse(HttpResp httpResp, FIRDSResponse resp) throws IOException {
		if (resp == null) {
			resp = new FIRDSResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}