import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //스캐너 생성
		
		String name = scan.nextLine();
		// 문자열을 입력받는 경우
		double height = scan.nextDouble();
		// 실수를 입력받는 경우
		System.out.println(name + height);
		// +안에 문자열이 들어가면 전체적으로 문자열으로 변경됨
		// ex:가나다 + 100(해석:백) = 가나다100(해석:일공공)
		scan.close();
	}
}
