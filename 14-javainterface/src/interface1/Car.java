package interface1;

// 인터페이스를 구현(상속이 아님!)하기 위해서는
// implements(extends가 아님!)키워드를 사용합니다.
// 인터페이스 내부의 추상메서드는 무조건 구현해줘야 한다.
public class Car implements Vehicle {
	// 자동차라면 가져야 하는 변수 설정
	// 현재속도, 현재연료량, 차주
	private int speed;
	private int gas;
	private String owner;
	// 생성자를 만들어주세요. 차주만 입력받고
	// 나머지 요소는 현재 속도 0, 연료량 100을 대입해줍니다.
	public Car(String owner) {
		this.speed =0;
		this.gas = CAR_MAX_GAS;
		this.owner = owner;
	}
	public void Accel() {
		if(speed + 10 > CAR_MAX_SPEED) {		
		} else {
			speed += 10;
		}
		gas -= 1;
	}
	public void breakSpeed() {
		if(speed - 10 < CAR_LOW_SPEED) {
		} else {
			speed -= 10;
		}	
	}
	public void reFuel() {
		if(gas + 30 > CAR_MAX_GAS) {
		} else {
			gas += 30;
		}
	}
	public void showStatus() {
		System.out.println("현재 자동차 운전자 :" + owner);
		System.out.println("현재 자동차 스피드 :" + speed);
		System.out.println("현재 자동차 연료 :" + gas);
		System.out.println("-------------");
		
	}
	

}
