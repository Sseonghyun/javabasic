package Polymorphism.game;

public class Zeus {
	public class Fighter {
		private int level;
		private int exp;
		private int hp;
		private int mp;
		private int atk;
		private int df;
		
		public Fighter() {
			this.level = 1;
			this.exp = 0;
			this.hp = 35;
			this.mp = 10;
			this.atk = 5;
			this.df = 1;
		}
		public void huntMonster(Monster monster) {
		if(monster.getHp() <= 0) {
			System.out.println("이미 죽은" + monster + " 을 공격할 수 없습니다.");
			return;
		}
		monster.Battle(this.atk);
		if(monster.getAtk() > (this.hp + this.df)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		if(monster.getHp() <= 0) {
			System.out.println("경험치를 30 획득하였습니다.");
			this.exp += 30;
		}
		this.hp = (this.hp + this.df) - monster.getAtk();
		System.out.println(monster + "과의 교전 완료!");
		}
		public void showAllData() {
		System.out.println("현재 레벨은 : " + this.level);
		System.out.println("현재 경험치는: " + this.exp);
		System.out.println("현재 체력은 : " + this.hp);
		System.out.println("현재 마나는 : " + this.mp);
		System.out.println("현재 공격력은 : " + this.atk);
		System.out.println("현재 방어력은 : " + this. df);
		System.out.println("------------------------");
		}
}
}
