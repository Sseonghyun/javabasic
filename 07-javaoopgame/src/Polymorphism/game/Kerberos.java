package Polymorphism.game;

public class Kerberos extends Monster {
	private int hp;
	private int df;
	private int atk;
	private int exp;
	
	public Kerberos() {
		super("케르베로스",30,3,5,20);
	}
	public void skilBattle(int uAtk) {
		setHp(getHp() + getDf() - uAtk);
		if(getHp() <= 0) {
		System.out.println("케르베로스가 죽었습니다.");
		}
	}
	public void Battle(int uAtk) {
		setHp(getHp() + getDf() - uAtk);
		if(getHp() <= 0) {
		System.out.println("케르베로스가 죽었습니다.");
	}
	}
}