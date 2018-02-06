package com.clarusft.api.model;

public interface SupportsFilter extends HasStats, HasAttributes {
	static final String KEY = "com.clarusft.api.model.SupportsFilter.filterProvider";
	
	public default void setFilterProvider(FilterProvider provider) {
		setAttribute(KEY, provider);
	}
	
	public default FilterProvider getFilterProvider() {
		return (FilterProvider) getAttribute(KEY);
	}
	
	public void onFilter(FilterResponse filterResponse);
	
	public default void filter(String filter) {
		FilterProvider provider = getFilterProvider();
		
		Integer gridId = getStatInteger("GridId");
		
		FilterResponse filterResponse = provider.filter(gridId, filter);
		onFilter(filterResponse);
	}
}
