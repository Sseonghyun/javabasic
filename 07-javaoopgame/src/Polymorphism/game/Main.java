package Polymorphism.game;

public class Main {

	public static void main(String[] args) {
		Zeus z1 = new Zeus();
		Poseidon p1 = new Poseidon();
		Monster d1 = new Dragon();
		Monster k1 = new Kerberos();
		Monster h1 = new Hydra();
		Monster m1 = new Medusa();
		
		z1.hunt(d1);
		z1.hunt(d1);
		z1.hunt(d1);
		z1.hunt(d1);
		z1.hunt(d1);
		z1.hunt(d1);
		z1.hunt(d1);
		z1.hunt(d1);
		z1.showstatus();
		
		z1.lightning(k1);
		z1.showstatus();
		z1.lightning(k1);
		z1.showstatus();
		z1.lightning(k1);
		z1.showstatus();
		z1.lightning(k1);
		z1.showstatus();
		
		
		p1.Wave(m1);
		p1.showstatus();
		p1.Wave(m1);
		p1.showstatus();
		p1.Wave(m1);
		p1.showstatus();
		p1.hunt(m1);
		p1.showstatus();
		
	}

}
