package Polymorphism.game;

public class Dragon extends Monster{
	
	private int hp;
	private int df;
	private int atk;
	private int exp;
	
	public Dragon() {
		super("드래곤",35,5,5,30);
	}
	public void skilBattle(int uAtk) {
		setHp(getHp() + getDf() - uAtk);
		if(getHp() <= 0) {
		System.out.println("드래곤이 죽었습니다.");
		}
	}
	public void Battle(int uAtk) {
	setHp(getHp() + getDf() - uAtk);
	if(getHp() <= 0) {
	System.out.println("드래곤이 죽었습니다.");
	}
	
	}

}