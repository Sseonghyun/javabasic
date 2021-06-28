package static2;

public class Main {
	public static void main(String[] args) {
		// Asean 조원 없이도 Asean 조별점수는 조회 가능
		// System.out.println(Asean.score);
		
		Asean a1 = new Asean(25, 21, 30);
		Asean a2 = new Asean(23, 25, 30);
		Asean a3 = new Asean(21, 25, 30);
		Asean a4 = new Asean(23, 23, 27);
		
		a1.showAseanInfo();
		a2.showAseanInfo();
		a3.showAseanInfo();
		a4.showAseanInfo();
	}
}
