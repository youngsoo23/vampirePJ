<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<script type="text/javascript">
	$(document).ready(function() {
		$('#signUpBtn').on('click', function() {
			submit();
		})
	})
</script>
</head>
<body>
	<h1>Hello! Welcome To Vampire Blood Checker Project!</h1>
	<form method="GET" action="signUp.do">
		<button id="signUpBtn">회원가입</button>
	</form>
</body>
</html>