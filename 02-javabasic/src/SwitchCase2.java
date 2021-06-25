
public class SwitchCase2 {

	public static void main(String[] args) {
		// Math.random(); 을 이용해 난수를 하나 발급받을수 있다
		// 난수의 범위는 0초과 1미만
		// 뒤에 숫자를 곱하면 원하는 범위의 정수를 얻을 수 있다.
		double number = Math.random() * 10;
		System.out.println(number);
		
		int intNum = (int)(Math.random() * 10);
		System.out.println(intNum);
		
		// switch ~ case문을 이용하여
		// 식당 이름을 출력하는 프로그램을 만들어보세요. (최소6개)
		int food = (int)(Math.random() * 8);
		int a = food;
		switch(a) {
		case 1:
			System.out.println("보쌈");
			break;
		case 2:
			System.out.println("짜장면&짬뽕");
			break;
		case 3:
			System.out.println("파스타");
			break;
		case 4:
			System.out.println("떡볶이");
			break;
		case 5:
			System.out.println("초밥");
			break;
		case 6:
			System.out.println("돈까스");
			break;
		case 7:
			System.out.println("피자");
			break;
		default :
			System.out.println("햄버거");
			break;
		}
	}

}
