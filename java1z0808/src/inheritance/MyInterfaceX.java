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
//default void m7() {
//	System.out.println("MyInterfaceX default method m7");
//}
default void m8() {
	System.out.println("MyInterfaceX default method m8");
}
static void m6() {
	System.out.println("MyInterfaceX static method m6");
}
static int m9() {
	System.out.println("MyInterfaceX static method m9");
	return 20;
}
static void p2(int a) {
	System.out.println("MyInterfaceX static method p2");
}
}
