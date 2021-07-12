package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		Map<String, Integer> menu = new HashMap<>();
		menu.put("짜장면", 5000);
		menu.put("짬뽕", 6000);
		menu.put("볶음밥", 5500);
		menu.put("탕수육", 15000);
		menu.put("군만두", 3000);
		System.out.println(menu);
		
		System.out.println(menu.get("짜장면"));
		System.out.println(menu.get("볶음밥"));
		System.out.println(menu.get("군만두"));
	}

}
