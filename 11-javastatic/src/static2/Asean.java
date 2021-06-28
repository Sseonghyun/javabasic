package static2;

public class Asean {
	// 중간고사 , 기말고사, 출석, 조별과제 점수를 변수로 정의해주세요.
	// 단, 조별과제는 모든 객체가 공유하는 점수이며
	// 나머지는 개별 객체가 가지는 변수입니다.
	private int mid;
	private int finals;
	private int check;
	
	// public시 일반 메서드에서 score조회 가능
	// private시 static 메서드에서만 score조회 가능
	private static int score = 20;
	
	// 생성자는 객체 생성시 중간고사, 기말고사, 출석점수를 받습니다.
	public Asean(int mid,int finals,int check) {
		this.mid = mid;
		this.finals = finals;
		this.check = check;
	}
	
	// showAseanInfo()를 정의해주세요
	// 이 메서드는 중간고사, 기말고사, 출석, 조별과제 성적을
	// 콘솔에 출력합니다.
	public void showAseanInfo() {
		System.out.println("중간고사 점수는 :" + mid + "점 입니다.");
		System.out.println("기말고사 점수는 :" + finals + "점 입니다.");
		System.out.println("출석 점수는 :" + check + "점 입니다.");
		System.out.println("조별과제 점수는 :" + score + "점 입니다.");
		System.out.println("----------------------");
	}
	// Main.java를 생성해주시고 메인 메서드 내부에 구성원을 최소 4인으로 만들어주세요.
}
