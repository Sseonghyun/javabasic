package Polymorphism.game;

public class Hydra extends Monster {
	
	public Hydra() {
	    super("히드라",30,5,3,15);
	}
	public void skilBattle(int uAtk) {
		setHp(getHp() + getDf() - uAtk);
		if(getHp() <= 0) {
		System.out.println("히드라가 죽었습니다.");
		}
	}
	public void Battle(int uAtk) {
		setHp(getHp() + getDf() - uAtk);
		if(getHp() <= 0) {
		System.out.println("히드라가 죽었습니다.");
	}
}
}