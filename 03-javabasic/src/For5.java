import java.util.Scanner;

public class For5 { 
// 2~9단까지 구구단을 출력하는 코드를 작성
// 중첩 반복문을 사용해주시면 됩니다.
	public static void main(String[] args) { //메인 여는부분
		
			for(int a=2; a<10; a++) { // for a 여는부분
				for(int b=1; b<10; b++) { // for b 여는부분
						System.out.println(a+"*"+b+"="+a * b);
			} // for b 닫는부분
		} // for a 여는부분
	}//메인 닫는부분
} 

