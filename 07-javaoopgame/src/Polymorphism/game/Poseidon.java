package Polymorphism.game;

public class Poseidon {
	private int level;
	private int exp;
	private int hp;
	private int mp;
	private int atk;
	private int skilatk;
	private int df;
	
	public Poseidon() {
		this.level = 1;
		this.exp = 0;
		this.hp = 80;
		this.mp = 10;
		this.atk = 10;
		this.skilatk = 15;
		this.df = 1;
	}
	public void Wave(Monster monster) {
		this.mp -= 2;
	    System.out.println("포세이돈이 파도를 사용합니다");
	if(this.mp <= 0 ) {
		this.mp = 0;
		System.out.println("마나가 부족하여 스킬을 사용할 수 없습니다.");
		return;
	}
	if(monster.getHp() <= 0) {
		System.out.println("이미 죽은" + monster.getName() + " (을/를) 공격할 수 없습니다.");
		return;
	}
	monster.skilBattle(this.skilatk);
	if(monster.getAtk() > (this.hp + this.df)) {
		System.out.println("유저가 사망했습니다.");
		return;
	}
	if(monster.getHp() <= 0) {
		System.out.println("경험치를 획득하였습니다.");
		this.exp += monster.getExp();
		System.out.println(monster.getName() + " (와/과)의 교전 완료!");
		return;
	}
	this.hp = (this.hp + this.df) - monster.getAtk();
	System.out.println(monster.getName() + " (와/과)의 교전 완료!");
	}
	
	public void hunt(Monster monster) {
	if(monster.getHp() <= 0) {
		System.out.println("이미 죽은" + monster.getName() + " (을/를) 공격할 수 없습니다.");
		return;
	}
	monster.Battle(this.atk);
	if(monster.getAtk() > (this.hp + this.df)) {
		System.out.println("유저가 사망했습니다.");
		return;
	}
	
	if(monster.getHp() <= 0) {
		System.out.println("경험치를 획득하였습니다.");
		this.exp += monster.getExp();
		System.out.println(monster.getName() + " (와/과)의 교전 완료!");
		return;
	}
	this.hp = (this.hp + this.df) - monster.getAtk();
	System.out.println(monster.getName() + " (와/과)의 교전 완료!");
	}
	public void showstatus() {
	System.out.println("현재 레벨은 : " + this.level);
	System.out.println("현재 경험치는: " + this.exp);
	System.out.println("현재 체력은 : " + this.hp);
	System.out.println("현재 마나는 : " + this.mp);
	System.out.println("현재 공격력은 : " + this.atk);
	System.out.println("현재 방어력은 : " + this. df);
	System.out.println("------------------------");
	}
}
