
public class IfElse1 {

	public static void main(String[] args) {
		// if~else구문은 참일때 실행할 구문과 거짓일때 실행할 구문을 함께 작성
		// if~else구문은 한 구문으로 간주되어 연산횟수를 철약
		// else문은 if문 없이 단독으로 쓰일 수 없다.
		// else문은 조건식을 작성할 필요가 없다.
		int a = 14;
		
		if(a == 15) {
			System.out.println("15입니다.");
		}
		else {
			System.out.println("15가 아닙니다.");
		}
	}

}
