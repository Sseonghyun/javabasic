package accessmodifier.game;

public class Main1 {

	public static void main(String[] args) {
		Warrior1 w1 = new Warrior1();
		w1.getAllData();
		w1.doubleAttack();
		w1.getAllData();
		w1.hunt();
		w1.getAllData();

		Fighter1 f1 = new Fighter1();
		f1.getAllData();
		f1.hook();
		f1.getAllData();
		f1.kneeKick();
		f1.getAllData();
		f1.hunt();
		f1.getAllData();
		
		Grappler1 g1 = new Grappler1();
		g1.getAllData();
		g1.armBar();
		g1.getAllData();
		g1.Suplex();
		g1.getAllData();
		g1.hunt();
		g1.getAllData();
	}

}
