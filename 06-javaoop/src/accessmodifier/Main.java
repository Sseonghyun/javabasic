package accessmodifier;

public class Main {

	public static void main(String[] args) {
		// 전사를 하나 만들고 사냥을 3번 하세요.
		// 사냥 3번 후에 전체 상태를 sysout을 이용해 출력해주세요.
		Warrior w1 = new Warrior("일번전사");
		Warrior w2 = new Warrior("이번전사");
//		w1.hp = 1000000;
		w1.hunt();
		w1.hunt();
		w1.hunt();
		System.out.println("------------------------");
//		System.out.println("현재 체력 : " + w1.hp + "입니다.");
//		System.out.println("현재 공격력 : " + w1.atk + "입니다.");
//		System.out.println("현재 레벨 : " + w1.level + "입니다.");
//		System.out.println("현재 경험치 : " + w1.exp + "입니다.");
//		System.out.println("아이디 : " + w1.id + "입니다.");
		w2.hunt();
		w2.hunt();

	}

}
