<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
List<Integer> lotto = new ArrayList<>();
int getNum = 0;
%>
<%
while(lotto.size() !=6) { 
	getNum = (int)(Math.random() * 45) +1; 
	if(!lotto.contains(getNum)) {
		lotto.add(getNum); 
	}
}
Collections.sort(lotto);
%>
<h2>로또번호 생성 결과</h2>
<p>
이번주 로또는 이 번호다!<br/>
<%= lotto %>
</p>
</body>
</html>