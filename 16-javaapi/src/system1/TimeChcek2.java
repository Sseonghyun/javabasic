package system1;

public class TimeChcek2 {

	public static void main(String[] args) {
		// tryCatch구문의 소요시간을 구해주세요.
		// 여러분들이 직접 원하는 종류의 예외를 발생시켜주세요.
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		try {
			throw new ArithmeticException();
		} catch(Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println(start);
		
		System.out.println(end - start);
			
	}

}
