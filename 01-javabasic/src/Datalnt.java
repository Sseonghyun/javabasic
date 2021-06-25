
public class Datalnt {

	public static void main(String[] args) {
		// 정수형을 나타낼 수 있는 자료형은 크게 4가지
		// (1)byte , (2)short , (4)int , (8)long
		// 변수 선언시 지정 자료형을 위의 키워드로 지정
		byte a = 127;
		// 1byte=8bit ( 0~2의7승-1 = 127 )
		short b = 32000;
		// 2byte = 16bit ( 0~2의15승-1 = 32767 )
		int c = 3; 
		// 4byte = 32bit ( 0~2의31승-1 = )
		long d = 4;
		// 8byte = 64bit ( 0~2의63승-1 = )
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}