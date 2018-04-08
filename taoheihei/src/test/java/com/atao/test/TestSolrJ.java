package com.atao.test;

import javax.swing.text.AbstractDocument.DefaultDocumentEvent;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

public class TestSolrJ {
	@Test
	public void addDocument()throws Exception{
			SolrServer solrServer=new HttpSolrServer("http://localhost:8083/solr");
			SolrInputDocument document=new SolrInputDocument();
			document.addField("id", "doc01");
			document.addField("product_name", "测试商品01");
			document.addField("product_price","11110");
			solrServer.add(document);
			solrServer.commit();
			
	}
	@Test
	public void deleteDocument() throws Exception{
		SolrServer solrServer=new HttpSolrServer("http://localhost:8083/solr");
		solrServer.deleteByQuery("id:doc01");
		solrServer.commit();
	}
}
