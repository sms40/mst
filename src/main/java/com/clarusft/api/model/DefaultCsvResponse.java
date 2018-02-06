package com.clarusft.api.model;

public class DefaultCsvResponse extends ApiResponse {
	private StringGrid grid;

	public StringGrid getGrid() {
		return grid;
	}

	public void setGrid(StringGrid grid) {
		this.grid = grid;
	}

	@Override
	public String toString() {
		return grid != null ? grid.toString() : super.toString();
	}
	
	public void onPivot(PivotResponse pivotResponse) {
		this.grid = pivotResponse.getGrid();
		getStats().putAll(pivotResponse.getStats());
	}
	
	public void onFilter(FilterResponse filterResponse) {
		this.grid = filterResponse.getGrid();
		getStats().putAll(filterResponse.getStats());
	}
	
	public void onTranspose(TransposeResponse transposeResponse) {
		this.grid = transposeResponse.getGrid();
		getStats().putAll(transposeResponse.getStats());
	}
}
