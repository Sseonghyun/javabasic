package kr.co.ictedu.user.model;

public class UsersVO {
	/*
	 * VO / DTO
	 * - VO클래스는 웹서버와 DB간의 데이터 송수신을 돕는
	 * 자바 클래스 파일입니다.
	 * 
	 * - VO클래스를 설계할 떄는 DB테이블 컬럼 갯수만큼
	 * 1:1로 자료형, 이름 등이 매칭되어 있는 멤버변수들을 선언합니다.
	 * 
	 * - VO클래스 내부 변수들은 private 접근 제한자를 걸어서
	 * 데이터 접근을 제한합니다.
	 */
	private String uid;
	private String upw;
	private String uname;
	private String email;
	
	// Alt + Shift + s 혹은 
    // 우클릭 -> source에 있는 메뉴 활용
	// VO클래스는 기본생성자와 모든 멤버변수를 초기화하는 생성자를 선언
	public UsersVO() {
		// 기본생성자는 직접 작성
	}
	// Generate Constructor Using Fileds..
	public UsersVO(String uid, String upw, String uname, String email) {
		super();
		this.uid = uid;
		this.upw = upw;
		this.uname = uname;
		this.email = email;
	}
	
	// Getter와 Setter도 선언
	// Generate Getters and Setters -> Select ALL
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Generate toString -> 그대로 생성
	@Override
	public String toString() {
		return "UsersVO [uid=" + uid + ", upw=" + upw + ", uname=" + uname + ", email=" + email + "]";
	}
	
	
	
	
	
	
}
