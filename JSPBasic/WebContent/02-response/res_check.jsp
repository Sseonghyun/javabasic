<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String age = request.getParameter("age");
    int Age = Integer.parseInt(age);
    
    if(Age <= 19) {
    	response.sendRedirect("res_no.jsp");
    } else {
    	response.sendRedirect("res_ok.jsp");
    }
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