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
}
