package overloading;

public class Main2 {

	public static void main(String[] args) {
		OverTest o1 = new OverTest();
		OverTest o2 = new OverTest("1번");
		OverTest o3 = new OverTest(2);
		OverTest o4 = new OverTest("3번",4);
		
		o1.showData();
		o2.showData();
		o3.showData();
		o4.showData();
	}

}
