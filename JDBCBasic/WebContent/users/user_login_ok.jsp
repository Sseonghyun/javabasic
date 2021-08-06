<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@ page import = "java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String uid = request.getParameter("uid"); 
String upw = request.getParameter("upw");

Connection con = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

String idSession = (String)session.getAttribute("session_id");
String pwSession = (String)session.getAttribute("session_pw");

// if~eles문으로 try~catch~finally를 감싸서
// 세션이 존재할 때는 DB에서 데이터를 가져오는 로직을 생략해주세요.	
String idsession = (String)session.getAttribute("session_id");

if(idSession != null ) {
	uid = idSession;
} else {
	// 1. dao 생성
	UsersDAO dao = UsersDAO.getInstance();
	
	// 2. dao 로 로그인 검사
	UsersVO user = new UsersVO();
	user.setUid(uid);
	user.setUpw(upw);
	
	int LoginResultNum = dao.usersLogin(user);
	// System.out.println("결과코드 : " + LoginResultNum);
	
	if (LoginResultNum == 1) {
		session.setAttribute("session_id", uid);
		session.setAttribute("session_pw", upw);
	} else if (LoginResultNum == 0) {
		response.sendRedirect("user_login_form.jsp");
		
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인이 완료되었습니다</h1><br/>
<h1>환영합니다<%=uid %>님.</h1><br/>
<a href = "user_logout.jsp">로그아웃</a>
<a href = "user_delete_form.jsp">회원탈퇴</a>
<a href = "user_update_form.jsp">회원정보 수정하기</a>
<a href = "user_get_all.jsp">회원 전체 목록 보기</a>

</body>
</html>