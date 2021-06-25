package superclass;

public class Main2 {

	public static void main(String[] args) {
		SuperSonicAirplane s1 = new SuperSonicAirplane(300);
		
		s1.fly();
		s1.fly();
		s1.fly(); // 최대값이 1300이라 그이상 넘어가지않음.
		s1.breackSpeed();
		s1.breackSpeed();
		s1.breackSpeed();
		s1.breackSpeed();
		s1.breackSpeed();
	}

}
