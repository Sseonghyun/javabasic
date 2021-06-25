package accessmodifier3;

import accessmodifier2.Child;

public class Main1 {

	public static void main(String[] args) {
		// 패키지가 다른 (accessmodifier2의) child를 생성
		// 패키지가 다르면 import까지 해줘야 사용 가능.
		Child child = new Child();
		
		// 1. Public 접근제한자
		System.out.println(child.a);
		// 2. Protected 접근제한자
		// System.out.println(child.b);
		// 3. Private 접근제한자
		// System.out.println(child.c);
		// 4. default 접근제한자
		// System.out.println(child.d);

	}

}
