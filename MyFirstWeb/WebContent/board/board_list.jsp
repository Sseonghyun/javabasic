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
   
   <%-- 페이징 버튼 만들기 
      표현할 글이 있는 경우에만 버튼을 표시함--%>
   <c:if test="${pageDTO.hasBoard() }">
   
   <%-- 뒤로가기 버튼을 표시할지 말지 결정하는 부분 --%>
   <c:if test="${pageDTO.startPage > 10}" >
   <a href = "/MyFirstWeb/boardselect.do?page=${pageDTO.startPage - 10}">[prev]</a>
   </c:if>
   
   <%-- 페이지 번호 10개 묶음을 깔아주는 부분 --%>
   <c:forEach var = "pNo" begin = "${pageDTO.startPage }" end = "${pageDTO.endPage }">
   <a href = "/MyFirstWeb/boardselect.do?page=${pNo}">[${pNo}]</a>
   </c:forEach>
   
   <%-- 다음으로 가기 버튼을 표시할지 말지 결정하는 부분 --%>
   <c:if test="${pageDTO.endPage < pageDTO.totalPages }">
   <a href = "/MyFirstWeb/boardselect.do?page=${pageDTO.startPage + 10}">[next]</a>
   </c:if>
   
   </c:if>
   <%-- 페이징 버튼 끝 --%>
   <br/>
   <a href = "/MyFirstWeb/board/board_write_form.jsp">글쓰기</a>
   <a href = "/MyFirstWeb/userlogout.do">로그아웃 하기</a>
   
</body>
</html>