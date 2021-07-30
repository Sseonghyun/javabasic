<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 한글 데이터가 POST 전송시 깨지지 않도록 처리.
// request.setCharacterEncoding("uft-8");

// 폼에서 던진 데이터를 받기 위해서는 request.getparameter("name값")을 활용합니다.
// name = "apple"에서 던져진 데이터를 받기 위해서는
String id = request.getParameter("id");
// name = "banana"에서 던져진 데이터를 받기 위해서는
String pw = request.getParameter("pw");
// name = "orange"에서 던져진 데이터를 받기 위해서는
String nick = request.getParameter("nick");

// String hobby = request.getParameter("hobby");
// 체크박스는 복수의 데이터가 넘어올 수 있기 때문에
// request.getParameterValues("네임명");을 사용합니다.
String[] hobby = request.getParameterValues("hobby");

String[] special = request.getParameterValues("special");

String gender = request.getParameter("gender");

String hair = request.getParameter("hair");

String region = request.getParameter("region");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
아이디 : <b><%= id %></b><br/>
비밀번호 : <b><%= pw %></b><br/>
닉네임 : <b><%= nick %></b><br/>
<!-- 1번 방법 -->
취미 : 
<%for(String name : hobby) {%>
<b><%= name %></b>&nbsp;
<%} %>
<!-- 2번 방법 -->
취미 : <b><%= Arrays.toString(hobby) %></b>
<br/>
<!-- 1번 방법 -->
특기 :
<%for(String name : special) {%>
<b><%= name %></b>&nbsp;
<%} %>
<!-- 2번 방법 -->
특기 : <b><%= Arrays.toString(special) %></b>
<br/>
성별 : <b><%= gender %></b>
<br/>
머리길이 : <b><%= hair %></b>
<br/>
지역 : <b><%= region %></b>
</body>
</html>