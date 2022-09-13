package inheritance;

public interface MyInterfaceX {
	int a =10;
	void m1();
//	String m2();
void m3();
void m4();
default void m5() {
	System.out.println("MyInterfaceX default method m5");
}
}
