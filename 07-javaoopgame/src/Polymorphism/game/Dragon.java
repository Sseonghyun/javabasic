package Polymorphism.game;

public class Dragon extends Monster{
	
	public Dragon() {
		super("드래곤",20,5,1);
	}
	public void Battle(int uAtk) {
	super.Battle(getAtk());
	System.out.println("이 드래곤은 이미 죽었습니다.");
	}
	
	}

