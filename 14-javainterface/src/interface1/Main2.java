package interface1;

public class Main2 {

	public static void main(String[] args) {
		Bike b1 = new Bike("김오토바이");
		Vehicle b2 = new Bike("김오토바이2");
		
		Airplane a1 = new Airplane("김비행기");
		Vehicle a2 = new Airplane("김비행기2");
		
		b1.Accel();
		b1.Accel();
		b1.breakSpeed();
		b1.showStatus();
		
		a1.Accel();
		a1.Accel();
		a1.breakSpeed();
		a1.showStatus();

	}

}
