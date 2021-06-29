package interface1;

public class Bike implements Vehicle {
	private String owner;
	private int speed;
	private int gas;
	
	public Bike(String owner) {
		this.owner = owner;
		this.speed = 0;
		this.gas = BIKE_MAX_GAS;
	}
	public void Accel() {
		if(speed + 5 > BIKE_MAX_SPEED) {		
		} else {
			speed += 5;
		}
		gas -= 1;
	}
	public void breakSpeed() {
		if(speed - 5 < BIKE_LOW_SPEED) {
		} else {
			speed -= 5;
		}	
	}
	public void reFuel() {
		if(gas + 10 > BIKE_MAX_GAS) {
		} else {
			gas += 10;
		}
	}
	public void showStatus() {
		System.out.println("현재 오토바이 운전자 :" + owner);
		System.out.println("현재 오토바이 스피드 :" + speed);
		System.out.println("현재 오토바이 연료 :" + gas);
		System.out.println("-----------------");
		
	}
}
