"use strict";

$(function(){
	
	$("#JANsearch").on("click",function(){
		var janCode = document.getElementById('janCode').value;
		console.log("この後Ajax通信");
		console.log(janCode);
		var url = "Access-Control-Allow-Origin:https://shopping.yahooapis.jp/ShoppingWebService/V3/itemSearch?appid=dj00aiZpPTdzdGl0UVl0V2VCQyZzPWNvbnN1bWVyc2VjcmV0Jng9MGQ-&jan_code="+janCode;
		console.log("url = "+url)
		$.ajax({
			url:url,
			type:"GET",
			dataType:"json",
			data:{
				janCode:janCode,
			},
			async: true,
		}).done(function(result){
			console.log("この直後にresult表示")
			console.log(result);
		}).fail(function(XMLHttpRequest,textStatus,errorThrown){
			console.log("失敗に終わってしまいました...");
			alert("失敗だよ");
		});
	});
});