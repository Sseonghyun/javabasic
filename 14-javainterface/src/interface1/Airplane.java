package interface1;

public class Airplane implements Vehicle {
	private String owner;
	private int speed;
	private int gas;
	
	public Airplane(String owner) {
		this.owner = owner;
		this.speed = 0;
		this.gas = AIRPLANE_MAX_GAS;
	}
	public void Accel() {
		if(speed + 30 > AIRPLANE_MAX_SPEED) {
		} else {
			speed += 30;
		}
		gas -= 5;
	}
	public void breakSpeed() {
		if(speed - 20 < AIRPLANE_LOW_SPEED) {
		} else {
			speed -= 20;
		}	
	}
	public void reFuel() {
		if(gas + 50 > AIRPLANE_MAX_GAS) {	
		} else {
			gas += 50;
		}
	}
	public void showStatus() {
		System.out.println("현재 비행기운전자 :" + owner);
		System.out.println("현재 비행기속도 :" + speed);
		System.out.println("현재 비행기연료 :" + gas);
		System.out.println("-----------------");
		
	}
}
