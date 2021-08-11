<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>수정</h1>

<form action="http://localhost:8181/MyFirstWeb/boardupdateok.do" method="post">

<input type = "hidden" name = "id" value = "${board.bid }">
<input type = "hidden" name = "hit" value = "${board.bhit }">
<input type = "hidden" name = "date" value = "${board.bdate }">
<input type = "hidden" name = "name" value = "${board.bname }">

<table border = "1">

<tr>
<td>글 번호</td>
<td>${board.bid }</td>
<td>조회수</td>
<td>${board.bhit }</td>
</tr>

<tr>
<td>쓴 날짜</td>
<td>${board.bdate }</td>
</tr>

<tr>
<td>글 제목</td>
<td><input type = "text" name = "title" value ="${board.btitle }"></td>
</tr>

<tr>
<td>본문</td>
<td><textarea cols = "30" rows = "30" name="content">${board.bcontent}</textarea></td>
</tr>

<tr>
<td>글쓴이</td>
<td>${board.bname }</td>
</tr>

<tr>
<td>
<a href = "/MyFirstWeb/boardselect.do"><input type = "button" value = "리스트로 돌아가기"></a>
</td>
<td>
<input type = "submit" value = "수정하기">
<input type = "reset" value = "초기화">
</td>
</tr>

</table>
</form>
</body>
</html>