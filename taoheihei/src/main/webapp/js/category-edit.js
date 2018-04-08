$(function(){
	
	
	
		var currentpageNum=1;
		var rowNum=6;
		var totalPageNum;
		
            $.ajax({
                type: "POST",//请求方式
                url: "/category/list",//地址，就是json文件的请求路径
                data:{
                	
                	page:currentpageNum,
                	rows:rowNum
                },
                dataType: "json",
                success:function(data){//返回的参数就是 action里面所有的有get和set方法的参数
                	
                	totalPageNum=data.data.pages;
                	
                	var html="";
                  $.each(data.data.list,function(i,val){
                	  
                	  
                	  html+='<tr>'+'<td><input type="checkbox" class="boxsplit" name="smallCheckbox"/></td>'+'<td>'+val.typeId+'</td>'+'<td>'+val.typeName+'</td>'+'<td><img  onclick="editinfo1('+val.typeId+')" height="40" width="40" src="images/a1.png"/></td><td><img onclick="deleteinfo1('+val.typeId+')" class="deletebar" id="'+val.typeId+'" height="40" width="40" src="images/a2.png"/></td>'+'</tr>';
                
                  });
                  $(".category-edit-observe").html(html);
                 
                	  
                	 
                
                }
            });
            $("#checkAll").click(function(){
            	
            	
            	if($(this).is(":checked"))
            		{	
            			$("[name=smallCheckbox]:checkbox").attr("checked",true);
            		}
            	else{
            		
            		$("[name=smallCheckbox]:checkbox").attr("checked",false);
            	}
            });
            $(".b1").click(function(){
            	 $.ajax({
                     type: "POST",//请求方式
                     url: "/category/list",//地址，就是json文件的请求路径
                     data:{
                     	
                     	page:1,
                     	rows:6
                     },
                     dataType: "json",
                     success:function(data){//返回的参数就是 action里面所有的有get和set方法的参数
                     	console.log(data.data);
                     	var html="";
                       $.each(data.data.list,function(i,val){
                     	  
                     	  console.log(val.typeId);
                     	 html+='<tr>'+'<td><input type="checkbox" class="boxsplit" name="smallCheckbox"/></td>'+'<td>'+val.typeId+'</td>'+'<td>'+val.typeName+'</td>'+'<td><img  onclick="editinfo1('+val.typeId+')" height="40" width="40" src="images/a1.png"/></td><td><img onclick="deleteinfo1('+val.typeId+')" class="deletebar" id="'+val.typeId+'" height="40" width="40" src="images/a2.png"/></td>'+'</tr>';
                     
                       });
                       $(".category-edit-observe").html(html);
                      
                     	  
                     	 
                     
                     }
                 });
            });
            $(".b2").click(function(){
            	if(currentpageNum>=2)
            		{currentpageNum=currentpageNum-1;
            		 $.ajax({
                         type: "POST",//请求方式
                         url: "/category/list",//地址，就是json文件的请求路径
                         data:{
                         	
                         	page:currentpageNum,
                         	rows:rowNum
                         },
                         dataType: "json",
                         success:function(data){//返回的参数就是 action里面所有的有get和set方法的参数
                         	
                         	var html="";
                           $.each(data.data.list,function(i,val){
                         	  
                         	  console.log(val.typeId);
                         	 html+='<tr>'+'<td><input type="checkbox" class="boxsplit" name="smallCheckbox"/></td>'+'<td>'+val.typeId+'</td>'+'<td>'+val.typeName+'</td>'+'<td><img  onclick="editinfo1('+val.typeId+')" height="40" width="40" src="images/a1.png"/></td><td><img onclick="deleteinfo1('+val.typeId+')" class="deletebar" id="'+val.typeId+'" height="40" width="40" src="images/a2.png"/></td>'+'</tr>';
                         
                           });
                           $(".category-edit-observe").html(html);
                          
                         	  
                         	 
                         
                         }
                     });
            		}
            	
            
            	
           
           });
            $(".b3").click(function(){
            	if(currentpageNum<totalPageNum)
            		{
            		currentpageNum=currentpageNum+1;
            		$.ajax({
                        type: "POST",//请求方式
                        url: "/category/list",//地址，就是json文件的请求路径
                        data:{
                        	
                        	page:currentpageNum,
                        	rows:rowNum
                        },
                        dataType: "json",
                        success:function(data){//返回的参数就是 action里面所有的有get和set方法的参数
                        	
                        	var html="";
                          $.each(data.data.list,function(i,val){
                        	  
                        	  console.log(val.typeId);
                        	  html+='<tr>'+'<td><input type="checkbox" class="boxsplit" name="smallCheckbox"/></td>'+'<td>'+val.typeId+'</td>'+'<td>'+val.typeName+'</td>'+'<td><img  onclick="editinfo1('+val.typeId+')" height="40" width="40" src="images/a1.png"/></td><td><img onclick="deleteinfo1('+val.typeId+')" class="deletebar" id="'+val.typeId+'" height="40" width="40" src="images/a2.png"/></td>'+'</tr>';
                        
                          });
                          $(".category-edit-observe").html(html);
                         
                        	  
                        	 
                        
                        }
                    });
            		}
            	
           	 
           });
            
            $(".b4").click(function(){
            	currentpageNum=currentpageNum+1;
           	 $.ajax({
                    type: "POST",//请求方式
                    url: "/category/list",//地址，就是json文件的请求路径
                    data:{
                    	
                    	page:totalPageNum,
                    	rows:rowNum
                    },
                    dataType: "json",
                    success:function(data){//返回的参数就是 action里面所有的有get和set方法的参数
                    	
                    	var html="";
                      $.each(data.data.list,function(i,val){
                    	  
                    	 
                    	  html+='<tr>'+'<td><input type="checkbox" class="boxsplit" name="smallCheckbox"/></td>'+'<td>'+val.typeId+'</td>'+'<td>'+val.typeName+'</td>'+'<td><img  onclick="editinfo1('+val.typeId+')" height="40" width="40" src="images/a1.png"/></td><td><img onclick="deleteinfo1('+val.typeId+')" class="deletebar" id="'+val.typeId+'" height="40" width="40" src="images/a2.png"/></td>'+'</tr>';
                    
                      });
                      $(".category-edit-observe").html(html);
                     
                    	  
                    	 
                    
                    }
                });
           });
            $(".btn-info").click(function(){
        		$.post("/category/edit1", $("#myForm").serialize(),function(data){
        				if(data.status==200)
        					
        					{
        					alert("恭喜！修改商品成功");
        					}
        				else{
        					alert(data.msg);
        				}		
        		});
        	});
         
           
            
           
         
            
           
        });