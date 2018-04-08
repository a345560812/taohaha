package com.atao.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.protocol.HTTP;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atao.util.CookieUtils;

@Controller
public class PageController {
	@RequestMapping("/")
	public String index(){
		
		return "index";
	}
	
	
	@RequestMapping("/exit")
	public String index4(HttpServletRequest request,HttpServletResponse response){
		CookieUtils.deleteCookie(request, response,"token");
		return "index";
	}
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
	
}
