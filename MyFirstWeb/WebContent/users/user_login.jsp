<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container"> <!-- container 열기 -->

<div class="row"> <!-- row 열기 -->
<h1 class="text-danger">로그인창</h1>
</div> <!-- row 닫기 -->

<form action = "/MyFirstWeb/login.do" method = "post" >

<div class="row"> <!-- row 열기 -->
<div class="col-md-2"> <!--  col-md-2 열기 -->
<h4 class="text-success">아이디</h4>
</div> <!--  col-md-2 닫기 -->
<div class="col-md-4"> <!--  col-md-4 열기 -->
<input type = "text" name = "uid" placeholder = "ID" class="form-control">
</div> <!--  col-md-4 닫기 -->
</div> <!-- row 닫기 -->

<div class="row"> <!-- row 열기 -->
<div class="col-md-2"> <!--  col-md-2 열기 -->
<h4 class="text-info">비밀번호</h4>
</div> <!--  col-md-2 닫기 -->
<div class="col-md-4"> <!--  col-md-4 열기 -->
<input type = "password" name = "upw" placeholder = "PW" class="form-control">
</div> <!--  col-md-4 닫기 -->
</div> <!-- row 닫기 -->

<div class="row"> <!-- row 열기 -->
<div class="col-md-1"> <!-- col-md-1 열기 -->
<input type = "submit" value = "로그인" class="btn btn-info">
</div> <!-- col-md-1 닫기 -->
<div class="col-md-2">
<a href = "http://localhost:8181/MyFirstWeb/users/user_join.jsp" class="btn btn-info">회원가입</a>
</div>
</div> <!-- row 닫기 -->

</form>



</div> <!-- container 닫기 -->

</body>
</html>