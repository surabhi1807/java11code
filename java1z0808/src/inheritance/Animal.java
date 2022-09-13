package inheritance;

public interface Animal {
// An abstract method eat 
	 void eat() ;
	// a default method sleep
	default void  sleep() {
		 System.out.println("can sleep");
	 }
	// A static method run
	static void run() {
		System.out.println("can run");
	}
	
}
