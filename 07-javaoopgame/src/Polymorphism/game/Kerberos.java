package Polymorphism.game;

public class Kerberos extends Monster {
	public Kerberos() {
		super("케르베로스",15,3,1);
	}
	public void Battle(int uAtk) {
	super.Battle(getAtk());
	System.out.println("이 케르베로스는 이미 죽었습니다.");
	}
}
