package constructor;

import java.util.Scanner; //패키지는 도트 . 으로 구분함

import structure.PersonClass;

public class Main {
	// constructor 패키지 내부에 소속된 Car를 호출할때는
	// 같은 영역이기때문에 constructor.Car로 호출해도 되고
	// 그냥 Car로 호출해도 된다.
	// 다른 패키지에 있는 Car를 호출시엔 패키지명.Car로 호출해야한다.
	public static void main(String[] args) {
		Car car1 = new Car(100, 0, "서성현");
		Car car2 = new Car(80, 0, "홍길동");
		// 자동차 정보 조회
		car1.getInfo();
		car1.accelSpeed();
		car1.accelSpeed();
		car1.breakSpeed();
		
		car2.getInfo();
		car2.accelSpeed();
		car2.accelSpeed();
		car2.breakSpeed();
		
		// 같은 패키지 내부에 중복된 이름이 없는 외부클래스라고 해도
		// 호출시에는 반드시 패키지명을 입력해줘야 합니다.
		// structure.PersonClass p1 = new structure.PersonClass();
		// 다른방법으로는
		// 문서 상단에 import구문을 이용하여
		// 현재 패키지의 PersonClass는 structure의 클래스임을 명시하는 방법이 있습니다.
		// 명시 방법은 클래스명을 적고 ctrl+space를 이용해서
		// 자동입력 하거나, 그냥 직접 import를 적어주는 방법이 있습니다.
		PersonClass p2 = new PersonClass();
		// → 3번라인에 import structure.PersonClass;라고 작성됨
		Scanner scan = new Scanner(System.in);
		
	}

}
