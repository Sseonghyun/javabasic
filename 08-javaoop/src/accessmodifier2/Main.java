package accessmodifier2;

public class Main {

	public static void main(String[] args) {
		// Parent를 상속받은 Child 내부의 자료 조회
		Child child = new Child();
		// 1. Public 자료
		System.out.println(child.a);
		// 2. Protected 자료
		// 현재 Main.java와 같은 패키지 내부에 Parent, Child
		// 가 존재하므로 Protected는 접근 가능
		// 다른 패키지에 속해있는 경우 상속관계여야 가능.
		System.out.println(child.b);
		// 3. Private 자료
		// System.out.println(child.c);
		
		// 4. default 자료
		// Protected와 다르게 상속관계가 아니여도 같은 패키지 내부에있으면 가능.
		System.out.println(child.d);

	}

}
