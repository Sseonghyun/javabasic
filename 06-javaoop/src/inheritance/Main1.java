package inheritance;

public class Main1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
	    s1.age = 20;
	    s1.major = "컴퓨터공학";
	    
	    s1.getpersonInfo();
	    System.out.println("-----------------------");
	    s1.getStudentInfo();

	}

}
