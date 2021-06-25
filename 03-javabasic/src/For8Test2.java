import java.util.Scanner;

public class For8Test2 {

	public static void main(String[] args) {
		//*소수 = 1과 자기 자신으로만 나눌 수 있는 숫자
		//ex: 1, 2, 3, 5, 7, 9 가능 / 4는 1 2 4 , 6은 1 2 3 6 이므로 불가능
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 까지의 숫자중 소수만 탐색하시겠습니까?");
		int finalNum = scan.nextInt();
		boolean isOk;
		for(int i=4; i<finalNum; i++) {
			isOk = false;
			for(int j=2; j<i; j++) {
				if(i % j == 0) {
					isOk = true;
				}
				if((i-1 == j) && !isOk) {
					System.out.println(i + "은 소수입니다.");
				}
			}
		}
	}

}
