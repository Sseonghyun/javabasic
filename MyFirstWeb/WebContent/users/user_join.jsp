<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입 창</h1>
<form action = "/MyFirstWeb/join.do" method = "post">
아이디 : <input type = "text" name = "uid" placeholder = "ID"><br/>
비밀번호 : <input type = "password" name = "upw" placeholder = "PW"><br/>
이름 : <input type = "text" name = "uname" placeholder = "NAME"><br/>
이메일 : <input type = "email" name = "email" placeholder = "EMAIL"><br/>
<input type = "submit" value = "회원가입">


</form>
</body>
</html>