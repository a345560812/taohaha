package com.atao.message;

import java.io.IOException;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;

import com.atao.mapper.ProductsMapper;
import com.atao.po.Products;
import com.atao.util.SearchProduct;
import com.atao.util.SearchResult;

public class productMessageListener implements MessageListener{
	@Autowired
	private ProductsMapper productsMapper;
	@Autowired
	private SolrServer solrServer;
	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stubd
		System.out.println("Actimq接收消息");
		TextMessage textMessage =(TextMessage) message;
		try {
			String text = textMessage.getText();
			Long productId=Long.parseLong(text);
			Thread.sleep(3000);
			System.out.println(productId);
			
			SearchResult pro1 = productsMapper.getProductById1(productId);
			
			//创建一个文档对象
			SolrInputDocument document = new SolrInputDocument();
			//向文档对象中添加域
			document.addField("id", pro1.getProductId());
			document.addField("product_name",pro1.getProductName());
			document.addField("product_type_name", pro1.getProductTypeName());
			document.addField("product_price", pro1.getProductPrice());
			document.addField("product_pic", pro1.getProductPic());
			
			solrServer.add(document);
			System.out.println("提交");
			//提交
			solrServer.commit();
			
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	

}
