package interaction.game;

public class Robot {
	private int hp;
	private int atk;
	private int df;

	public Robot() {
		this.hp = 5;
		this.atk = 3;
		this.df = 1;
	}
	// 유저가 공격했을때 내부에서 호출된 Battle은
	// 유저공격력 uAtk를 받아서 자신의 체력을 그만큼 차감합니다.
	// 단, 방어력 수치까지 고려해서 체력이 차감되며
	// 자신의 체력이 0이 되는 즉시 죽었다는 메세지를 같이 남깁니다.
	public void Battle(int uAtk) {
		this.hp = (this.hp + this.df) - uAtk;
		if(this.hp <= 0) {
			System.out.println("이 로봇은 이미 죽었습니다.");
		}
	}
	public int getAtk() {
		return this.atk;
	}
	public int getHp() {
		return this.hp;
	}
}
