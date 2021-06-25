package Polymorphism.game;

public class Hydra extends Monster {
	public Hydra() {
	    super("히드라",10,1,1);
	}
	public void Battle(int uAtk) {
	super.Battle(getAtk());
	System.out.println("이 히드라는 이미 죽었습니다.");
	}
}
