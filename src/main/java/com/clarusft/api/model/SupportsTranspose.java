package com.clarusft.api.model;

public interface SupportsTranspose extends HasStats, HasAttributes {
	static final String KEY = "com.clarusft.api.model.SupportsTranspose.transposeProvider";
	
	public default void setTransposeProvider(TransposeProvider provider) {
		setAttribute(KEY, provider);
	}
	
	public default TransposeProvider getTransposeProviderr() {
		return (TransposeProvider) getAttribute(KEY);
	}
	
	public void onTranspose(TransposeResponse transposeResponse);
	
	public default void transpose() {
		TransposeProvider provider = getTransposeProviderr();
		
		Integer gridId = getStatInteger("GridId");
		
		TransposeResponse transposeResponse = provider.transpose(gridId);
		onTranspose(transposeResponse);
	}
}
