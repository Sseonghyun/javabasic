package polymorphism;

public class Salaryman extends Person{
	private int salary;
	
	public Salaryman(String name , int age , int salary) {
		super(name, age);
		this.salary = salary;
	}
	public void showSalaryman() {
		super.showPerson();
		System.out.println("연봉 : " + salary + "만원");
		System.out.println("---------------");
	}
	// 부모쪽의 showPerson()을 오버라이딩해서 자식쪽에 재정의
	// 재정의된 메서드는 부모 타입으로도 자식쪽에서 호출이 가능하다.
	public void showPerson() {
		super.showPerson();
		System.out.println("연봉 : " + salary + "만원");
		System.out.println("---------------");
	}
}
