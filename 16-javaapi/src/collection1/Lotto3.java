package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto3 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들어주세요.
		// 1. 당첨번호 6개를 뽑습니다.
		// 2. 추첨번호 6개를 뽑습니다.
		// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
		// 4. 3에서 일치하지 않으면 반복횟루를 1 더하고 추첨번호 6개를 뽑고
		// 이어서 비교해서 일치여부 검사.
		
		int count = 0;
		List<Integer> lotto = new ArrayList<>(); // 당첨번호
		List<Integer> MyNum = new ArrayList<>(); // 추첨번호
		// 1번 해당
		while(lotto.size() !=6) { 
			int getNum = (int)(Math.random() * 45) +1; 
			if(!lotto.contains(getNum)) {
				lotto.add(getNum); 
			}
		}
		Collections.sort(lotto); // 정렬해 주는 입력값
		System.out.println("추첨된 번호 : " + lotto); 
		// 2번,3번,4번 해당
		while(!lotto.equals(MyNum)) { //lotto와 MyNum 내부요소가 같은지 비교
			count++; // 횟수증가
			MyNum.clear(); // clear 빈리스트로 만들어줌.
			while(MyNum.size() != 6) { 
			int getNum = (int)(Math.random() * 45) +1; 
			if(!MyNum.contains(getNum)) {
				MyNum.add(getNum); 
			}
		}
		Collections.sort(MyNum); // 정렬해 주는 입력값
		System.out.println("이번에 뽑힌 번호 : " + MyNum); 
	}
		System.out.println("추첨 번호 :" + lotto);
		System.out.println("당첨 번호 :" + MyNum);
		System.out.println("총 로또복권을  " + ((long)count * 1000)
				+ "원 사고서야 1등에 당첨되었습니다.");

}
}
