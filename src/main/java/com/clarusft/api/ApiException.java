package com.clarusft.api;

public class ApiException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ApiException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ApiException(String arg0) {
		super(arg0);
	}

	public ApiException(Throwable arg0) {
		super(arg0);
	}
}
