
public class Q1 {

	public static void main(String[] args) {
		int a = 15;
		// a에 15를 넣겠다. ( 선언 및 초기화 )
		System.out.println(a--);
		//후위수식, a(15)출력 후 1감소
		//1. a값 출력 ( system.out.println( a(15)); )
		//2. 출력된 a값 감소 ( a(15)-1; )
		System.out.println(a);
		// 감소된 a(14)값 출력 후 유지
		System.out.println(--a);
		//전위수식, 실행 전 1부터 감소 시키고 a출력
		//1. a값 1 감소 ( a = a(14)-1; ) 
		//2. 감소된 a값 출력 ( system.out.println( a(13)); ) 
		System.out.println(a);
		// 감소된 a값(13) 유지
	}
}
