<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인창</h1>
<form action = "/MyFirstWeb/login.do" method = "post">
<input type = "text" name = "uid" placeholder = "ID"><br/>
<input type = "password" name = "upw" placeholder = "PW"><br/>
<input type = "submit" value = "로그인">
</form>

<form action = "user_join.jsp" method = "post">
<input type = "submit" value = "회원가입">
</form>
</body>
</html>