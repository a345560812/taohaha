package com.atao.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atao.util.SearchProduct;
import com.atao.util.SearchResult;



/**
 * 商品搜索dao
 * <p>Title: SearchDao</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Repository
public class SearchDao {
	
	@Autowired
	private SolrServer solrServer;

	/**
	 *根据查询条件查询索引库
	 * <p>Title: search</p>
	 * <p>Description: </p>
	 * @param query
	 * @return
	 */
	public SearchProduct search(SolrQuery query) throws Exception {
		//根据query查询索引库
		QueryResponse queryResponse = solrServer.query(query);
		//取查询结果。
		SolrDocumentList solrDocumentList = queryResponse.getResults();
		//取查询结果总记录数
		long numFound = solrDocumentList.getNumFound();
		SearchProduct result=new SearchProduct();
		result.setRecordCount(numFound);
		//取商品列表，需要取高亮显示
		Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
		List<SearchResult> resultList = new ArrayList<>();
		for (SolrDocument solrDocument : solrDocumentList) {
			SearchResult res = new SearchResult();
			res.setProductId((String) solrDocument.get("id"));
			res.setProductName((String) solrDocument.get("product_name"));
			res.setProductPic((String) solrDocument.get("product_pic"));
			res.setProductTypeName((String) solrDocument.get("product_type_name"));
			res.setProductPrice( (long) solrDocument.get("product_price"));
			
			//取高亮显示
			List<String> list = highlighting.get(solrDocument.get("id")).get("product_name");
			String title = "";
			if (list != null && list.size() > 0) {
				title = list.get(0);
			} else {
				title = (String) solrDocument.get("product_name");
			}
			res.setProductName(title);
			//添加到商品列表
			resultList.add(res);
		}
		result.setResultList(resultList);
		//返回结果
		return result;
	}
	
}
