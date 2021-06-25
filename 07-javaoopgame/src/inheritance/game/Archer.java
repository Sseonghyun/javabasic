package inheritance.game;

public class Archer extends Commoner {
	public int rd;
	
	public void getInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("레벨 : " + level);
		System.out.println("체력 : " + hp);
		System.out.println("마나 : " + mp);
		System.out.println("원거리데미지 : " + rd);
	}
}
