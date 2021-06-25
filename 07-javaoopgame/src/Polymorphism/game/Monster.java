package Polymorphism.game;

public class Monster {
	private String name;
	private int hp;
	private int atk;
	private int df;
	
	public Monster(String name, int hp, int atk, int df) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.df = df;
	}
	public void Battle(int uAtk) {
		this.hp = (this.hp + this.df) - uAtk;
		if(this.hp <= 0) {
			System.out.println("이 몬스터는 이미 죽었습니다.");
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDf() {
		return df;
	}

	public void setDf(int df) {
		this.df = df;
	}
	
}
