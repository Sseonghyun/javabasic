package math1;

public class Math61 {

	public static void main(String[] args) {
		// 가위바위보 게임을 만들어보겠습니다.
		// Math.random()을 이용해 3/1 확률로 가위,바위,보를 부여받으며
		// 가위 > 보 , 바위 > 가위 , 보 > 바위 상성을 가집니다.
		// 같은 요소가 나오면 무승부입니다.
		// 힌트) 컴퓨터가 이기는 경우 , 내가 이기는 경우 , 비기는경우를 따져서
		// 조건식에 ||을 사용합니다.
		
		// 0= 가위, 1= 바위, 2= 보
		// 0>2 , 1>0 , 2>1
		int my = (int)(Math.random() * 3); 
		int com = (int)(Math.random() * 3); 
		
		// 숫자 0,1,2의 대한 변수 정의
		final int SCISSORS = 0; // 가위=0
		final int ROCK = 1; // 바위=1
		final int PAPER = 2; // 보=2
		
		// 내가 낸 것과 컴퓨터가 낸 것을 숫자에서 문자로 치환해주는 배열
		String[]items = {"가위", "바위", "보"};
		
		// 내가 이길경우의 조건문
		if((my == SCISSORS && com == PAPER ) || 
		  (my == ROCK && com == SCISSORS ) || 
		  (my == PAPER && com == ROCK )) { 
			System.out.println("내가 이겼습니다.");
		// 컴퓨터가 이길경우의 조건문	
		} else if((my == PAPER && com == SCISSORS ) || 
				  (my == SCISSORS && com == ROCK ) || 
				  (my == ROCK && com == PAPER )) { 
			System.out.println("컴퓨터가 이겼습니다.");
		// 비길경우의 조건문	
		} else if (my == com) {
			System.out.println("무승부 입니다.");
		}

		System.out.println("내가 낸 것:" + items[my]);
		System.out.println("컴퓨터가 낸 것:" + items[com]);
	}

}
