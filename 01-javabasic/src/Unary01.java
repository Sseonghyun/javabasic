
public class Unary01 {

	public static void main(String[] args) {
		//단항 연산자 ++, -- ( 증/감 연상자 )
		//++, -- 는 숫자의 왼쪽 혹은 오른쪽에 붙을 수 있다
		//왼쪽에 붙는 경우 전위수식
		//오른쪽에 붙는 경우 후위수식
		//어느 방향에 붙냐에 따라 실행 순서가 바뀜
		//++는 대상 변수의 숫자를 1증가,--는 대상 변수의 숫자를 1감소
		int a = 1;
		System.out.println(++a);
		//전위수식, 실행 전 1부터 증가 시키고 a출력
		//1. a값 1 증가 ( a = a+1; ) *이경우에만 예외적으로 오른쪽에서 왼쪽 순으로 인식 ( 보통 왼쪽에서 오른쪽 순 )
		//2. 증가된 a값 출력 ( system.out.println( a(2)); )
		System.out.println(a);//a는 증가된 값이 유지
		System.out.println(a++);
		//후위수식, a(2)출력 후 1증가
		//1. a값 출력 ( system.out.println( a(2)); )
		//2. 출력된 a값 증가 ( a(2)+1; )
		System.out.println(a);//a는 증가된 값이 유지
	}

}
