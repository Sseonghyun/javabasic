<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:choose>
<c:when test="${param.number >= 90 && param.number <= 100 }">
<p>당신의 학점은 A학점입니다.</p>
</c:when>
<c:when test="${param.number >= 80 && param.number <= 100 }">
<p>당신의 학점은 B학점입니다.</p>
</c:when>
<c:when test="${param.number >= 70 && param.number <= 100 }">
<p>당신의 학점은 C학점입니다.</p>
</c:when>
<c:when test="${param.number >= 60 && param.number <= 100 }">
<p>당신의 학점은 D학점입니다.</p>
</c:when>
<c:otherwise>
<p>당신의 학점은 F학점입니다.</p>
</c:otherwise>
</c:choose>

</body>
</html>