package com.atao.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
	@RequestMapping(value="/upload",method=RequestMethod.POST) 
    @ResponseBody
    private AtaoResult fildUpload(@RequestParam(value="itemImagers",required=false) MultipartFile file,  
               HttpServletRequest request,Model model)throws Exception{  
           //基本表单  

           //获得物理路径webapp所在路径  
           String pathRoot = request.getSession().getServletContext().getRealPath("");  
           String path="";
           String path1="//";
           if(!file.isEmpty()){  
               //生成uuid作为文件名称  
               String uuid = UUID.randomUUID().toString().replaceAll("-",""); 
               //获得文件类型（可以判断如果不是图片，禁止上传）  
               String contentType=file.getContentType();  
               //获得文件后缀名称  
               String imageName=contentType.substring(contentType.indexOf("/")+1);  
               //地址
               path="static/"+uuid+"."+imageName;  
               path1=path+path1;
               file.transferTo(new File(pathRoot+"\\"+path1));  
           }else {
               //可以使用以下包装类。响应结果，请看附件
               //ResponseResult.build(400,"上传图片失败");
        	   System.out.println("上传失败");
           }
           System.out.println(path);  
           request.setAttribute("imagesPath", path);  
           model.addAttribute("imgPath",path);
           return AtaoResult.ok(path); 
       }  
	@RequestMapping(value="/product/class", method=RequestMethod.POST)
	@ResponseBody
	public AtaoResult getclazz(){
		AtaoResult list = productService.getClazz();	
		return list;
	}
	@RequestMapping(value="/product/showCatName",method=RequestMethod.POST)
	@ResponseBody
	public AtaoResult showCatName(Integer typeId)
	{
		return productService.showCatName(typeId);
	}
	@RequestMapping(value="/product/showCatgory",method=RequestMethod.POST)
	@ResponseBody
	public AtaoResult showCatgory(String typeName)
	{
		return AtaoResult.ok(typeName);
	}
	@RequestMapping(value="/product/savepro", method=RequestMethod.POST)
	@ResponseBody
	public AtaoResult addItem(Products products, String productDesc) {
		System.out.println("products="+products);
		System.out.println("desc="+productDesc);
		AtaoResult result = productService.addProduct(products, productDesc);
		return result;
	}
	@RequestMapping(value="/product/list",method=RequestMethod.POST)
	@ResponseBody
	public AtaoResult showProductList(Integer page,Integer rows)
	{
		AtaoResult result = productService.showProductList(page,rows);
		return result;
	}
	@RequestMapping(value="/product/edit",method=RequestMethod.POST)
	@ResponseBody
	public AtaoResult proEdit(Long productId)
	{
		AtaoResult result = productService.proEdit(productId);
		return result;
	}
	@RequestMapping(value="/product/state",method=RequestMethod.POST)
	@ResponseBody
	public AtaoResult proState(Long productId)
	{
		AtaoResult result = productService.proState(productId);
		return result;
	}
	@RequestMapping(value="/product/modify",method=RequestMethod.POST)
	@ResponseBody
	public AtaoResult proModify(Products product)
	{	
		System.out.println(product);
		AtaoResult result = productService.updatePro(product);
		return result;
	}
	@RequestMapping(value="/product/sousuo",method=RequestMethod.POST)
	@ResponseBody
	public AtaoResult proSousuo(Products product)
	{	
		AtaoResult result = productService.proSou(product);
		return result;
	}
	@RequestMapping(value="/product/delete",method=RequestMethod.POST)
	@ResponseBody
	public AtaoResult proDel(Long productId)
	{	
		AtaoResult result = productService.proDel(productId);
		return result;
	}
}
