import java.sql.*;
import java.util.Scanner;

public class JdbcUpdate {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		Scanner	scan = new Scanner(System.in);
		System.out.println("수정할 글의 번호를 입력해주세요.");
		int upNum = scan.nextInt();
		System.out.println("수정할 글을 입력해주세요.");
		String upStr = scan.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sqldb";
			con = DriverManager.getConnection(url, "root", "mysql");
			
			stmt = con.createStatement();
			
			String sql = "UPDATE JDBCInsert SET str ='" + upStr + "'" + "WHERE num =" + upNum;
		             
		    System.out.println(sql);
		    
		    stmt.executeUpdate(sql);
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
			} catch(SQLException e) {
				e.printStackTrace(); 
			}
	}

}
}