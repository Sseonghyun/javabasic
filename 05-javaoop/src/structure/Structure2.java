package structure;

public class Structure2 {
	
	// person 내부의 정보를 쉽게 조회하기 위한 메서드 제작
	public static void getInfo(Person p) {
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.pNum);
		System.out.println(p.address);
	}
	public static void getCatInfo(Cat p) {
		System.out.println("고양이 이름 : " + p.name);
		System.out.println("고양이 나이 : " + p.age);
		System.out.println("고양이 품종 : " + p.type);

	}
	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요 (a, b)
		Person a = new Person();
		a.name = "박지성";
		a.age = 40;
	    a.pNum = "010-0000-0000";
	    a.address = "대한민국";
	    
	    Person b = new Person();
	    b.name = "손흥민";
	    b.age = 29;
	    b.pNum = "010-1111-1111";
	    b.address = "영국";
	    
		Cat c = new Cat();
		c.name = "뱅갈";
		c.age = 1;
	    c.type = "뱅갈캣";
	    
	    Cat d = new Cat();
	    d.name = "시안";
	    d.age = 3;
	    d.type = "페르시안";
	    
	    getInfo(a);
	    System.out.println("------------");
	    getInfo(b);
	    System.out.println("------------");
	    getCatInfo(c);
	    System.out.println("------------");
	    getCatInfo(d);
	   

	}

}
