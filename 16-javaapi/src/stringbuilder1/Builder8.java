package stringbuilder1;

public class Builder8 {

	public static void main(String[] args) {
		// reverse()는 문자열을 인덱스 순으로 따졌을때
		// 역순으로 나열해줍니다.
		StringBuilder str = new StringBuilder("zyxwvut");
		StringBuilder str2 = new StringBuilder("지아강");
		StringBuilder str3 = new StringBuilder("가라마바나다");
		
		str.reverse();
		str2.reverse();
		str3.reverse();
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
	}

}
