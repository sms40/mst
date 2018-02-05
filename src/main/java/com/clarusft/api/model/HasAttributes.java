package com.clarusft.api.model;

//TODO better for this to be "HasCapabilities" or similar and for the values to be something more specific that objects
public interface HasAttributes {
	public void setAttribute(String key, Object attribute);
	public Object getAttribute(String key);
}
