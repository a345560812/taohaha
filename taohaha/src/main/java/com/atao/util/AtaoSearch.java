package com.atao.util;

import java.util.List;

public class AtaoSearch {
	public String keyword;
	public int totalPage;
	public long recourdCount;
	public Integer page;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public void setRecourdCount(long recourdCount) {
		this.recourdCount = recourdCount;
	}
	public List<SearchResult> list;
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	@Override
	public String toString() {
		return "AtaoSearch [keyword=" + keyword + ", totalPage=" + totalPage + ", recourdCount=" + recourdCount
				+ ", list=" + list + "]";
	}
	
	public long getRecourdCount() {
		return recourdCount;
	}
	public List<SearchResult> getList() {
		return list;
	}
	public void setList(List<SearchResult> list) {
		this.list = list;
	}
}
