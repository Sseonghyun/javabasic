package constructor;

public class Main1 {

	public static void main(String[] args) {
		Car1 a = new Car1(100, "sedan", "제네시스G80", 8.4, "black");
		System.out.println("-----------------------------------------------");
		Car1 b = new Car1(100, "suv", "볼보XC60", 10.8, "white");
		System.out.println("-----------------------------------------------");
		a.getInfo();
		System.out.println("----------------");
		b.getInfo();
	}

}
