package com.clarusft.api.model;

public interface FilterProvider {
	public abstract FilterResponse filter(Integer gridId, String filter);
}
