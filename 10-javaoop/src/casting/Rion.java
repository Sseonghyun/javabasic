package casting;

public class Rion extends Animal {
	
	public Rion(String name , int age) {
		super(name,age);
	}
	public void jump() {
		System.out.println("사자가 점프합니다.");
	}
	public void eat() {
		System.out.println("사자가 먹습니다.");
	}
	public void sit() {
		System.out.println("사자가 앉습니다.");
	}
}
