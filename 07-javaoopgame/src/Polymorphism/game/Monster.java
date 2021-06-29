package Polymorphism.game;

public abstract class Monster {
	private String name;
	private int hp;
	private int atk;
	private int df;
	private int exp;
	
	public Monster(String name, int hp, int atk, int df , int exp) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.df = df;
		this.exp = exp;
	}
	public abstract void skilBattle(int uAtk);
	
	public abstract void Battle(int uAtk);
	
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

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.df = exp;
	}
	public int getDf() {
		return df;
	}

	public void setDf(int df) {
		this.df = df;
	}
	
}
