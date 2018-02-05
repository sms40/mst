package com.clarusft.api.transform;

import java.io.IOException;

import com.clarusft.api.http.HttpResp;
import com.clarusft.api.model.DefaultCsvResponse;
import com.clarusft.api.model.StringGrid;

public class DefaultCsvResponseParser<RESP extends DefaultCsvResponse> extends ApiResponseParser<RESP>{

	@Override
	public RESP parse(HttpResp httpResp, RESP resp) throws IOException {
		super.parse(httpResp, resp);
		
		if (resp != null) {
			if (httpResp.getResponseCode() == 200) {
				String csv = httpResp.getResponseBody();
				char separator = getSeparator(httpResp, resp);
				boolean hasRowHeaders = hasRowHeaders(httpResp, resp);
				
				StringGrid sg = StringGrid.fromCsv(csv, separator, hasRowHeaders);
				resp.setGrid(sg);
			}
		}
		return resp;
	}
	
	char getSeparator(HttpResp httpResp, RESP resp) {
		String contentType = httpResp.getFirstHeader("Content-Type");
		if ("text/tsv".equalsIgnoreCase(contentType)) {
			return '\t';
		} else {
			return ',';
		}
	}
	
	boolean hasRowHeaders(HttpResp httpResp, RESP resp) {
		String isGrid = resp.getStats().get("IsGrid");
		return "yes".equalsIgnoreCase(isGrid) || Boolean.valueOf(isGrid);
	}

}
