package inheritance;

public class Main2 {

	public static void main(String[] args) {
		Salaryman m1 = new Salaryman();
		m1.name = "강호동";
		m1.age = 30;
		m1.salary = 8000;
		
		Student s1 = new Student();
		s1.name = "유재석";
		s1.age = 20;
		s1.major = "경역학";
		
		m1.upSalary();
		m1.getSalaryInfo();
		System.out.println("--------------------");
		s1.getStudentInfo();
	}

}
