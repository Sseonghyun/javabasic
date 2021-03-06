package buyandsell;

public class Main2 {

	public static void main(String[] args) {
		
		Seller s1 = new Seller(10); // 망고상인 2개 만들기 중 1번째
		Seller s2 = new Seller(10); // 망고상인 2개 만들기 중 2번째
		
		Buyer b1 = new Buyer(5000); // 구매자 1개 만들기
		
		s1.showSeller(); // 1번 망고상인 정보 확인
	    s2.showSeller(); // 2번 망고상인 정보 확인
		b1.buyMango(s1, 3); // 1번 망고상인에게 구매자가 망고 구매
		b1.showBuyer(); // 구매자 정보 확인
		s1.showSeller(); // 1번 망고상인 정보 확인
		s2.showSeller(); // 2번 망고상인 정보 확인
		
		Seller2 s3 = new Seller2(10); // 사과상인 1개 만들기
		
		b1.showBuyer(); // 구매자 정보 확인
		s3.showSeller(); // 3번 사과상인 정보 확인
		b1.buyApply(s3, 3); // 3번 사과상인에게 구매자가 사과 구매
		b1.showBuyer(); // 구매자 정보 확인
		s3.showSeller(); // 3번 사과상인 정보 확인

	}

}
