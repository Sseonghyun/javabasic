package superclass;

public class Main1 {

	public static void main(String[] args) {
		Airplane a1 = new Airplane(300);
		
		a1.fly();
		a1.fly(); // 최고가 900이기 때문에 넘지않음
		a1.breackSpeed();
		a1.breackSpeed();
		a1.breackSpeed();
		a1.breackSpeed();
		a1.breackSpeed();
		a1.breackSpeed();
		a1.breackSpeed();
		a1.breackSpeed();
		a1.breackSpeed();
		a1.breackSpeed(); // 최저가 0이기 때문에 -로 넘어가지않음

	}

}
