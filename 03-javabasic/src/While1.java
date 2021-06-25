
public class While1 {

	public static void main(String[] args) {
		// While문은 타겟이 되는 실행문을 반복해서 실행하는 구문
		// While문은 실행여부를 조건식 비교를 통해 결정
		// 한 번 실행하기로 결정되면 모든 타겟 실행문을 실행
		// 실행이 끝나면 다시 While구문으로 복귀
		// 추가 비교를 통해 실행/탈출 여부가 결정
		int a = 0;
		while(a < 2) { // a(0) 2보다 작다 = 참(실행), a(1) 2보다 작다 = 참(실행) , a(2) 2보다 작다 = 거짓(탈출)
			a += 1; // a(0) + 1 , a(1) + 1
			System.out.println(a + "번째 실행.");
		}
		int b = 0;
		while(b < 4) {
			b += 1;
			System.out.println(b + "번째 실행");
		}
	}

}
