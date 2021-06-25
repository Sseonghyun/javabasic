import java.util.Scanner;

public class For6 {

	public static void main(String[] args) { //메인 여는부분
		// Scanner로 정수를 입력하게 해 주세요.
		// 입력받은 정수의 제곱 형태의 정사각형이 찍히도록
		// 중첩반복문을 작성해주세요.
		// ex)3 입력시
		// ***
		// ***
		// *** 과 같이 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("한 변의 너비를 입력해주세요");
		int num = scan.nextInt();
		
		for(int a = 0; a<num; a++) {  //a for 여는부분
			for(int b = 0; b<num; b++) { //b for 여는부분
			System.out.print("*");
			} //b for 닫는부분
			System.out.println();
		    } //a for 닫는부분 
		scan.close();
} // 메인 닫는부분
}
