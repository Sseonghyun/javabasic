<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 세션이 존재한다면 바로 user_login_ok.jsp로 보내주는 로직을 작성해주세요.
String idSession = (String)session.getAttribute("session_id");
if(idSession != null) {
    response.sendRedirect("user_login_ok.jsp");
}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인</h1>
<form action = "user_login_ok.jsp" method = "post">
<input type = "text" name = "uid" placeholder="ID"/><br/>
<input type = "password" name = "upw" placeholder="PW"/><br/>
<input type = "submit" value = "로그인"><br/>
<a href = "users_join_form.jsp">회원가입</a>
</form>
</body>
</html>