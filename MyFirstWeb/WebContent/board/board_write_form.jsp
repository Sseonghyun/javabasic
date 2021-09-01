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
<h1 class="text-primary">글쓰기 창</h1>
</div>

<form action = "/MyFirstWeb/boardwrite.do" method = "post">

<div class="row">
<div class="col-md-2">
<h4>글 제목</h4>
</div>
<div class="col-md-4">
<input type = "text" name = "title" class="form-control">
</div>
</div>

<div class="row">
<div class="col-md-2">
<h4>글 본문</h4>
</div>
<div class="col-md-4">
<textarea cols="50" rows="10" class="form-control" name = "content"></textarea>
</div>
</div>

<div class="row">
<div class="col-md-2">
<h4>글쓴이</h4>
</div>
<div class="col-md-4">
<input type = "text" name = "writer" class="form-control">
</div>
</div>

<div class="row">
<div class="col-md-3">
<button type ="submit" class="btn btn-primary">글쓰기</button>
<button type ="reset" class="btn btn-info">초기화</button>
</div>
</div>

</form>

</div>

</body>
</html>