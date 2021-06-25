import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		// Hello Java를 입력한 횟수만큼 출력하는 구문을 작성해보세요
		// 입력은 Scanner로 받습니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("반복 횟수를 입력해주세요.");
		int loop = scan.nextInt();
		for(int i = 0; i <= loop; i++ ) {
			System.out.println("Hello Java!" + i);
		}
		//시작이 0인데 1부터 시작하고 싶다면
		// 1. 실행문 뒤에 +1을 붙여준다
		// 2. 초기식을 1로 바꿔준다.
		scan.close();
	}

}
