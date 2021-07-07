package random1;

import java.util.Random;
import java.util.Scanner;

public class Random2 {

	public static void main(String[] args) {
		// Random객체를 생성한 다음 nextBoolean() 기능을 이용해서
		// 동전던지기 카운팅 프로그램을 만들어주세요.
		// n회 던졌을때 true=앞면, false=뒷면 으로 간주해서
		// 프로그램이 다 끝났을때 앞면 몇 회, 뒷면 몇 회 인지
		// 콘솔에 출력해주세요.
		// 실행 횟수 n회는 스캐너로 입력받습니다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("동전 던질 횟수를 알려주세요.");
		int coin = scan.nextInt();
		
		Random r = new Random();
		int front = 0;
		int back = 0;
		
		for(int i=0; i<coin; i++) {
		  if(r.nextBoolean()) {
			 front++;			
		    } else {
			 back++;
	    	}
    	}

		System.out.println(coin + "바퀴 돌린 결과값");
		System.out.println("앞면 :" + front);
		System.out.println("뒷면 :" + back);
}
}