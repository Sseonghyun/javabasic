package structure;

public class PersonClass {
	public String name;
	public int age;
	public String pNum;
	public String address;
	public String glasses;
	
	// 추가로 아까의 조회 메서드를 내부에 생성해주세요.
	// 클래스 내부에 생성할때는 static이 필요없습니다.
	// 클래스는 자기와 같은 지역에 있는 요소를 소속 명시 없이 조회 가능합니다.
	public void getInfo() {
	    System.out.println(name);
		System.out.println(age);
		System.out.println(pNum);
		System.out.println(address);
		System.out.println(glasses);
		
	}
}