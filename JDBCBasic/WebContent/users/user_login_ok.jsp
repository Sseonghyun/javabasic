<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
String pw = request.getParameter("pw");

if(id.equals(id) && pw.equals(pw)) {
session.setAttribute("session_id",id);
} else {
response.sendRedirect("login_fail.jsp");
} %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
환영합니다 <%=id%>님.
</body>
</html>