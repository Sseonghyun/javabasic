package accessmodifier.game;

public class ProtectedMain {

	public static void main(String[] args) {
		ProtectedWarrior w1 = new ProtectedWarrior();
		w1.getAllData();
		w1.doubleAttack();
		w1.getAllData();
		w1.hunt();
		w1.getAllData();

		ProtectedMagician m1 = new ProtectedMagician();
		m1.getAllData();
		m1.fireBall();
		m1.getAllData();
		m1.hunt();
		m1.getAllData();
		
		ProtectedArcher a1 = new ProtectedArcher();
		a1.getAllData();
		a1.doubleShot();
		a1.getAllData();
		a1.hunt();
		a1.getAllData();
		
		ProtectedBoxer b1 = new ProtectedBoxer();
		b1.getAllData();
		b1.hook();
		b1.getAllData();
		b1.hunt();
		b1.getAllData();
	}

}
