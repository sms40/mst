package com.clarusft.api.model;

import java.util.Map;

public interface HasStats {
	public Map<String, String> getStats();
	
	public default String getStat(String name) {
		String statS = getStats().get(name);
		return statS;
	}
	
	/**
	 * @param name
	 * @return named stat as an <code>Integer</code>, or <code>null</code> if no such stat
	 */
	public default Integer getStatInteger(String name) {
		String statS = getStat(name);
		if (statS != null) {
			return Integer.parseInt(statS);
		} else {
			return null;
		}
	}
	
	/**
	 * @param name
	 * @return named stat as an <code>Double</code>, or <code>null</code> if no such stat
	 */
	public default Double getStatDouble(String name) {
		String statS = getStat(name);
		if (statS != null) {
			return Double.parseDouble(statS);
		} else {
			return null;
		}
	}
}
