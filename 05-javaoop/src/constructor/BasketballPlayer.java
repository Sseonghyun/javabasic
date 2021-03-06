package constructor;

public class BasketballPlayer {
	//선수 속성 
	public String name;
	public int height;
	public int jump;
	// 선수 생성자
	public BasketballPlayer(String n, int h, int j) {
		name = n;
		height = h;
		jump = j;
	}
	// 선수 동작 추가하기
	public void getInfo() {
		System.out.println("이름 : " + name +
		                   ", 키 : " + height +
		                   ", 점프력 : " + jump);
	}
	// 선수 덩크슛 기능 추가하기
	public void dunkShot() {
		if(height+jump > 300) {
			System.out.println("덩크슛에 성공했습니다.");
		}else {
			System.out.println("골대에 닿지 않았습니다.");
		}
	}

}
