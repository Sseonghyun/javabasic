package constructor;

public class Main2 {

	public static void main(String[] args) {
		BasketballPlayer player1 = new BasketballPlayer("강호동", 190, 100);
		BasketballPlayer player2 = new BasketballPlayer("유재석", 200, 110);
		
		player1.getInfo();
		player1.dunkShot();
		player2.getInfo();
		player2.dunkShot();
	}

}
