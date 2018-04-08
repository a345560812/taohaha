package com.atao.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.plaf.synth.SynthSpinnerUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

import com.alibaba.druid.pool.vendor.SybaseExceptionSorter;
import com.atao.mapper.ProductDescMapper;
import com.atao.mapper.ProductsMapper;
import com.atao.mapper.ProductsclassMapper;
import com.atao.po.ProductDesc;
import com.atao.po.Products;
import com.atao.po.ProductsExample;
import com.atao.po.ProductsExample.Criteria;
import com.atao.po.Productsclass;
import com.atao.po.ProductsclassExample;

import com.atao.util.AtaoResult;
import com.atao.util.IDUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class ProductService {
	@Autowired
	private ProductsclassMapper productsclassMapper;
	@Autowired
	private JmsTemplate jmsTemplate;
	@Autowired
	private ProductDescMapper productDescMapper;
	@Resource
	private Destination topicDestination;
	@Autowired
	private ProductsMapper productsMapper;
	public AtaoResult addProduct(Products product, String desc) {
		// TODO Auto-generated method stub
		product.setProductState((byte)1);
		long id = IDUtils.genItemId();
		product.setProductId(id);
		product.setProductState((byte)1);
		product.setCreated(new Date());
		product.setUpdated(new Date());
		System.out.println("product="+product);
		productsMapper.insert(product);
		ProductDesc productDesc=new ProductDesc();
		productDesc.setProductId(id);
		productDesc.setProductDesc(desc);
		productDesc.setCreated(new Date());
		productDesc.setUpdated(new Date());
		productDescMapper.insert(productDesc);
		new Thread(){
			public void run(){
				jmsTemplate.send(topicDestination,new MessageCreator() {
					
					@Override
					public Message createMessage(Session session) throws JMSException {
						System.out.println("发送消息:"+id);
						// TODO Auto-generated method stub
						TextMessage textMessage=session.createTextMessage(id+"");
						return textMessage;
					}
				});
			}
		}.start();
		
		return AtaoResult.ok();
		
		
	}
	
	public AtaoResult getClazz(){
		ProductsclassExample example=new ProductsclassExample();
		
		List<Productsclass> list = productsclassMapper.selectByExample(example);
		return AtaoResult.ok(list);
	}
	
	public AtaoResult showCatName(Integer typeId) {
		// TODO Auto-generated method stub
		Productsclass product = productsclassMapper.selectByPrimaryKey(typeId);
		return AtaoResult.ok(product);
	}

	public AtaoResult showProductList(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page,rows);
		ProductsExample example=new ProductsExample();
		
		List<Products> list = productsMapper.selectByExample(example);
		
		PageInfo<Products> pageInfo=new PageInfo<>(list);
		long total=pageInfo.getTotal();
		System.out.println("total:"+total);
		
		
		return AtaoResult.ok(pageInfo);
	}

	public AtaoResult proEdit(Long productId) {
		// TODO Auto-generated method stub
		Products product = productsMapper.selectByPrimaryKey(productId);
		return AtaoResult.ok(product);
	}

	public AtaoResult proState(Long productId) {
		// TODO Auto-generated method stub
		Products products = productsMapper.selectByPrimaryKey(productId);
		if(products.getProductState()==1)
		{
			products.setProductState((byte) 0);
		}
		else if(products.getProductState()==0)
		{
				products.setProductState((byte) 1);
		}
		productsMapper.updateByPrimaryKey(products);
		return AtaoResult.ok(products);
		
	}

	public AtaoResult updatePro(Products product) {
		// TODO Auto-generated method stub
		Long id = product.getProductId();
		Products pro = productsMapper.selectByPrimaryKey(id);
		pro.setProductKc(product.getProductKc());
		pro.setProductPrice(product.getProductPrice());
		productsMapper.updateByPrimaryKey(pro);
		return AtaoResult.ok();
	}

	public AtaoResult proSou(Products product) {
		// TODO Auto-generated method stub
		String typeName = product.getProductTypeName();
		System.out.println(typeName);
		ProductsExample example=new ProductsExample();
		Criteria criteria = example.createCriteria();
		criteria.andProductTypeNameEqualTo(typeName);
		List<Products> list = productsMapper.selectByExample(example);
		return AtaoResult.ok(list);
	}

	public AtaoResult proDel(Long productId) {
		// TODO Auto-generated method stub
	
		productsMapper.deleteByPrimaryKey(productId);
		System.out.println("删除成功");
		return AtaoResult.ok();
	}

	
}
