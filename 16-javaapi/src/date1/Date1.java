package date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		// Date는 날짜를 표현하는 클래스로 DB등과 통신할때 Date를 이용해
		// 날짜자료를 받아오거나 넘겨주는것이 권장됩니다.
		// 사용시 import java.util.Date를 해야 합니다.
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(strNow);
		// 일 월 일 시:분:초 현재위치한나라 년도 표현
		
		// 표현되는 양식을 바꿀때는 simpleDateFormat을 활용합니다.
		// import가 필요합니다. ctrl + space 를 활용해주세요.
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
