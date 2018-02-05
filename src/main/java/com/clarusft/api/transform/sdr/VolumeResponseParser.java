package com.clarusft.api.transform.sdr;

import java.io.IOException;

import javax.annotation.Generated;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.sdr.VolumeResponse;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class VolumeResponseParser extends com.clarusft.api.transform.DefaultCsvResponseParser<com.clarusft.api.model.sdr.VolumeResponse> {
	@Override
	public VolumeResponse parse(HttpResp httpResp, VolumeResponse resp) throws IOException {
		if (resp == null) {
			resp = new VolumeResponse();
		}
		super.parse(httpResp, resp);
		return resp;
	}
}