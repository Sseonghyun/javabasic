package buyandsell;

public class Main {

	public static void main(String[] args) {
		Buyer b1 = new Buyer(10000);
		Seller s1 = new Seller(10);
		b1.showBuyer();
		s1.showSeller();
		b1.buyMango(s1,5);
		b1.showBuyer();
		s1.showSeller();
		b1.buyMango(s1,10);
		b1.showBuyer();
		s1.showSeller();
	}

}
