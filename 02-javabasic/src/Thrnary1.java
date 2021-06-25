
public class Thrnary1 {

	public static void main(String[] args) {
		// 3항 연산자는 ( 조건식 ? 결과1 : 결과2 )로 작성
		// 조건식의 결과가 true라면 결과1
		// 조건식의 결과가 false라면 결과2로 출력
		System.out.println( (3>5 ? "참" : "거짓") );//3은 5보다 크다 (거짓)
		// 조건식의 결과가 false이므로 결과2로 출력된다.
		System.out.println( (3<5 ? "참" : "거짓") );//3은 5보다 작다 (참)
		// 조건식의 결과가 true이므로 결과1로 출력된다.
	}
// 계산순서
// - 소괄호 > 단항 > 이항 > 삼항 > 대입
}
