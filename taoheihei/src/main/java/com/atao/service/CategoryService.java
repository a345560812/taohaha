package com.atao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atao.mapper.ProductsclassMapper;
import com.atao.po.Productsclass;
import com.atao.po.ProductsclassExample;
import com.atao.po.ProductsclassExample.Criteria;
import com.atao.util.AtaoResult;
import com.atao.util.JsonUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CategoryService {
	@Autowired
	private ProductsclassMapper productsclassMapper;
	public AtaoResult categoryAdd(String typename)
	{	Productsclass productsclass=new Productsclass();
		productsclass.setTypeName(typename);
		
		ProductsclassExample example=new ProductsclassExample();
		Criteria criteria = example.createCriteria();
		criteria.andTypeNameEqualTo(typename);

		if(productsclassMapper.selectByExample(example).size()>=1) {
			
			
			
			return AtaoResult.build(400,"该分类已存在，请勿重复添加！");
		}
			
		

		productsclassMapper.insert(productsclass);
	
		return AtaoResult.ok();
	}
	public AtaoResult categoryList(int page,int rows){
		
		PageHelper.startPage(page,rows);
		ProductsclassExample example=new ProductsclassExample();
		
		List<Productsclass> list = productsclassMapper.selectByExample(example);
		
		PageInfo<Productsclass> pageInfo=new PageInfo<>(list);
		long total=pageInfo.getTotal();
		
		
		
		return AtaoResult.ok(pageInfo);
	}
	public AtaoResult categoryDel(Integer typeId) {
		// TODO Auto-generated method stub
		 productsclassMapper.deleteByPrimaryKey(typeId);
		return AtaoResult.ok();
	}
	public AtaoResult categoryEdit(Integer typeId) {
		// TODO Auto-generated method stub
		Productsclass proclass = productsclassMapper.selectByPrimaryKey(typeId);
		
		return AtaoResult.ok(proclass);
	}
	public AtaoResult categoryEdit1(Productsclass productsclass) {
		ProductsclassExample example=new ProductsclassExample();
		Criteria criteria = example.createCriteria();
		criteria.andTypeNameEqualTo(productsclass.getTypeName());
		List<Productsclass> list = productsclassMapper.selectByExample(example);
		if(list.size()>0)
		{
			return AtaoResult.build(400, "商品类别名已存在，添加失败");
		}
		// TODO Auto-generated method stub
		else{
			Productsclass proclass = productsclassMapper.selectByPrimaryKey(productsclass.getTypeId());
			proclass.setTypeName(productsclass.getTypeName());
			productsclassMapper.updateByPrimaryKey(proclass);
			return AtaoResult.ok();
		}
		
		
		
	}
	public AtaoResult categorySearch(String typeName) {
		// TODO Auto-generated method stub
		List<Productsclass> list = productsclassMapper.selectlikeName(typeName);
		for (Productsclass productsclass : list) {
			System.out.println(productsclass.getTypeName());
		}
		return AtaoResult.ok(list);
		
	}
}
