package constructor;

public class Car1 {
	public int gas;
	public String type;
	public String name;
	public double mpg;
	public String color;
	
	public Car1(int g , String t , String n , double m , String c) {
		gas = g;
		type = t;
		name = n;
		mpg = m;
		color = c;
		System.out.println("자동차 생성 완료!");
		System.out.println("연료 : " + gas +
				           ", 종류 : " + type +
				           ", 이름 : " + name +
				           ", 연비 : " + mpg +
				           ", 색상 : " + color);
	}
	public void getInfo() {
		System.out.println("연료량 : " + gas);
		System.out.println("종류 : " + type);
		System.out.println("이름 : " + name);
		System.out.println("연비 : " + mpg);
		System.out.println("색상 : " + color);
	}
	}
