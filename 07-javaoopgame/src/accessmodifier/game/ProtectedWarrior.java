package accessmodifier.game;

public class ProtectedWarrior extends ProtectedCommoner {
	public void hunt() {
		System.out.println("전사가 사냥을 시작합니다.");
		hp = hp - 2;
		exp = exp + 10;
	}
	public void doubleAttack() {
		System.out.println("전사가 더블어택을 사용합니다.");
		mp = mp - 2;
		exp = exp + 15;
	}
	public void getAllData() {
		System.out.println("현재 레벨 : " + level);
		System.out.println("현재 경험치 : " + exp);
		System.out.println("현재 체력 : " + hp);
		System.out.println("현재 마나 : " + mp);
		System.out.println("--------------");
	}
}
