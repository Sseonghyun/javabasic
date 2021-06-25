package buyandsell;

public class Seller2 {
	private int money;
	private int apply;
	
	public Seller2(int apply) {
		this.money = 0;
		this.apply = apply;
	}
	public void sellApply(int apply) {
		if(apply > this.apply) {
			System.out.println("사과가 모자랍니다.");
			return;
		}
		System.out.println("사과를 " + apply + "개 판매합니다.");
			this.money += apply * 500;
			this.apply -= apply;
		}
	public void showSeller() {
		System.out.println("판매자 현재 소지금액 : " + money + "원");
		System.out.println("판매자 현재 사과갯수 : " + apply + "개");
		System.out.println("---------------------");
	}
	public int getApply() {
		return apply;
	}
	}

