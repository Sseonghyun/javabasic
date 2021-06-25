import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// 코드 실행 중 사용자의 입력을 받는 경우 스캐너 기능을 사용
		// Scanner 부분에 마우스를 갖다대고 import를 한다
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		// 정수를 입력받음
	    System.out.println(a);
		// 입력받은 정수를 출력
	    scan.close();
	    // 메모리 절약을 위해 다 쓴 scan 변수는 닫음
	}
}
