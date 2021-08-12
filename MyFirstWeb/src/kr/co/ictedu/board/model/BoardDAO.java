package kr.co.ictedu.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.mysql.cj.protocol.Resultset;


public class BoardDAO {
	// 싱글턴 패턴과 커넥션풀을 적용해서
	// DAO의 연결부(생성자, getInstance())까지 작성해주세요.
	
	private static BoardDAO dao = new BoardDAO();
	
	private DataSource ds;
	
	private BoardDAO() {
		try {
			Context ct = new InitialContext();
			ds = (DataSource)ct.lookup("java:comp/env/jdbc/mysql"); 		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static final int ID_WRITE_SUCCESS = 1;
	private static final int ID_WRITE_FAIL = 0;
	
	
	
	
	
	
	public static BoardDAO getInstance() {
		if(dao == null) {
			dao = new BoardDAO();
		}
		return dao;
	}
	
	public int write(BoardVO board) {
		// Connection, PreparedStatement 객체 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		
		int resultCode;
		
		// 구문 작성
		// bId는 auto_increment가 붙어있으므로 입력 안 해도 됨
		// bName, bTitle, bContent는 폼에서 날려준걸 넣음
		// bDate는 자동으로 현재 서버시간을 입력함
		// bHit는 자동으로 0을 입력함
		String sql = "INSERT INTO jspboard" + "(bname, btitle, bcontent, bdate, bhit)" +
		"VALUES (?, ?, ?, now(), 0)";
		
		try {
			// 커넥션 생성 및 pstmt에 쿼리문 넣고 완성시켜서 실행까지 하고
			// close()로 메모리회수까지 해주세요.
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString (1, board.getBname());
			pstmt.setString (2, board.getBtitle());
			pstmt.setString (3, board.getBcontent());
			
			pstmt.executeUpdate();
			
			resultCode = 1;
			
		} catch (SQLException e) {
			e.printStackTrace();
			resultCode = 0;
		} finally {
			try { // con 닫기
				if(con!=null && !con.isClosed()) {
					con.close();
				} // pstmt 닫기
				if(pstmt!=null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	} return resultCode;
} // write end
	
	// 모든 게시글의 정보를 DB로부터 얻어올 메서드
	public List<BoardVO> getBoardList() {
		// 내부에서 사용할 변수 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<BoardVO> boardList = new ArrayList<>(); 
		// SQL문 작성
		String sql = "SELECT * FROM jspboard ORDER BY bId DESC";
		
		try {
			// 커넥션 연결 후 DB에 쿼리 쏴주시고
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			// boardList에 DB내 모든 글을 저장해주세요.
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setBid(rs.getInt("bid"));
				board.setBname(rs.getString("bname"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBdate(rs.getTimestamp("bdate"));
				board.setBhit(rs.getInt("bhit"));
				
				boardList.add(board);
			}	
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
					try { // con 닫기
						if(con!=null && !con.isClosed()) {
							con.close();
						} // pstmt 닫기
						if(pstmt!=null && !pstmt.isClosed()) {
							pstmt.close();
						} // rs 닫기
						if(rs!=null && !rs.isClosed()) {
							rs.close();
						}
						
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
			
		return boardList;
		} 
	
	public BoardVO getBoardDetail(String bid) {
		// bid에 해당하는 글 정보를 가져와서 리턴하도록 로직을 작성해주세요.
		BoardVO board = new BoardVO();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM jspboard WHERE bid=?";
		
		try {
			// 커넥션 연결 후 DB에 쿼리 쏴주시고
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bid);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board.setBid(rs.getInt("bid"));
				board.setBname(rs.getString("bname"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBdate(rs.getTimestamp("bdate"));
				board.setBhit(rs.getInt("bhit"));
			}	
			
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
					try { // con 닫기
						if(con!=null && !con.isClosed()) {
							con.close();
						} // pstmt 닫기
						if(pstmt!=null && !pstmt.isClosed()) {
							pstmt.close();
						} // rs 닫기
						if(rs!=null && !rs.isClosed()) {
							rs.close();
						}
						
					} catch (SQLException e) {
						e.printStackTrace();
					}
		
					
	}
		return board;
	
	
	} // detail end
	
	
	// 글 삭제로직
	public int deleteBoard(String bid) {
		// 사용할 변수 선언
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		int resultcode;
		
		String sql = "DELETE FROM jspboard WHERE bid=?";
	
		try {
		// 커넥션 연결 및 쿼리문 실행	
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bid);
			
			pstmt.executeUpdate();
			
			resultcode = 1;
			
			} catch(Exception e) {
				e.printStackTrace();
				resultcode = 0;
			} finally {
					try { // con 닫기
						if(con!=null && !con.isClosed()) {
							con.close();
						} // pstmt 닫기
						if(pstmt!=null && !pstmt.isClosed()) {
							pstmt.close();
						} 	
						
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
	}
		return resultcode;
	
} // delete end 
	
	// 글 수정 로직
	public int updateBoard (BoardVO board) {
		// 변수 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		
		int resultCode;
		
		String sql = "UPDATE jspboard SET " +
				" bname=?, btitle=?, bcontent=?, bdate=?, bhit=? " +
				" WHERE bid=? ";

	try {
		// 커넥션 연결 후 DB에 쿼리 쏴주시고
		con = ds.getConnection();
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, board.getBname());
		pstmt.setString(2, board.getBtitle());
		pstmt.setString(3, board.getBcontent());
		pstmt.setTimestamp(4, board.getBdate());
		pstmt.setInt(5, board.getBhit());
		pstmt.setInt(6, board.getBid());
		
		
		pstmt.executeUpdate();
		
		resultCode = 1;
		
		} catch(Exception e) {
			e.printStackTrace();
			resultCode = 0;
		} finally {
				try { // con 닫기
					if(con!=null && !con.isClosed()) {
						con.close();
					} // pstmt 닫기
					if(pstmt!=null && !pstmt.isClosed()) {
						pstmt.close();
					} 
							
				} catch (SQLException e) {
					e.printStackTrace();
				}
	
				
}
	return resultCode;
	
}// update end

	
	
	// 글 조회를 상승시키는 메서드
	public void upHit(String bid) {
		// 필요 변수들을 생성해주세요
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		// 특정 글의 조회수를 1 올리는 쿼리문
		String sql = "UPDATE jspboard SET bhit = bhit + 1 " +
		             "WHERE bid = ?";
		
		// DB연결 후 코드를 생성해주세요.
		try {
			// 커넥션 연결 후 DB에 쿼리 쏴주시고
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bid);
			
			pstmt.executeUpdate();			
				
	      } catch(Exception e) {
		     e.printStackTrace();     
	     } finally {
			try { // con 닫기
				if(con!=null && !con.isClosed()) {
					con.close();
				} // pstmt 닫기
				if(pstmt!=null && !pstmt.isClosed()) {
					pstmt.close();
				} 	
			} catch (SQLException e) {
				e.printStackTrace();
			}	
   }	
	
} // end uphit
	
	
}