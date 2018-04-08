package com.atao.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.atao.po.Products;
import com.atao.util.AtaoResult;
import com.atao.util.IDUtils;
@Service
public class ProductService {

	public AtaoResult addProduct(Products product, String desc) {
		// TODO Auto-generated method stub
		product.setProductState((byte)1);
		product.setProductId(IDUtils.genItemId());
		product.setCreated(new Date());
		product.setUpdated(new Date());
		return null;
	}
	
}
