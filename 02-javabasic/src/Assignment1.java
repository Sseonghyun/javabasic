
public class Assignment1 {

	public static void main(String[] args) {
		// 대입 연산자란 특정 변수 값을 연산자 우측에 입력한 값
		// 계산해 결과값을 저장해주는 기능
		// 단순 연산자로는 =
		// 복합 대입연산자로는 +=, -=, *=, /=, %=
		// 대입 연산자를 사용하는 경우에만 예외적으로 코드의 실행방향이 오른쪽에서 왼쪽방향으로 판단
		int a = 10;
		System.out.println(a);
		a += 10; // a = a(10) + 10; (+더하기)
		System.out.println(a);
		a -= 5; // a = a(20) - 5; (-빼기)
		System.out.println(a);
		a *= 3; // a = a(15) * 3; (#곱하기)
		System.out.println(a);
		a /= 4; // a = a(45) / 4; (/나누기)
		System.out.println(a);
		a %= 12;// a = a(11) % 12; (%나누고 남은값)
		System.out.println(a);
	}

}
