package date210623.method;

public class GetBMI {

	// getBMI 메서드를 만들어주세요.
	// return 자료형은 double입니다.
	// 입력은 double height , double weight를 받습니다.
	// BMI 공식은 몸무게/키(미터)^2입니다.
	// 175cm의 경우 -> 1.75미터입니다.
	// 메서드를 여기에 작성해 주신 다음, 메인 내부에서
	// getBMI를 sysout으로 감싸서 결과값이 나오게해 주세요
	
	public static double getBMI(double height, double weight) {
		return weight/(height*height);
	}
	public static void main(String[] args) {
		System.out.println(getBMI(1.75, 64));

	}
//      * 다른방식!
//		public static double getBMI(double height(175), double weight(64)) {
//          double m(1.75) = height(175)/100;
//			double result(20.897959...) = weight(64) / (m*m)(1.75*1.75);
//          return result;(20.897959...)
//		}
//		public static void main(String[] args) {
//          double result = getBMI(175,64)
//			System.out.println(result);
//      }	

}
