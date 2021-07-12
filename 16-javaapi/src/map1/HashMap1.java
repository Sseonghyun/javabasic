package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		// Map자료형의 대표 자료형은 HashMap입니다.
		// 제네릭 내부에는 <Key자료형, Value자료형> 으로 작성합니다.
		Map<String, String> map = new HashMap<>();
		map.put("손흥민", "토트넘");
		map.put("호날두", "유벤투스");
		map.put("메시", "바르셀로나");
		System.out.println(map);
		
		// 자료조회시는 .get(키값)으로 조회합니다.
		// map은 key로 value를 조회하는건 가능하지만 역으로는 불가능
		// 없는 key값으로 조회하면 null이 나온다.
		// 인덱스 번호도 존재하지않음.
		System.out.println(map.get("손흥민"));
		System.out.println(map.get("메시"));
		System.out.println(map.get("호날두"));
		System.out.println(map.get("토트넘")); // Value값을 적으면 불가 , Key값을 적어야만 가능
		System.out.println(map.get(0));// 인덱스 번호도 존재하지않음
		
		// 기본적으로 map자료형은 조회도 key중심으로 이루어집니다.
		// .containsKey()는 해당 키값이 자료내에 존재하는지 확인합니다.
		System.out.println(map.containsKey("손흥민"));
		System.out.println(map.containsKey("메날두"));
		
		// remove는 key를 이용해서 key=value 전체를 삭제합니다.
		map.remove("호날두");
		System.out.println(map);
		
		// .size()는 크기를 알려줍니다. 정수로 몇 개의 key=value 쌍이
		// 저장되어있는지 확인할 수 있습니다.
		System.out.println(map.size());
		
	}

}
