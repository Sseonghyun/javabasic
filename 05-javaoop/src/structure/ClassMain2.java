package structure;

public class ClassMain2 {

	public static void main(String[] args) {
		Dog a = new Dog();
		Dog b = new Dog();
		
		a.name = "진도";
		a.age = 3;
		a.type = "진돗개";
		a.woolcolor = "black";
		
		b.name = "포메";
		b.age = 1;
		b.type = "포메라니안";
		b.woolcolor = "white";
		
		a.getInfo();
		System.out.println("-------------");
		b.getInfo();

	}

}
