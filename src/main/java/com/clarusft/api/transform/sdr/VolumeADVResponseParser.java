package com.clarusft.api.transform.sdr;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.sdr.VolumeADVResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class VolumeADVResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.sdr.VolumeADVResponse> {
	@Override
	public VolumeADVResponse parse(HttpResp httpResp, VolumeADVResponse resp) throws IOException {
		if (resp == null) {
			resp = new VolumeADVResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}