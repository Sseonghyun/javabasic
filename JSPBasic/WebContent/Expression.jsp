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
public String name = "김철수";
public int age = 20;
// 아래에 원 넓이를 구하는 areaCircle을 선언 해주시고
// 아래쪽에는 표현식 내부에서 호출하도록 해 주세요
// 반지름을 입력받아서 (반지름 제곱 * Math.PI);를 실행해서
// 리턴하는 함수입니다.
public double areaCircle(double r) {
	return r * r * Math.PI;
}
%>
<%
out.println("이름 : " + name + "<br/>");
out.println("나이 : " + age + "<br/>");
%>
이름 : <%= name %><br/>
나이 : <%= age %><br/>
반지름 5인 원의 넓이 : <%= areaCircle(5) %>cm^2 <br/>
반지름 10인 원의 넓이 : <%= areaCircle(10) %>cm^2
</body>
</html>