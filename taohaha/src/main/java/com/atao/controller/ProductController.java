package com.atao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atao.po.Products;
import com.atao.service.ProductService;
import com.atao.util.AtaoResult;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/product/save", method=RequestMethod.POST)
	@ResponseBody
	public AtaoResult addProduct(Products product, String desc) {
		AtaoResult result = productService.addProduct(product, desc);
		return result;
	}
}
