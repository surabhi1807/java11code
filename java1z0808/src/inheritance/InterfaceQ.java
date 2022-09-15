package inheritance;

public interface InterfaceQ {
void m1();
//String m2();
void m3(int a);
int m4(int a);
default void m5() {
	System.out.println("InterfaceQ default method m5");
}
default void m7() {
	System.out.println("InterfaceQ default method m7");
}
default void m8() {
	System.out.println("InterfaceQ default method m8");
}
static void m6() {
	System.out.println("InterfaceQ static method m6");
}
static int m9() {
	System.out.println("InterfaceQ static method m9");
	return 10;
}
static void p1() {
	System.out.println("InterfaceQ static method ");
}
}
