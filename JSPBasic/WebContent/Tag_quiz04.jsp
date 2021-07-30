<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
// 선언부에 작성한 변수들은 단 한 번만 선언됩니다.
// 선언부에 작성한 변수들은 전역변수로 취급되어 외부 어디서든 호출이 가능합니다.
List<String> position = new ArrayList<>();
String pName;
%>
<%
// 0~4 범위의 난수
	int p = (int)(Math.random() * 5);
	switch(p) { 
	case 0 :
		pName = "스트라이커";
		break;
	case 1 :
		pName = "윙어";
		break;
	case 2 :
		pName = "미드필더";
		break;
	case 3 :
		pName = "수비수";
		break;
	case 4 :
		pName = "골키퍼";
		break;
}	
	position.add(pName);
	
	// 팀에 같은 포지션인 선수가 몇 명있는지 찾는 작업
	int cnt = 0;
	for(String player : position) {
		if(pName.equals(player)) {
			cnt += 1;
		}
	}
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>당신의 포지션</h2>
<p>
당신에게 부여된 포지션은 <b><%= pName %></b>입니다.
현재 팀에 당신과 같은 포지션을 가진 선수는 <%= cnt %> 명 입니다.
</p>
<p>
현 선수 구성<br/>
<%= position %>(<%= position.size() %>명 참가중)
</p>
<%
// 10명이되면 초기화.
if(position.size() == 10) {
	position.clear();
}
%>
</body>
</html>