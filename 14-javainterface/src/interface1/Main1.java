package interface1;

public class Main1 {

	public static void main(String[] args) {
		// 자동차 생성 및 사용
		// 생성시 Car타입 하나 , Vehicle 타입 하나
		// 이렇게 두 종을 만들어보세요.
		Car c1 = new Car("박형석"); // Car타입
		Vehicle c2 = new Car("성요한"); // Vehicle타입
		
		c1.Accel();
		c1.Accel();
		c1.breakSpeed();
		c1.showStatus();
		
		c2.Accel();
		c2.Accel();
		c2.breakSpeed();
		c2.showStatus();
		
	}

}
