<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String travel = request.getParameter("travel"); 
    %>
    
    <%
    if (travel.equals("jeju")) {
    	response.sendRedirect("travel_jeju.jsp");
    } else if (travel.equals("busan")) {
    	response.sendRedirect("travel_busan.jsp");
    } else if (travel.equals("yeosu")) {
    	response.sendRedirect("travel_yeosu.jsp");
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