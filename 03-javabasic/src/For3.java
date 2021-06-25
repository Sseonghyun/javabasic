import java.util.Scanner;

public class For3 {
	public static void main(String[] args) {
		// 구구단 출력기를 만들어보겠습니다.
		// 1~9중 하나의 숫자를 입력받습니다.
		// 만약 1~9범위를 벗어난 숫자가 입력된다면
		// 범위 내의 수를 입력해주세요 라는 문구를 적고 종료합니다.
		// 맞는 숫자가 들어온다면 결과예시처럼 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("1~9 사이의 숫자를 입력하세요.");
		int code = scan.nextInt();
		
		if (code > 0 && code < 10) {
		for(int a = 1; a < 10; a++ ) {
			System.out.println(code+"*"+a+"="+code*a);
		}
		}else {
			System.out.println("범위내의 수를 입력해주세요.");
		}
		scan.close();
		}
		
		}
		
 	

