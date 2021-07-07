package calendar1;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		// Calendar는 현재 시간을 일반 시간이 아닌 요일이나 오전/오후 등으로
		// 달력을 기준으로 표기해주는 방식입니다.
		// Calendar.getInstance()를 이용해 사용합니다.
		Calendar now = Calendar.getInstance();
		
		System.out.println(now.get(Calendar.YEAR) + " 년도");
		// 월은 0이 1월, 11이 12월이므로 1을 반드시 더해야합니다.
		System.out.println((now.get(Calendar.MONTH)+1) + " 월");
		System.out.println(now.get(Calendar.DAY_OF_MONTH) + " 일");
		// 요일은 일1 월2 화3 수4 목5 금6 토7 로 표기 (0이 없음)
		System.out.println(now.get(Calendar.DAY_OF_WEEK) + " 요일");
		// 오전오후는 오전? 오후1 로 표기
		System.out.println(now.get(Calendar.AM_PM) + " 오전오후");
		System.out.println(now.get(Calendar.HOUR) + " 시");
		System.out.println(now.get(Calendar.MINUTE) + " 분");
		System.out.println(now.get(Calendar.SECOND) + " 초");
	}

}
