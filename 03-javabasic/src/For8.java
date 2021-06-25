
public class For8 {

	public static void main(String[] args) { //메인 여는 부분
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요
		//   *
		//  **
		// ***
		//****
		for(int a = 1; a<=4; a++) { // for a 여는 부분
			
		
			for(int b = 0; b<=3-a; b++) { // for b 여는 부분
			System.out.print(" ");
			} // for b 닫는 부분
			
			for(int c = 0; c<a; c++) { // for c 여는 부분
		    System.out.print("*");
			} // for c 닫는 부분
			
			System.out.println();
	} // for a 여는 부분

} // 메인 닫는 부분
}