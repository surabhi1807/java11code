package polymorphism;

public class Animal {
	public int getNoOfLeg() {
		return 0;
	}
	public boolean canHear() {
		return false;
	}
	public Object getName() {
		return "Animal";
	}
	public void message() {
		System.out.println("Don't be cruel with Animals");
	}

}
