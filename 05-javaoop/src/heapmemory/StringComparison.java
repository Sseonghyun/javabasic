package heapmemory;

public class StringComparison {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1);
		System.out.println(str2);
	    // 자바에서는 문자열의 일부 부분만 변경할 수 없다.
		// str1[1] = "a";
		
		// str1 과 str2의 주소 비교를 위해서는 ==()를 씁니다.
		// str1 과 str2의 문자 비교를 위해서는 .equals()를 씁니다.
		System.out.println(str1 == str2); // 주소비교
		System.out.println(str1.equals(str2)); // 문자비교
		
		System.out.println("------------------------");
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		System.out.println(str3);
		System.out.println(str4);
		// new 키워드 생성시 내용이 같은 문자열도
		// 별개의 공간에 저장됩니다.
		System.out.println(str3 == str4); // 주소비교
		System.out.println(str3.equals(str4)); // 문자비교
	}
}
