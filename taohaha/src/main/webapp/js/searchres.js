$(function(){
	
	
	
	$.ajax({
        type: "POST",//请求方式
        url: "/search/showres",//地址，就是json文件的请求路径
        success:function(data){//返回的参数就是 action里面所有的有get和set方法的参数
        	console.log(data);
        	alert("chenggong");
        	if(data.status==200)
        		{
        		 console.log(data.data);
        		}
         	
        	  
        	 
        
        }
    });
		
	
})	
