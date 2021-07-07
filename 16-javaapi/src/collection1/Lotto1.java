package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto1 {

	public static void main(String[] args) {
		// 로또복권 추첨기를 만들어보겠습니다.
		// 로또복권 추첨기는 1이상 45이하의 범위에서 겹치는 숫자 없이
		// 6개의 숫자를 뽑습니다.
		// 순서를 정렬해서 출력하도록 만들어주세요.
		// ArrayList의 정렬은 .sort()대신
		// collections.sort(리스트);를 이용해 정렬합니다.
		
		Random r = new Random();
		
		List<Integer> lotto = new ArrayList<>();
		
		int Number = r.nextInt(45) +1;
		
		lotto.add(Number);
		lotto.add(Number);
		lotto.add(Number);
		lotto.add(Number);
		lotto.add(Number);
		lotto.add(Number);
		
		Collections.sort(lotto);
		
		System.out.println("추첨된 번호:" + lotto);
		System.out.println("당첨번호:" + Number);
	}

}
