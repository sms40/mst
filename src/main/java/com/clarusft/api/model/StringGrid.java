package com.clarusft.api.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVParser;

public class StringGrid {
	
	private boolean hasRowHeaders = false; //if true first column is treated as row headers
	private List<String> colHeaders = new ArrayList<>();
	private Map<String, List<String>> valDict = new LinkedHashMap<>();
	private Map<String, Integer> widthDict = new HashMap<>();
	private int maxRow = 0;
	private String title;
	
	public StringGrid(boolean hasRowHeaders, List<String> colHeaders) {
		this.hasRowHeaders = hasRowHeaders;
		
		if (hasRowHeaders) {
			this.colHeaders.add("");
		}
		this.colHeaders.addAll(colHeaders);
        
        for (String header:this.colHeaders) {
        	this.valDict.put(header, new ArrayList<>());
        	this.widthDict.put(header, header.length());
        }
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private void updWidthDict(String c, String v) {
		if (!this.widthDict.containsKey(c)) {
			this.widthDict.put(c, v.length());
		} else {
			this.widthDict.put(c, Math.max(this.widthDict.get(c), v.length()));
		}
	}
	
	private List<String> getColumn(int c) {
		if (!this.valDict.containsKey(String.valueOf(c))) {
			String colHeader;
			if (this.hasRowHeaders) {
				colHeader = this.colHeaders.get(c+1);
			} else {
				colHeader = this.colHeaders.get(c);
			}
			return this.valDict.get(colHeader);
		} else {
			return this.valDict.get(String.valueOf(c));
		}
	}
	
	private List<String> getColumn(String c) {
		if (!this.valDict.containsKey(c)) {
			List<String> col = new ArrayList<>();
			this.valDict.put(c, col);
			this.colHeaders.add(c);
			this.updWidthDict(c, c);
			return col;
		} else {
			return this.valDict.get(c);
		}
	}
	
	private int getRowIndex(String r) {
		if (this.hasRowHeaders) {
			List<String> firstCol = this.valDict.get(this.colHeaders.get(0));
			
			if (!firstCol.contains(r)) {
				firstCol.add(r);
				this.updWidthDict(this.colHeaders.get(0), r);
                
                return firstCol.size()-1;
			} else {
				return firstCol.indexOf(r);
			}
		} else {
			throw new IllegalArgumentException("Row index must be an integer, found "+r);
		}
	}
	
	private int getRowIndex(int r) {
		if (this.hasRowHeaders) {
			List<String> firstCol = this.valDict.get(this.colHeaders.get(0));
			
			if (!firstCol.contains(String.valueOf(r))) {
				int rowIdx = r;
				while (firstCol.size() <= rowIdx) {
					firstCol.add("");
				}
				
				firstCol.set(rowIdx, String.valueOf(r));
				this.updWidthDict(this.colHeaders.get(0),  String.valueOf(r));
				
				return rowIdx;
			} else {
				return firstCol.indexOf(String.valueOf(r));
			}
		} else {
			return r;
		}
	}
	

	public void setValue(String r, String c, String v) {
		List<String> col = getColumn(c);
		
		int rowIdx = getRowIndex(r);
		
		 setValue(c, v, col, rowIdx);
	}
	public void setValue(int r, String c, String v) {
		List<String> col = getColumn(c);
		
		int rowIdx = getRowIndex(r);
		
		setValue(c, v, col, rowIdx);
	}

	protected void setValue(String c, String v, List<String> col, int rowIdx) {
		while (col.size() <= rowIdx) {
			 col.add("");
		 }
	            
	     col.set(rowIdx, v); 
	     this.updWidthDict(c, v);
	     this.maxRow = Math.max(this.maxRow, rowIdx+1);
	}
	
	public String getValue(String r, String c) {
		//locate the column
		List<String> col;
		
		if (!this.valDict.containsKey(c)) {
			return null;
		} else {
			col = this.valDict.get(c);
		}
		
		//locate the index into the column 
		if (this.hasRowHeaders) {
			List<String> firstCol = this.valDict.get(this.colHeaders.get(0));
			int rowIdx = firstCol.indexOf(r);
			if (rowIdx < 0) {
				return null;
			} else {
				return col.get(rowIdx);
			}
		} else {
			throw new IllegalArgumentException("Row headers not available");
		}
	}
	
	public List<String> getColHeaders() {
		if (this.hasRowHeaders) {
			return this.colHeaders.subList(1, this.colHeaders.size());
		} else {
			return this.colHeaders;
		}
	}
	
	public List<String> getRowHeaders() {
		if (!this.hasRowHeaders) {
			throw new IllegalArgumentException("Row headers not available");
		}
		
		List<String> firstCol = this.valDict.get(this.colHeaders.get(0));
		return firstCol;
	}
	
	public int getRowCount() {
		return this.maxRow;
	}
	
	public String getValue(int r, String c) {
		//locate the column
		List<String> col;
		
		if (!this.valDict.containsKey(c)) {
			return null;
		} else {
			col = this.valDict.get(c);
		}
		
		return col.get(r);
	}
	
	protected static String rpad(String s, int n) {
	     return String.format("%1$-" + n + "s", s);  
	}

	protected static String lpad(String s, int n) {
	    return String.format("%1$" + n + "s", s);  
	}
	
	protected String pad(int c, String header, String text) {
		if (text == null) {
			text = "";
		}
		if (c == 0) {
			int width = this.widthDict.get(header)+1;
			return rpad(text, width);
		} else {
			int width = this.widthDict.get(header)+4;
			return lpad(text, width);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		//write first line
		for (int c=0; c<this.colHeaders.size(); c++) {
			String header = this.colHeaders.get(c);
			
			if (this.hasRowHeaders && c == 0 && this.title != null) {
				String padded = pad(c, header, this.title);
				sb.append(padded);
			} else {
				String padded = pad(c, header, header);
				sb.append(padded);
			}
		}
		
		sb.append('\n');
		
		for (int r=0; r<this.maxRow; r++) {
			for (int c=0; c<this.colHeaders.size(); c++) {
				String header = this.colHeaders.get(c);
				String col = this.valDict.get(header).get(r);
				String padded = pad(c, header, col);
				sb.append(padded);
			}
			sb.append('\n');
		}
		
		return sb.toString();
	}
	
	public static StringGrid fromCsv(String csv, char separator, boolean hasRowHeaders) throws IOException {
		CSVParser cp = new CSVParser(separator);
		
		StringGrid vg = null;
		String[] firstRow = null;
		
		String[] lines = csv.split("[\\r\\n]+");
		
		for (int r=0; r<lines.length; r++) {
			String line = lines[r];
			String[] row = cp.parseLine(line);
			
			if (r == 0) {
				firstRow = row;
				if (hasRowHeaders) {
					//first column header is not a "real" column header so strip it out
					List<String> colHeaders = Arrays.asList(firstRow).subList(1, firstRow.length);
					vg = new StringGrid(hasRowHeaders, colHeaders);
				} else {
					List<String> colHeaders = Arrays.asList(firstRow);
					vg = new StringGrid(hasRowHeaders, colHeaders);
				}
			} else {
				if (row.length > firstRow.length) {
					throw new IllegalArgumentException("Malformed csv at line " + r
							+ ": actual column count " + row.length 
							+ " exceeds expected count " + firstRow.length);
				}
				
				String rowHeader = null;
				
				for (int c=0; c<row.length; c++) {
					String col = row[c];
					if (hasRowHeaders) {
						if (c == 0) {
							rowHeader = col;
							continue;
						} else {
							String colHeader = firstRow[c];
		                    vg.setValue(rowHeader, colHeader, col);
						}
					} else {
						String colHeader = firstRow[c];
						vg.setValue(r-1, colHeader, col);
					}
				}
			}
		}
		return vg;
	}
}
