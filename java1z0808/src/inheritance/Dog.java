package inheritance;

public class Dog implements Animal{

	@Override
	public void eat() {
    System.out.println("can eat");		
	}
	@Override
public	 void sleep() {
		System.out.println(" Tyson can sleep");
	}
	//@Override
	public static void run() {
		
	}
}
