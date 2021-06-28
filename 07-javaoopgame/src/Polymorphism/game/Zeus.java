package Polymorphism.game;

	public class Zeus {
		private int level;
		private int exp;
		private int hp;
		private int mp;
		private int atk;
		private int skilatk;
		private int df;
		
		public Zeus() {
			this.level = 1;
			this.exp = 0;
			this.hp = 100;
			this.mp = 10;
			this.atk = 15;
			this.skilatk = 20;
			this.df = 1;
		}
		public void lightning(Monster monster) {
			this.mp -= 2;
			System.out.println("제우스가 번개를 사용합니다");
			if(this.mp <= 0 ) {
			this.mp = 0;
				System.out.println("마나가 부족하여 스킬을 사용할 수 없습니다.");
				return;
			}
			if(monster.getHp() <= 0 ) {
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
		// 몬스터 모든 종류를 공격하는 메서드
		public void hunt(Monster monster) {
			// 공격 전에 먼저 몬스터의 체력을 체크해서 죽은 몬스터라면
			// 따로 공격을 할 수 없도록 메서드를 바로 탈출 시킵니다.
		if(monster.getHp() <= 0) {
			System.out.println("이미 죽은" + monster.getName() + " (을/를) 공격할 수 없습니다.");
			return;
		}
		// 몬스터와 전투를 할 때는 자신의 공격력을 넘깁니다.
		monster.Battle(this.atk);
		// 몬스터 처리가 되고 나서 유저가 공격을 받았을 때
		// 유저가 죽는 상황이라면 역시 전투 메서드 종료
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

