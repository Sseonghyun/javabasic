
public class For1 {

	public static void main(String[] args) {
		// for문은 while문과는 다르게 몇 바퀴 돌릴지 정해진 상황에서 사용하는 반복문
		// 문법법은 for(시작변수; 종료조건; 증감식) {
		// 실행구문;
		// }
		// 으로 이루어져있습니다.
		for(int i = 0; i < 2; i++) {
			System.out.println("for를 이용한 반복문." + i);
		} // int i = 0; 1.초기식 선정
		  // i < 2; 2.조건식 해석
		  // System.out.println("for를 이용한 반복문." + i); 3.실행문
		  // i++ 4.증감식
		  // 첫번째로는 1(초기식) - 2(조건식) - 3(실행문) - 4(증감식)
		  // 두번째로는 2(조건식) - 3(실행문) - 4(증감식) ----(조건식이 거짓이 될때까지 반복 후 종료)
	}

}
