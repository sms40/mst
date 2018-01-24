package com.clarusft.api;

//import com.clarusft.api.model.risk.DV01Request;
//import com.clarusft.api.model.risk.DV01Response;

public class ApiClientBuilder {
	protected String baseUrl = "https://charmtest.clarusft.com/api/rest/v1/";
	protected String apiKey;
	protected String apiSecret;
	protected int connectTimeout;
	protected int readTimeout;
	
	public ApiClientBuilder withBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
		return this;
	}
	public ApiClientBuilder withApiKey(String apiKey) {
		this.apiKey = apiKey;
		return this;
	}
	public ApiClientBuilder withApiSecret(String apiSecret) {
		this.apiSecret = apiSecret;
		return this;
	}
	public ApiClientBuilder withConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
		return this;
	}
	public ApiClientBuilder withReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
		return this;
	}
	
	public static ApiClientBuilder getDefault() {
		ApiClientBuilder ab = new ApiClientBuilder();
		String url = System.getenv("CHARM_API_URL");
		if (url != null) {
			ab.withBaseUrl(url);
		}
		String key = System.getenv("CHARM_API_KEY");
		if (key != null) {
			ab.withApiKey(key);
		}
		String secret = System.getenv("CHARM_API_SECRET");
		if (secret != null) {
			ab.withApiSecret(secret);
		}
		return ab;
	}
}
