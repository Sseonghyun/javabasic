
public class If1 {

	public static void main(String[] args) {
		/* if(조건식) {
		 * 실행할 구문1;
		 * 실행할 구문2....
		 * } 
		 */
		int a = 3;
		if(a > 4) {
			System.out.println("a는 4보다 큽니다.");
		}
	    // a(3)은 4보다큽니까는 거짓이기 때문에 뒤에 내용(12번라인)을 무시하여 출력하여도 나오는것이없음
		int b = 10;
		if(b > 4) {
				System.out.println("b는 4보다 큽니다.");
		}
		// b(10)은 4보다큽니까는 참이기 때문에 뒤에 내용(16번라인) 출력하면 나옴
	}
}
