package Polymorphism.game;

public class Medusa extends Monster {
	
	public Medusa() {
	    super("메두사",30,3,3,10);
	}
	public void skilBattle(int uAtk) {
		setHp(getHp() + getDf() - uAtk);
		if(getHp() <= 0) {
		System.out.println("메두사가 죽었습니다.");
		}
	}
	public void Battle(int uAtk) {
		setHp(getHp() + getDf() - uAtk);
		if(getHp() <= 0) {
		System.out.println("메두사가 죽었습니다.");
	}
}
}
