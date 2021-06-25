package interaction.game;

public class Grappler {
	private int level;
	private int exp;
	private int hp;
	private int mp;
	private int atk;
	private int df;
	
	public Grappler() {
		this.level = 1;
		this.exp = 0;
		this.hp = 35;
		this.mp = 10;
		this.atk = 5;
		this.df = 1;
	}
	// 특정 몬스터인 드래곤을 공격하는 공격 메서드
		public void huntDragon(Dragon dragon) {
			// 공격 전에 먼저 드래곤의 체력을 체크하여 죽은 드래곤이라면
			// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
			if(dragon.getHp() <= 0) {
				System.out.println("이미 죽은 드래곤을 공격할 수 없습니다.");
				return;
			}
	// 드래곤과 전투를 할 때는 자신의 공격력을 넘깁니다.
	dragon.Battle(this.atk);
	// 드래곤쪽 처리가 되고 나서 유저가 공격을 받았을 때
	// 유저가 죽는 상황이라면 역시 전투 메서드 종료
	if(dragon.getAtk() > (this.hp + this.df)) {
		System.out.println("유저가 사망했습니다.");
		return;
	}
	// 만약 전투 도중 드래곤이 죽었다면 경험치 30을 획득
	if(dragon.getHp() <= 0) {
		System.out.println("경험치를 30 획득하였습니다.");
		this.exp += 30;
	}
	// 모든 전투상황이 끝난뒤에는 본인의 체력을 깎습니다.
	this.hp = (this.hp + this.df) - dragon.getAtk();
	System.out.println("드래곤과의 교전 완료!");
	}
	// 특정 몬스터인 골렘을 공격하는 공격 메서드
	public void huntGolem(Golem golem) {
	// 공격 전에 먼저 골렘의 체력을 체크하여 죽은 골렘이라면
	// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
	if(golem.getHp() <= 0) {
		System.out.println("이미 죽은 골렘을 공격할 수 없습니다.");
		return;
	}
	// 골렘과 전투를 할 때는 자신의 공격력을 넘깁니다.
	golem.Battle(this.atk);
	// 골렘쪽 처리가 되고 나서 유저가 공격을 받았을 때
	// 유저가 죽는 상황이라면 역시 전투 메서드 종료
	if(golem.getAtk() > (this.hp + this.df)) {
		System.out.println("유저가 사망했습니다.");
		return;
	}
	// 만약 전투 도중 골렘이 죽었다면 경험치 20을 획득
	if(golem.getHp() <= 0) {
		System.out.println("경험치를 20 획득하였습니다.");
		this.exp += 20;
	}
	// 모든 전투상황이 끝난뒤에는 본인의 체력을 깎습니다.
	this.hp = (this.hp + this.df) - golem.getAtk();
	System.out.println("골렘과의 교전 완료!");
	}
	// 특정 몬스터인 로봇을 공격하는 공격 메서드
	public void huntRobot(Robot robot) {
	// 공격 전에 먼저 로봇의 체력을 체크하여 죽은 로봇이라면
	// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
	if(robot.getHp() <= 0) {
		System.out.println("이미 죽은 로봇을 공격할 수 없습니다.");
		return;
	}
	// 로봇과 전투를 할 때는 자신의 공격력을 넘깁니다.
	robot.Battle(this.atk);
	// 로봇쪽 처리가 되고 나서 유저가 공격을 받았을 때
	// 유저가 죽는 상황이라면 역시 전투 메서드 종료
	if(robot.getAtk() > (this.hp + this.df)) {
		System.out.println("유저가 사망했습니다.");
		return;
	}
	// 만약 전투 도중 로봇이 죽었다면 경험치 10을 획득
	if(robot.getHp() <= 0) {
		System.out.println("경험치를 10 획득하였습니다.");
		this.exp += 10;
	}
	// 모든 전투상황이 끝난뒤에는 본인의 체력을 깎습니다.
	this.hp = (this.hp + this.df) - robot.getAtk();
	System.out.println("로봇과의 교전 완료!");
	}
	// 특정 몬스터인 케르베로스를 공격하는 공격 메서드
	public void huntKerberos(Kerberos kerberos) {
	// 공격 전에 먼저 케르베로스의 체력을 체크하여 죽은 케르베로스라면
	// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
	if(kerberos.getHp() <= 0) {
		System.out.println("이미 죽은 케르베로스를 공격할 수 없습니다.");
		return;
	}
	// 케르베로스와 전투를 할 때는 자신의 공격력을 넘깁니다.
	kerberos.Battle(this.atk);
	// 케르베로스쪽 처리가 되고 나서 유저가 공격을 받았을 때
	// 유저가 죽는 상황이라면 역시 전투 메서드 종료
	if(kerberos.getAtk() > (this.hp + this.df)) {
		System.out.println("유저가 사망했습니다.");
		return;
	}
	// 만약 전투 도중 케르베로스가 죽었다면 경험치 15을 획득
	if(kerberos.getHp() <= 0) {
		System.out.println("경험치를 15 획득하였습니다.");
		this.exp += 15;
		System.out.println("케르베로스와의 교전 완료!");
		return;
	}
	// 모든 전투상황이 끝난뒤에는 본인의 체력을 깎습니다.
	this.hp = (this.hp + this.df) - kerberos.getAtk();
	System.out.println("케르베로스와의 교전 완료!");
	}
	public void showAllData() {
		System.out.println("그래플러의 현재 레벨은 : " + level);
		System.out.println("그래플러의 현재 경험치는: " + exp);
		System.out.println("그래플러의 현재 체력은 : " + hp);
		System.out.println("그래플러의 현재 마나는 : " + mp);
		System.out.println("그래플러의 현재 공격력은 : " + atk);
		System.out.println("그래플러의 현재 방어력은 : " + df);
		System.out.println("------------------------");
	}
}
