<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String Id = request.getParameter("id");
    String Pw = request.getParameter("pw");
    %>
<!DOCTYPE html>
<html>
<% if(Id.equals("abcd") && Pw.equals("1234")) {%>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<body>
<b><%= Id %></b>님 환영합니다.
</body>

<% } else if(Id.equals("abcd")) { %>
<head>
<meta charset="UTF-8">
<title>로그인 실패</title>
</head>
<body>
<b>PASSWORD를 잘못 입력하셨습니다.</b>
<a href="req_login_form.jsp">로그인화면으로 돌아가기</a>
</body>
<% } else if(Pw.equals("1234")){%>

<head>
<meta charset="UTF-8">
<title>로그인 실패</title>
</head>
<body>
<b>ID를 잘못입력하셨습니다.</b>
<a href="req_login_form.jsp">로그인화면으로 돌아가기</a>
</body>
<% } else {%>

<head>
<meta charset="UTF-8">
<title>로그인 실패</title>
</head>
<body>
<b>없는 계정입니다.</b>
<a href="req_login_form.jsp">로그인화면으로 돌아가기</a>
</body>
<% } %>
</html>