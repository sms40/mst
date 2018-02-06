package com.clarusft.api.model;

import com.clarusft.api.exception.ApiException;

public interface TransposeProvider {
	public abstract TransposeResponse transpose(Integer gridId) throws ApiException;
}
