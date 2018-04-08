package com.atao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atao.po.Productsclass;
import com.atao.service.CategoryService;
import com.atao.util.AtaoResult;

@Controller
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	@RequestMapping("/category/add")
	@ResponseBody
 	public AtaoResult categoryAdd(String typename ){
		
		 AtaoResult result = categoryService.categoryAdd(typename);
		 
		 return result;
		
	}
	@RequestMapping("/category/list")
	@ResponseBody
	public AtaoResult categoryList(Integer page,Integer rows)
	{		
		AtaoResult result = categoryService.categoryList(page,rows);
		
		return result;
	}
	@RequestMapping("/category/delete")
	@ResponseBody
	public AtaoResult categoryDel(Integer typeId){
		return categoryService.categoryDel(typeId);
	}
	@RequestMapping("/category/edit")
	@ResponseBody
	public AtaoResult categoryEdit(Integer typeId){
		return categoryService.categoryEdit(typeId);
	}
	@RequestMapping("/category/edit1")
	@ResponseBody
	public AtaoResult categoryEdit1(Productsclass productsclass){
		return categoryService.categoryEdit1(productsclass);
	}
	@RequestMapping("/category/search")
	@ResponseBody
	public AtaoResult categorySearch(String typeName)
	{	
		System.out.println(typeName);
		AtaoResult result = categoryService.categorySearch(typeName);
		System.out.println(result.getData());
		return result;
	}
}
