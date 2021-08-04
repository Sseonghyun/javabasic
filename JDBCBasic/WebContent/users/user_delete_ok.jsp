<%@ page import = "java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 세션쪽 아이디, 비밀번호, 그리고 사용자가 폼으로 보낸 비밀번호 얻기
    String spw = (String)session.getAttribute("session_pw");
    String dpw = request.getParameter("dpw");
    String sessionId = (String)session.getAttribute("session_id");
   
    System.out.println("세션에서 받은 비번 : " + spw);
    System.out.println("폼에서 받은 비번 : " + dpw);
    System.out.println("세션에서 받은 아이디 : " + sessionId);
    
    Connection con = null;
    
    PreparedStatement pstmt = null;
    
    if(spw.equals(dpw)) {
    // DB연결 로직을 집어넣어주세요
    try { 
    	Class.forName("com.mysql.cj.jdbc.Driver");

    	String url = "jdbc:mysql://localhost/ict03";
    	
    	con = DriverManager.getConnection(url, "root", "mysql");
    	
    // DELETE 쿼리문 작성
    String sql = "DELETE FROM users WHERE uid =?";
    
    // 쿼리문 ? 자리에 적용할 변수 집어넣기
    pstmt = con.prepareStatement(sql);
    pstmt.setString(1, sessionId);
    
    // 쿼리문 실행
    pstmt.executeUpdate();
    
    // 세션 파기는 두 번 실행할 수 없으므로
    // 로직당 한 번만 실행되도록 배치한다.
    session.invalidate();
    
    } catch (SQLException e) {
    	e.printStackTrace();
    } finally {
    	// 연결 끊기
    	 try {
    			if(con!=null && !con.isClosed()) {
    				con.close();
    			}
    			if(pstmt!=null && !pstmt.isClosed()) {
    				pstmt.close();
    			}
    		
    		} catch (SQLException e) {
    			e.printStackTrace();
    	    }
     } 
     
} else {
	session.invalidate();
	response.sendRedirect("user_login_form.jsp");
}
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><%= sessionId %>계정 삭제가 완료되었습니다</h1>
<a href = "user_login_form.jsp">로그인 화면으로 돌아가기</a>
</body>
</html>