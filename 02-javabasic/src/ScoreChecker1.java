import java.util.Scanner;

//문제풀이 요구사항
// 성적 판독기를 만들어보겠습니다.
// if~else if~else 구문을 사용해 만들어보세요.
// 성적기준은 95점이상 A+ , 90점이상 A0 , 85점이상 B+
//        80점이상 B0 , 75점이상 C+ , 70점이상 C0
//        65점이상 D+ , 60점이상 D0 , 60미만 F로 프린트구문으로 콘솔에 출력
// 스캐너로 int score변수에 성적을 입력
public class ScoreChecker1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("성적을 입력해주세요.");
		
		int score = scan.nextInt();
		
		if(score >= 95) {
			System.out.println("A+입니다.");
		}
		else if(score >= 90) {
			System.out.println("A0입니다.");
		}
		else if(score >= 85) {
			System.out.println("B+입니다.");
		}
		else if(score >= 80) {
			System.out.println("B0입니다.");
		}
		else if(score >= 75) {
			System.out.println("C+입니다.");
		}
		else if(score >= 70) {
			System.out.println("C0입니다.");
		}
		else if(score >= 65) {
			System.out.println("D+입니다.");
		}
		else if(score >= 60) {
			System.out.println("D0입니다.");
		}
		else {
			System.out.println("F입니다.");
		}
	}

}
