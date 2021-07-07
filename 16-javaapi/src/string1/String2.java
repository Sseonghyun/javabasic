package string1;

public class String2 {

	public static void main(String[] args) {
		// String 클래스의 주요 메서드 확인 2. indexOf();
		// indexOf()는 특정 문자열의 시작 인덱스 값을 반환합니다.
		// 만약 특정 문자열이 포함되어 있지 않다면 -1을 리턴합니다.
		String tomato = "tomato";
		int get = tomato.indexOf("to"); // to를 찾아라 라고 명령.
		System.out.println(get); // 0번에 있음

		// 중복문자 처리
		get = tomato.indexOf("to", 1); // to를 1번부터 찾아라 라고 명령.
		System.out.println(get); // 4번에 있음
		
		// 없는 문자열 처리
		get = tomato.indexOf("banana"); // banana를 찾아라 라고 명령.
		System.out.println(get); // banana라는 문자열이 없어 -1을 리턴.
	}

}
