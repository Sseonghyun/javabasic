package accessmodifier.game;

public class Warrior1 extends Commoner1 {
	public void hunt() {
		System.out.println("전사가 사냥을 시작합니다.");
		setHp(getHp()-2); // hp = hp - 2;
		setExp(getExp()+10); // exp = exp + 10;
	}
	public void doubleAttack() {
		System.out.println("전사가 더블어택을 사용합니다.");
		setMp(getMp()-2); // mp = mp - 2;
		setExp(getExp()+15); // exp = exp + 15;
	}
	public void getAllData() {
		System.out.println("현재 레벨 : " + getLevel());
		System.out.println("현재 경험치 : " + getExp());
		System.out.println("현재 체력 : " + getHp());
		System.out.println("현재 마나 : " + getMp());
		System.out.println("--------------");
	}
}

