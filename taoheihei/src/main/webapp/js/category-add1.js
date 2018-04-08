$(function(){
	$(".btn-primary").click(function(){
		$.post("/category/add", $(".category-add-form").serialize(),function(data){
			
			
				if(data.status==200)
					
					{
					alert("恭喜！添加商品成功")
					}
				else{
					alert(data.msg);
				}		
		});
	});
});