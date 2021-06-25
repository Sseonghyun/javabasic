import java.util.Scanner;

// 문제풀이 요구사항
// 환률계산기를 만들어보겠습니다
// 네이버에 검색하여 원하는 국가 화폐의 환율을
// rate 변수에 저장해주세요
// 스캐너를 이용하여 won 변수에 원하는 금액을 입력해주세요
// 원화와 환율을 이용해서
// 원화 XXXXX원을 환전시 XXXX(화폐)입니다 로 결과물 출력
public class Scanner3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double rate = 1355.29;
		
		System.out.println("유로환율은" + rate + "입니다.");
		System.out.println("원화를 입력해주세요.");
		int won = scan.nextInt();
		
		System.out.println("원화" + ( won ) + "원을 유로환률로 환전시");
		System.out.println(Math.round (won / rate) + "입니다.");
		//System.out.println(
		//		String.format("%.2f" , (won / rate)) + "ntd입니다");
		//System.out.printf( "%.0f 원입니다." , (won/rate) );
		// "%(.자릿수)f"
		// 1일경우 0000.0 / 2일경우 0000.00
		scan.close();
	}

}
