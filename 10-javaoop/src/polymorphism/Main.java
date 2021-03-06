package polymorphism;

public class Main {

	public static void main(String[] args) {
		// 부모타입인 Person만으로도 양쪽 자료형을 모두 처리 가능.
		Person a1 = new Salaryman("김직장",30,5000);
		Person a2 = new Student("김학생",17,1);
		Person a3 = new Teacher("김선생",25,"국어");
	
		// 단 메서드는 Person을 베이스 객체는
		// Person에 정의된 메서드만 호출가능
		a1.showPerson();
		// a1.showSalaryman();
		a2.showPerson();
		// a2.showStudent();
		a3.showPerson();
		// a3.showTeacher();
	}

}
