package structure;

public class ClassMain {

	public static void main(String[] args) {
		// person 2명을 만들어보겠습니다.
		PersonClass person1 = new PersonClass();
		PersonClass person2 = new PersonClass();
		// person 2명의 정보를 직접 기입해주세요.
		person1.name = "김우빈";
		person1.age = 33;
		person1.pNum = "010-0000-0000";
		person1.address = "서울";
		person1.glasses = "false";
		
		person2.name = "이종석";
		person2.age = 33;
		person2.pNum = "010-1234-5678";
		person2.address = "경기";
		person2.glasses = "true";
		// 정보를 조회해봅시다.
		person1.getInfo();
		System.out.println("-------------");
		person2.getInfo();
	}

}
