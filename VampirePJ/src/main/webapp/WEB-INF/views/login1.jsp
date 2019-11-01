<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<form method="post" action="getUserInfo.do"> 
<ul>
<li><label for="user_id">아이디 </label></li>
<li><input type="text" id="user_id" name="user_id"/></li>
<li><label for="user_pwd">패스워드 </label></li>
<li><input type="password" id="user_pwd" name="user_pwd"></li>
</ul>
<input type="submit">
</form>
</body>
</html>