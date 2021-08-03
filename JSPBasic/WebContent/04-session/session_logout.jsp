<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = (String)session.getAttribute("session_id");
String pw = (String)session.getAttribute("session_pw");
String nickN = (String)session.getAttribute("session_nickname");

session.invalidate(); // 세션 파기 코드 
response.sendRedirect("session_login.jsp"); // login 페이지로 리다이렉트

%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>