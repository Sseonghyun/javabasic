package accessmodifier.game;

public class Fighter1 extends Commoner1 {

	public void hunt() {
		System.out.println("격투가가 사냥을 시작합니다.");
		setHp(getHp()-2);
		setExp(getExp()+10);
	}
	public void hook() {
		System.out.println("격투가가 훅을 사용합니다.");
		setMp(getMp()-2);
		setExp(getExp()+15);
	}
	public void kneeKick() {
		System.out.println("격투가가 니킥을 사용합니다.");
		setMp(getMp()-3);
		setExp(getExp()+20);
	}
	public void getAllData() {
		System.out.println("현재 레벨 : " + getLevel());
		System.out.println("현재 경험치 : " + getExp());
		System.out.println("현재 체력 : " + getHp());
		System.out.println("현재 마나 : " + getMp());
		System.out.println("--------------");
	}
}
