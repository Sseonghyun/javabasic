package superclass;

public class SuperSonicAirplane extends Airplane {
	// 초음속 비행기도 일반 비행기처럼 속도를 사용합니다.
	// 따라서 변수는 추가로 정의하지 않습니다.
	
	public SuperSonicAirplane(int s) {
		// Airplane의 생성자는 상속되지 않습니다.
		// 따라서 부모쪽의 생성자라는 의미로
		// super();를 사용하여 이 때 부모쪽에 넘겨줄 수치값도
		// 함께 받아서 처리해줍니다.
		super(s);
	}
	
	public void fly() {
	// 일반 비행(부모클래스의 fly)는 super.fly();
	// 를 이용해서 호출 가능합니다.
	// 속도 900 이하인 경우 일반 비행 모드를 호출하게 해 주시고,
	// 속도가 900이상 1300이하인 경우는 초음속 비행을
    // 호출하도록 로직을 만들어주세요.
		if(speed + 500 <= 900) { //speed+500이 900과 같거나 작을경우
			super.fly(); // super.fly()를 호출
		} else { //speed+500이 900보다 클경우
			if(speed + 500 >= 1300) { // speed+500이 1300과 같거나 클경우
				speed = 1300; // 1300이 최대값 제한
			} else { // speed+500이 1300보다 작을경우
				speed += 500; // 500을 더해줌
			}
			System.out.println("초음속 비행속도" + speed + "km/h");
		}
	   
	}	
}


