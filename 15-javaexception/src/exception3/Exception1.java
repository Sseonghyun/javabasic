package exception3;

public class Exception1 {
	// 다중 catch는 블럭 내부에서 여러 유형의 예외가 발생할 수 있을때
	// 각각 예외유형을 다르게 처리할 때 사용합니다.
	// 이 때 catch 구문을 여러 번 사용할 수 있습니다.
	public static void main(String[] args) {
	int[] number = { 1, 2, 3, 4, 5, 0 };
	
	try {
		for(int i=0; i<3; i++) {
			System.out.println(number[i]);
		}
		System.out.println(number[4] / number[5]);
	} catch(ArrayIndexOutOfBoundsException a) {
		System.out.println("범위를 벗어난 인덱스 번호를 입력했습니다.");
	} catch(ArithmeticException ae) {
		System.out.println("0으로 나눌수 없습니다.");
	} catch(Exception e) {
		System.out.println("이외의 예외가 발생했습니다.");
	}
	// catch 블록을 작성할 때 주의할 점은 상위 예외
	// 클래스가 하위 예외 클래스보다 아래쪽에 위치해야 합니다.
	// catch(Exception)은 만능구문이기 때문에 
	// 다중 catch를 작성할경우 가장위에 위치하면 다른 catch구문들이
	// 포함이 되기 때문에 아래쪽에 위치해야합니다.
}
}