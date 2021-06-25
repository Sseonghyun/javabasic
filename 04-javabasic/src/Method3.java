
public class Method3 {

	public static void plus(int a , int b) { //plus 메서드 이름 (int a , int b) 매개변수 parameter
		System.out.println(a + b);
	}
	public static void main(String[] args) {
		// 내부 실행문에서 두 개 이상의 변수를 요구한다면
		// 두 개 이상의 매개변수를 선언할 수 있습니다.
		// 이 경우 상대적인 위치에 맞춰서 전달됩니다.
		plus(3, 5);// 두군데 모두 같은 숫자를 넣고싶어도 따로 작성이 필요 ex: plus(3) x plus(3,3)
	}

}
