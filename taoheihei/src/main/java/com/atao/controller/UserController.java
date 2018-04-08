package com.atao.controller;

import java.nio.file.attribute.UserPrincipalLookupService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.atao.po.AtaoUser;
import com.atao.service.UserService;
import com.atao.util.AtaoResult;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/registersubmit")
	public String submit(AtaoUser user)
	{	
	
		userService.register(user);
		return "regSuccess";
	}
	@RequestMapping("/activate")
	public String activate(String code)
	{	
		userService.active(code);
		
		return "activeSuccess";
	}
	@RequestMapping("/toLogin")
	@ResponseBody
	public AtaoResult login(String username,String password,HttpServletRequest request,HttpServletResponse response){
		
		return userService.login(username,password,request,response);
		 
	}
	@RequestMapping("/user/token/{token}")
	@ResponseBody
	public AtaoResult findCookie(@PathVariable String token)
	{
		
		AtaoUser user = userService.findCookie(token);
		return AtaoResult.ok(user);
	}
}
