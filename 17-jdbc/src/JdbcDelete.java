import java.sql.*;
import java.util.Scanner;

public class JdbcDelete {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		Scanner	scan = new Scanner(System.in);
		System.out.println("삭제할 번호를 입력하세요.");
		int dlNum = scan.nextInt();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sqldb";
			con = DriverManager.getConnection(url, "root", "mysql");
			
			stmt = con.createStatement();
			
			String sql = "DELETE FROM JDBCInsert WHERE num ="  + dlNum;
			
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
