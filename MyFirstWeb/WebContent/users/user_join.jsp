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
<div class="container">

<div class="row">
<h1 class="text-primary">회원가입 창</h1>
</div>

<form action = "/MyFirstWeb/join.do" method = "post">

<div class="input-group">
<div class="input-group-prepend">
<span class="input-group-text">ID</span>
</div>
<input type = "text" class="form-control" placeholder = "ID">
</div>
<br>

<div class="input-group">
<div class="input-group-prepend">
<span class="input-group-text">PW</span>
</div>
<input type = "password" class="form-control" placeholder = "PW">
</div>
<br>

<div class="input-group">
<div class="input-group-prepend">
<span class="input-group-text">NAME</span>
</div>
<input type = "text" class="form-control" placeholder = "NAME">
</div>
<br>

<div class="input-group">
<div class="input-group-prepend">
<span class="input-group-text">Email</span>
</div>
<input type = "email" class="form-control" placeholder = "Email">
<div class="input-group-append">
<span class="input-group-text">ex)ooo@ooo.com/net</span>
</div>
</div>
<br>

<div class="row">
<div class="col-md-1">
<input type = "submit" value = "회원가입" class="btn btn-info">
</div>
</div>

</form>

</div>

</body>
</html>