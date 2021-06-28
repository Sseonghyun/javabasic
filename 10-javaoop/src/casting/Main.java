package casting;

public class Main {

	public static void main(String[] args) {
		// Animal타입은 어떤 자료형이건 받을 수 있다.
		Animal t1 = new Tiger("호랑이" , 1);
		Animal r1 = new Rion("사자" , 3);
		Animal a1 = new Animal("동물" , 5);
		
		t1.sit();
		r1.sit();
		a1.sit();
		
		// 자식타입을 베이스로 만든 부모타입 변수는
		// 자식타입으로 강제로 바꿀 수 있다.
		Tiger tiger = (Tiger)t1;
		Rion rion = (Rion)r1;
		
		// 원타입으로 돌려놓으면 원타입만의 메서드로 호출이 가능합니다.
		tiger.Howl();
		rion.jump();
		
		// 근본이 Animal인 경우는 다른 타입으로 변형이 안됩니다.
		// Tiger tiger1 = (Tiger)a1;
		// tiger1.Howl();
		
	}

}
