
public class LogicalOperator2 {

	public static void main(String[] args) {
		// &&,|| 는 short circuit(단축검정) 연산자
		// &&는 왼쪽항이 false일 경우 오른쪽 항을 수행하지않고 무조건 false로 판단
		// ||는 왼쪽항이 true일 경우 오른쪽 항을 수행하지않고 무조건 true로 판단
		// &,| 와 똑같이 작동하되, 왼쪽 조건식만으로 최종 결과가 확정되는 경우 추가연산을 수행하지 않음
		System.out.println( (1 + 3 > 4) && (0 < 3/0) );//1+3은 4보다 크다 (거짓) && 0은 3나누기0보다 작다 (판단불가)
		// 왼쪽이 이미 거짓으로 판단이되어 오른쪽결과와 무관하여 거짓으로 판단
		System.out.println( (5 > 4) || (0 < 2/0) ); //5는 4보다 크다 (참) || 0은 2나누기0보다 작다 (판단불가)
		// 왼쪽이 이미 참으로 판단이되어 오른쪽결과와 무관하여 참으로 판단
	}

}
