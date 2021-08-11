<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>게시물 목록</h1>
<table border="1">
   <thead>
     <tr>
          <th>글번호</th>
          <th>글제목</th>
          <th>글쓴이</th>
          <th>글쓴날짜</th>
          <th>조회수</th>
     </tr>
   </thead>
   
   <tbody>
   <c:forEach var="board" items="${boardList}">
   <tr>
	   <td>${board.bid}</td>
	   <td><a href="/MyFirstWeb/boarddetail.do?bid=${board.bid }">${board.btitle}</a></td>
	   <td>${board.bname}</td>
	   <td>${board.bdate}</td>
	   <td>${board.bhit}</td>
   </tr>
   </c:forEach>
   </tbody>
   
   </table>
   <a href = "/MyFirstWeb/board/board_write_form.jsp">글쓰기</a>
</body>
</html>