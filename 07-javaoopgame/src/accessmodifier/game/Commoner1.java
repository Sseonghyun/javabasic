package accessmodifier.game;

public class Commoner1 {
	
	private int level;
	private int exp;
	private int hp;
	private int mp;
	
	public Commoner1() {
		this.level = 1;
		this.exp = 0;
		this.hp = 20;
		this.mp = 10;
	}
	// 마우스 우클릭 -> source -> Getter , Setter
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	
}
