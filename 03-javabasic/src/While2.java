import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// 스캐너를 이용해서 String num 변수에
		// "문자열 형태인 숫자"를 입력받게 해주세요
		// 이 문자자료 num을 int loop 변수에 정수로 변환해 저장해주세요
		// loop 변수에 입력된 정수 횟수만큼
		// "반복문을 실행합니다.(횟수)"라는 문장이 콘솔에 출력되도록 While문을 작성해주세요
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		String num = scan.nextLine();//next이후 Line은 문자열 / Int는 정수 / double는 실수
		int loop = Integer.parseInt(num);// (num :사용자가 입력한 변수)
		
		int count = 0;// count : 사용자 입력을 받아줄 변수/현재바퀴수(진행)
		while (loop > count) { //loop:목표바퀴수
			count += 1;
			System.out.println("반복문을 실행합니다." + count);
		}
		
	}

}
