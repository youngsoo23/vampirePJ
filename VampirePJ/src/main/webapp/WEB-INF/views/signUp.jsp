<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
	<title>signUp</title>
</head>
<body>
<h1>
	Hello! Welcome To Vampire Blood Checker Project!  
</h1>

<form method="POST" action="userInsert.do">
	<ul>
		<li><label for="user_id">아이디 입력</label></li>
		<li><input type="text" name="user_id" id="user_id" required/></li>
		<li><label for="user_pwd">패스워드 입력</label></li>
		<li><input type="text" name="user_pwd" id="user_pwd" required/></li>
		<li><label for="user_name">이름</label></li>
		<li><input type="text" name="user_name" id="user_name" required/></li>
		<li><label for="user_age">나이</label></li>
		<li><input type="text" name="user_age" id="user_age" required/></li>
		<li><label for="user_gender">성별</label></li>
		<li><select name="user_gender" id="user_gender" required>
			<option value="">선택해주세요</option>
			<option value="M">남자</option>
			<option value="F">여자</option>
		</select>
		</li>
	</ul>
	<input type="submit"> 
</form>

</body>
</html>
