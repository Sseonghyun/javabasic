package buyandsell;

public class Buyer {
    // 구매자
	// 구매자는 돈, 망고 갯수를 멤버변수로 가집니다.
	// 은닉 구현을 위해 private으로 처리합니다.
	private int money;
	private int mango;
	private int apply;
	// 생성자는 (int money)를 받아 돈을 초기화합니다.
	// 망고는 자동으로 0을 대입합니다.
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
		this.apply = 0;
	}
	// buyMango는 망고를 삽니다.
	// (int mango)망고 갯수를 입력받으면, 망고 * 1000만큼의
	// 돈을 차감하고 망고 변수에 그만큼 갯수를 늘려줍니다.
	// 현실에서 망고를 구매할 때 구매자가 가게를 고르지
	// 가게에서 구매자를 선택하지 않으므로, Seller 변수를
	// Buyer가 고를수 있도록 파라미터를 설정합니다.
	public void buyMango(Seller seller , int mango) {
		// 조건식 : 구매하려는 망고 가격보다 구매자의 돈이 적은 경우
		if(mango * 1000 > money) {
			System.out.println("돈이 모자라 구매할 수 없습니다.");
			return;
		}
		// 조건식 : 구매하려는 망고 개수보다 판매자의 망고개수가 적은경우
		if(seller.getMango() < mango) {
			System.out.println("망고가 모자랍니다.");
			return;
		}
		// 셀러쪽에서 망고를 파는 코드를 내가 망고를 사는 코드에 넣어서
		// 동시에 사고 팔도록 처리해야 상호작용이 이뤄집니다.
		seller.sellMango(mango);
		System.out.println("망고를 " + mango + "개 구매합니다.");
		this.mango += mango;
		this.money = money - (mango * 1000);
	}
	public void buyApply(Seller2 seller, int apply) {
		if(apply * 500 > money) {
			System.out.println("돈이 모자라 구매할 수 없습니다.");
			return;
		}
		if(seller.getApply() < apply) {
			System.out.println("사과가 모자랍니다.");
			return;
		}
		seller.sellApply(apply);
		System.out.println("사과를 " + apply + "개 구매합니다.");
		this.apply += apply;
		this.money = money - (apply * 500);
	}
	// showBuyer는 구매자의 상태를 보여줍니다.
	// money, mango 수치가 각각 몇인지 콘솔에 찍어줍니다.
	public void showBuyer() {
		System.out.println("구매자 현재 소지금액 : " + money + "원");
		System.out.println("구매자 현재 망고갯수 : " + mango + "개");
		System.out.println("구매자 현재 사과갯수 : " + apply + "개");
		System.out.println("---------------------");
	}
}
