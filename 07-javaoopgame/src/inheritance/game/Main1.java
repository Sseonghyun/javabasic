package inheritance.game;

public class Main1 {

	public static void main(String[] args) {
		// 초보자계정을 하나 생성하고 확인해주세요
		Commoner c1 = new Commoner();
		c1.id = "초보자";
		c1.level = 1;
		c1.hp = 30;
		c1.mp = 5;
		
		c1.getInfo();

	}

}
