package exception2;

public class TryCatch2 {

	public static void main(String[] args) {
		// 아까 exception1 패키지 내부의 여러 예외 유형 중
		// 하나를 골라서 예외가 발생할 수 있는 코드를 작성해주세요.
		// 발생할 예외에 대한 처리는 try~catch 블록을 활용합니다.		
		int[] arr = new int[5];
		for(int a : arr) {
			System.out.println(a);
		try {
		System.out.println(arr[5]);
		System.out.println("계산 끝!");
		} catch(Exception e) {
			System.out.println("잘못되었습니다.");
		} finally {
			System.out.println("코드 끝!");
		}

	}
	}
}
