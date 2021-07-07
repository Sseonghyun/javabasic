package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto1 {

	public static void main(String[] args) {
		// 로또복권 추첨기를 만들어보겠습니다.
		// 로또복권 추첨기는 1이상 45이하의 범위에서 겹치는 숫자 없이
		// 6개의 숫자를 뽑습니다.
		// 순서를 정렬해서 출력하도록 만들어주세요.
		// ArrayList의 정렬은 .sort()대신
		// collections.sort(리스트);를 이용해 정렬합니다.	
		List<Integer> lotto = new ArrayList<>();
		int getNum = 0;
		while(lotto.size() !=6) { // 6개가 아니면 돌리고 6개가 되면 탈출해라.
			getNum = (int)(Math.random() * 45) +1; 
			if(!lotto.contains(getNum)) {
				// contains는 없을때 false, 있을때 true 이지만
				// !를 사용하여 없는숫자가 나올경우 true가 되어 실행.
				lotto.add(getNum);
			}
		}
		Collections.sort(lotto); // 정렬해주는 입력값.
		System.out.println("추첨된 번호:" + lotto); // 실행문

	}

}
