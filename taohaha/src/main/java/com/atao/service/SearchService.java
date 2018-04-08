package com.atao.service;

import org.apache.solr.client.solrj.SolrQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atao.dao.SearchDao;
import com.atao.util.SearchProduct;
import com.atao.util.SearchResult;
@Service
public class SearchService {
	@Autowired
	private SearchDao searchDao;
	public SearchProduct search(String keyword, int page, int rows) throws Exception {
		
		//创建一个SolrQuery对象
		SolrQuery query = new SolrQuery();
		//设置查询条件
		query.setQuery(keyword);
		//设置分页条件
		if (page <=0 ) page =1;
		query.setStart((page - 1) * rows);
		query.setRows(rows);
		//设置默认搜索域
		query.set("df", "product_name");
		//开启高亮显示
		query.setHighlight(true);
		query.addHighlightField("product_name");
		query.setHighlightSimplePre("<em style=\"color:red\">");
		query.setHighlightSimplePost("</em>");
		//调用dao执行查询
		SearchProduct searchResult = searchDao.search(query);
		System.out.println(searchResult);
		System.out.println("查询");
		//计算总页数
		long recordCount = searchResult.getRecordCount();
		System.out.println("recordCount="+recordCount);
		int totalPage = (int) (recordCount / rows);
		System.out.println(totalPage);
		if (recordCount % rows > 0) 	
			totalPage ++;
		//添加到返回结果
		searchResult.setTotalPages(totalPage);
		//返回结果
		return searchResult;
	}
}
