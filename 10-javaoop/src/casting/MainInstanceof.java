package casting;

public class MainInstanceof {

	public static void main(String[] args) {
		Animal t1 = new Tiger("호랑이" , 3);
		// 현재 Animal 타입인 t1의 근본자료형이 Tiger인지 검사
		System.out.println(t1 instanceof Tiger);
		// 현재 Animal 타입인 t1의 근본자료형이 Rion인지 검사
		System.out.println(t1 instanceof Rion);
		// 현재 Animal 타입인 t1의 근본자료형이 Animal인지 검사
		System.out.println(t1 instanceof Animal);

	}

}
