<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>

<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#username").blur(function(){
			$.post('form5',{stuName:$(this).val()},function(r){
				alert(r);
				$.each(r,function(i,e){
					
					alert(i+""+e.stuName+""+e.address);
				})
			},"json")
	})	
})
</script>
</head>
<body>
<h1>使用注入</h1>
<form action="index.html" method="post"><br/>
	用户名:<input type="text" name="students[0].stuName"/><br/>
	密 码:<input type="password" name="students[0].address"/><br/>
	用户名:<input type="text" name="students[1].stuName"/><br/>
	密 码:<input type="password" name="students[1].address"/><br/>
	<input type="submit" value="提交"/>
</form>

<h1>使用ajax</h1>
<form action="index" method="post"><br/>
	用户名:<input type="text" name="id" id="username"/><br/>
	密 码:<input type="password" name="address"/><br/>
	<input type="submit" value="提交"/>
</form>

${dd.stuName }
</body>
</html>