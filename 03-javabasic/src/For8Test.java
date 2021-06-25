
public class For8Test {

	public static void main(String[] args) {
		// for문 두 개 만으로 구성한 오른쪽 피라미드
		for(int a=4; a>0; a--) {// for a 여는부분
			
			for(int b=0; b<4; b++) {// for b 여는부분
				
				if(a > b+1) {// if 여는부분
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}// for b 닫는부분
			System.out.println();
		}// for b 닫는부분
	}

}
