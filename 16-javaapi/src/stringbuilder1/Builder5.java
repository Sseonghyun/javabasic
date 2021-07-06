package stringbuilder1;

public class Builder5 {

	public static void main(String[] args) {
		// 다음 문자열의 문자를 3번째마다 삭제해주세요.
		// 힌트 : 반복문을 사용하세요.
		
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		System.out.println(a);
		
		for(int i=0; i<a.length(); i++){
			if(i % 3 == 0) {
			a.deleteCharAt(i);
		}
	}
		System.out.println(a);
		
	}

}
//a e i m q u y