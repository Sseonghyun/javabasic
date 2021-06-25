
public class LogicalOperator1 {

	public static void main(String[] args) {
		// 논리 연산자는 둘 이상의 논리식을 병렬형태로 제시
		// 논리식1 & 논리식2의 경우 양쪽 논리식이 다 true인 경우
		// 논리식1 | 논리식2의 경우 한쪽 이상이 true인 경우
		// 최종 조건식을 true로 판단
		System.out.println( (100>50) & (30>50) );// 100은 50보다 크다 (참) & 30은 50보다 크다 (거짓)
		// &는 양쪽다 true인 경우 true로 판단하기 때문에 false로 표현 
		System.out.println( (100>50) | (30>50) );// 100은 50보다 크다 (참) | 30은 50보다 크다 (거짓)
		// |는 한쪽 이상이 true인 경우 true로 판단하기 때문에 true로 표현
	}

}
