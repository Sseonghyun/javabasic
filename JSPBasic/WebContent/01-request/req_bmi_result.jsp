<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
String height = request.getParameter("height");
String weight = request.getParameter("weight");
double h = Double.parseDouble(height);
double w = Double.parseDouble(weight);
// BMI 지수 계산공식 [ 체중 / 신장(m)*신장(m) ]
double bmi = w / (h/100 * h/100);
%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BMI 계산</title>
</head>
<body>
<h2>BMI 계산 웹 어플리케이션</h2>
키 : <b><%= height %></b><br/>
몸무게 : <b><%= weight %></b><br/>
BMI 지수 : <b><%= bmi %></b><br/>
<%if(bmi > 23) {%>
<b>과체중입니다.</b>
<% } else if(bmi < 18.5) {%>
<b>저체중입니다.</b>
<% } else {%>
<b>정상체중입니다.</b>
<% } %>

</body>
</html>