<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
int total = 0;

int randomNumber() {
	int rn = (int)(Math.random() * 10) + 1;
	return rn;
}

String randomColor() {
	
double d = Math.random();
if(d >= 0.66) {
	return "빨강";
} else if (d >= 0.33) {
	return "노랑";
} else {
	return "파랑";
}
}
%>

<%
// Scriptlet
// 지역 변수 및 메서드 내부의 코드를 작성하는 태그
// 페이지 요청이 발생할 때마다 실행할 로직을 작성.
String str = "Web";
int each = 0;
total++;
each++;

int rn = randomNumber();
String rc = randomColor();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2><%= str %>프로그래밍</h2>
<p> 
페이지 누적 요청수 : <%= total %>,
페이지 개발 요청수 : <%= each %><br/>
</p>

<p>
<h3>오늘의 행운의 숫자와 행운의 색깔</h3>
행운의 숫자 : <b><%= randomNumber() %></b><br/>
행운의 색깔 : <i><%= rc %></i>
</p>

</body>
</html>