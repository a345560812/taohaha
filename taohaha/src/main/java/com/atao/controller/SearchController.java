package com.atao.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atao.service.SearchService;
import com.atao.util.AtaoResult;
import com.atao.util.AtaoSearch;
import com.atao.util.JsonUtils;
import com.atao.util.SearchProduct;

@Controller
public class SearchController {
	@Autowired
	private SearchService searchService;
	@Value("${ROWS_NUM}")
	private Integer ROWS_NUM;
	
	@RequestMapping("/search")
	@ResponseBody
	public AtaoResult searchItemList(String keyword, 
			@RequestParam(defaultValue="1") Integer page,HttpServletRequest request) throws Exception {
		
		System.out.println("1"+keyword);
		AtaoSearch search=new AtaoSearch();
		
		
		//查询商品列表
		SearchProduct searchResult = searchService.search(keyword, page ,ROWS_NUM);
		System.out.println(ROWS_NUM);
		//把结果传递给页面
		search.setKeyword(keyword);
		search.setTotalPage(searchResult.getTotalPages());
		search.setRecourdCount(searchResult.getRecordCount());
		search.setPage(page);
		search.setList(searchResult.getResultList());
		HttpSession session = request.getSession();
		String json = JsonUtils.objectToJson(search);
		session.setAttribute("searchResult", json);
		
		//异常测试
		//int a = 1/0;
		//返回逻辑视图
		System.out.println("ok!");
		return AtaoResult.ok();
	}
	@RequestMapping("/search/showres")
	@ResponseBody
	public AtaoResult show(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		 String json = (String) session.getAttribute("searchResult");
		 AtaoSearch search = JsonUtils.jsonToPojo(json, AtaoSearch.class);
		System.out.println("session="+search);
		return AtaoResult.ok(search);
		
	}
}
