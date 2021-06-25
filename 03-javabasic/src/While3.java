
public class While3 {

	public static void main(String[] args) {
		// While문의 조건식이 어떻게 해석해도 true로 판단되게 입력이되면
		// 절대 끝나지 않는 무한루프문이 된다.
		// 이 경우 강제탈출문구인 break를 써야만 종료가 가능
		int count = 0;
		while(true) {
			count += 1;
			System.out.println("반복문 실행중입니다." + count);
			break;
		
		}
	}

}
