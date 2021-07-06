package system1;

public class TimeCheck0 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		long all = 0;
		
		for(int i = 0; i < 1000000000; i++) {
			all += i;
		}
		long end = System.currentTimeMillis();
		
		System.out.println("소요시간 :" + (end - start) + "밀리초 소요");
	}

}
