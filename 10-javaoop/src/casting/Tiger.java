package casting;

public class Tiger extends Animal{
	
    public Tiger(String name, int age) {
    	super(name,age);
    }
    public void Howl() {
    	System.out.println("호랑이가 웁니다.");
    }
    public void eat() {
    	System.out.println("호랑이가 먹습니다.");
    }
    public void sit() {
    	System.out.println("호랑이가 앉습니다.");
    }
}
