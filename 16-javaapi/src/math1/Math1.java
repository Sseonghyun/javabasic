package math1;

public class Math1 {

	public static void main(String[] args) {
		// Math는 자바에서 이미 기본으로 제공하는 기능이라
		// import없이 사용가능합니다.
		int a = -1024;
		System.out.println(Math.abs(a));
		int b = 1024;
		System.out.println(Math.abs(b));
		// abs() : 정수 , 음수 관계없이 절대값을 구함.
		double c = 3.14;
		System.out.println(Math.ceil(c));
		// ceil() : 올림값을 구함.
		double d = 19.9;
		System.out.println(Math.floor(d));
		// floor() : 내림값을 구함.

	}

}
