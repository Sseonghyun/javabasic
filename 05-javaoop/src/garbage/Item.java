package garbage;

public class Item {
	public int num;
	
	public Item(int n) {
		num = n;
		System.out.println(num + " 번 객체 생성");
	}
	
	// 소멸자 finallze()
	// 생성자는 객체가 생성할 때 반드시 호출되고,
	// 소멸자는 객체가 소멸할 때 호출됩니다.
	protected void finallze() {
		System.out.println(num + "객체 삭제");
	}
}
