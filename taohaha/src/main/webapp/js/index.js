$(function(){
	
	
	
		$(".searchButton").click(function(){
			var keyword=$(this).siblings(".searchVal").val();
			console.log(keyword);
			$.ajax({
		        type: "POST",//请求方式
		        url: "/search",//地址，就是json文件的请求路径
		        data:{
		        	 //在这里输入page: (num);来表示第几页
		        	keyword:keyword
		        },
		        dataType: "json",
		        success:function(data){//返回的参数就是 action里面所有的有get和set方法的参数
		        	console.log(data);
		        	alert("chenggong");
		        	if(data.status==200)
		        		{
		        		  window.location.href="http://localhost:8080/searchres";
		        		}
		         	
		        	  
		        	 
		        
		        }
		    });
		})
		
	
})	
