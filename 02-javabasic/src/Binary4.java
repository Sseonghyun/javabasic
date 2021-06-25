
public class Binary4 {

	public static void main(String[] args) {
		// 비트 이동 연산자는 숫자 >>,<< 자리수 문법
		// 꺽쇠의 방향이 << 인 경우 왼쪽으로 입력된 자리수 만큼 밀어준다.
		// 이때 정수의 숫자는 2의 자리수 제곱만큼 증가
		// 반대의 >> 인 경우 오른쪽으로 입력된 자리수 만큼 밀어준다.
		// 이때 정수의 숫자는 2의 자리수 제곱만큼 감소
		int a = 80;
		System.out.println(a >> 3); // 80에서 3번 감소시키면  40,20,10
		System.out.println(a << 3); // 80에서 3번 증가시키면 160,320,640
	}

}
