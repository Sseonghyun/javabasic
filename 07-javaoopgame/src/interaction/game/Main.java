package interaction.game;

public class Main {
	public static void main(String[] args) {	
	Fighter f1 = new Fighter(); // 격투가 생성
	Grappler g1 = new Grappler(); // 그래플러 생성
	Boxer b1 = new Boxer(); // 복서 생성
	
	Dragon dragon = new Dragon(); // 몬스터(드래곤) 생성
	Golem golem = new Golem(); // 몬스터(골렘) 생성
	Robot robot = new Robot(); // 몬스터(로봇) 생성
	Kerberos kerberos = new Kerberos(); // 몬스터(케르베로스) 생성
	
	f1.huntRobot(robot);
	f1.huntRobot(robot);
	f1.showAllData();
	f1.huntGolem(golem);
	f1.huntGolem(golem);
	f1.showAllData();
	
	g1.huntDragon(dragon);
	g1.huntDragon(dragon);
	g1.huntDragon(dragon);
	g1.showAllData();
	
	b1.huntKerberos(kerberos);
	b1.huntKerberos(kerberos);
	b1.showAllData();
	}
}
