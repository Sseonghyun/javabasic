package inheritance.game;

public class Main3 {

	public static void main(String[] args) {
		Magician m1 = new Magician();
		m1.id = "마법사";
		m1.level = 8;
		m1.hp = 50;
		m1.mp = 100;
		m1.ap = 30;
		
		Archer a1 = new Archer();
		a1.id = "궁수";
		a1.level = 10;
		a1.hp = 80;
		a1.mp = 70;
		a1.rd = 30;
		
		m1.getInfo();
		System.out.println("-------------------");
		a1.getInfo();

	}

}
