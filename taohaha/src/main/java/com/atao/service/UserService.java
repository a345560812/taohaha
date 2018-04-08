package com.atao.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.atao.mapper.AtaoUserMapper;
import com.atao.po.AtaoUser;
import com.atao.po.AtaoUserExample;
import com.atao.po.AtaoUserExample.Criteria;
import com.atao.sendMail.MailTask;
import com.atao.util.AtaoResult;
import com.atao.util.CookieUtils;
import com.atao.util.JsonUtils;
import com.atao.util.MyUtil;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
public class UserService {
	@Autowired
	private AtaoUserMapper userMapper;
	@Autowired
	private TaskExecutor taskExecutor;
	@Autowired
	private JedisPool jedisPool;
	@Autowired
	private JavaMailSender javaMailSender;
	public void register(AtaoUser user)
	{
		user.setUserActivestate("0");
		user.setUserActivecode(MyUtil.createRandomCode());
		userMapper.insert(user);
		taskExecutor.execute(new MailTask(user.getUserActivecode(), user.getUserEmail(), javaMailSender, 1));
	}
	public void active(String code)
	{	AtaoUserExample example=new AtaoUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserActivecodeEqualTo(code);
		List<AtaoUser> user= userMapper.selectByExample(example);
		AtaoUser user2=user.get(0);
		user2.setUserActivestate("1");
		userMapper.updateByPrimaryKey(user2);
		
	}
	public AtaoResult login(String username, String password,HttpServletRequest request,HttpServletResponse response) {
		// TODO Auto-generated method stub
		AtaoUserExample example=new AtaoUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserUsernameEqualTo(username);
		criteria.andUserPasswordEqualTo(password);
		List<AtaoUser> users = userMapper.selectByExample(example);
		if(users.size()<1||users==null)
		{	
			return AtaoResult.build(400,"用户名或密码错误");
		}
		
		else{
			AtaoUser user=users.get(0);
			
			if(user.getUserActivestate().charAt(0)=='0')
			{	
				return AtaoResult.build(400,"您的账号还没有激活，请前往您的注册邮箱激活");
			}
			Jedis jedis = jedisPool.getResource();
			jedis.set(user.getUserId()+"",JsonUtils.objectToJson(user));
			
			CookieUtils.setCookie(request, response,"token",user.getUserId()+"");
			Integer userId = user.getUserId();
			return AtaoResult.ok(userId);
		}
	}
	public AtaoUser findCookie(String token) {
		// TODO Auto-generated method stub
		Jedis jedis = jedisPool.getResource();
		return JsonUtils.jsonToPojo(jedis.get(token), AtaoUser.class);
		
	}
	
}
