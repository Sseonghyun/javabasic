
public class ParseInt {

	public static void main(String[] args) {
		// 정수자료는 굳이 문자로 바꾸지 않아도
		// sysout.out.println()구문 내에서 + 문자와 연결시
		// 자동으로 문자로 변경됨
		// 그러나 문자 전체가 정수로만 이루어진 문자열을
		// 정수로 치환하기 위해서는 별도의 문법을 사용
		String str = "2021";// (문자열상태 이공이일)
		//문자는 들어갈수없음 숫자상태의 문자열만 정수로 교환가능! ex: 2021a
		int year = Integer.parseInt(str);
		//Integer.parseInt(문자열) 을 입력시 정수로 교환해 줌
		System.out.println(year + 1);// ( 문자열을 정수로 바꾼 상태(2021) + 1 )
		System.out.println(str + 1);// ( 문자열(이공이일) + 1 )

	}

}
