package com.clarusft.api;

import com.clarusft.api.model.DrilldownResponse;
import com.clarusft.api.model.risk.DV01Request;
import com.clarusft.api.model.risk.DV01Response;

public class ApiClientTest {

	public static void main(String[] args) {
		ApiClient cli = new ApiClient(ApiClientBuilder.getDefault());

//		DV01Request req = new DV01Request();
//		req.setPortfolios(Collections.singletonList("USD 10m 5Y Pay"));
		
		DV01Response resp = cli.request(new DV01Request().withPortfolios("FCM-1/LCHTrd"));
		System.out.println(resp);
		
		DrilldownResponse dd = resp.drilldown("USD", "FixedFloat", "Default");
		System.out.println(dd);
		
		dd = resp.drilldown("USD", "Basis", "Default");
		System.out.println(dd);
		
		System.out.println(dd.getStats());
	}
}
