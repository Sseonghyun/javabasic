package thiskeyword;

public class Main {

	public static void main(String[] args) {
		// this 가 적용된 Person 생성하기
		// 생성시 ctrl + space를 누르면 입력할 요소가 출력됨
		Person p1 = new Person("유재석" , 20 , 5000 , "경영학");
		p1.getInfo();
		System.out.println("------------------");
		Person p2 = new Person("강호동" , 30 , 3000 , "통계학");
		p2.getInfo();
				
	}

}
