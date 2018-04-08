package com.atao.util;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class SearchProduct implements Serializable{
	private long recordCount;
	private int totalPages;
	private List<SearchResult> resultList;
	public long getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(long recordCount) {
		this.recordCount = recordCount;
	}
	public int getTotalPages() {
		return totalPages;
	}
	@Override
	public String toString() {
		return "SearchProduct [recordCount=" + recordCount + ", totalPages=" + totalPages + ", resultList=" + resultList
				+ "]";
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public List<SearchResult> getResultList() {
		return resultList;
	}
	public void setResultList(List<SearchResult> itemList) {
		this.resultList = itemList;
	}
}
