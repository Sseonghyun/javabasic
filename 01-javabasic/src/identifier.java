/* 식별자는 클래스명 , 변수명 , 메서드명 등 사용자가 만들어서 이용하는 고유한 이름
 * 식별자 생성 규칙
 * 대,소문자를 구분하고 길이 제한은 없음
 * 문자와 숫자, 밑줄(_), 달러기호($)를 포함할 수 있음
 * 숫자로는 시작할 수 없음
 * 공백을 포함할 수 없음
 * 키워드(예약어)는 식별자로 사용할 수 없음
 */ 
public class identifier {
	public static void main(String[] args) {
		// int는 변수 (정수만담을수있음) / a,A,number는 변수명
		// 변수는 일종의 자료를 담을 수 있는 박스
		// 자료를 담기 전에 어떤 자료가 담길지 미리 약속을 해야함 
		int a = 5; // 정수 숫자 5를 a박스 안에 담겠다
		int A = 10; // 정수 숫자 10을 A박스 안에 담겠다
		int number = 15; // 정수 숫자 15를 number박스 안에 담겠다
		System.out.println(a); // a박스 내부 값 콘솔에 출력
		System.out.println(A); // A박스 내부 값 콘솔에 출력
		System.out.println(number); //number박스 내부 값 콘솔에 출력
		//System.out.println(B); // B는 선언된적이 없어서 출력이 안됨
	}
}