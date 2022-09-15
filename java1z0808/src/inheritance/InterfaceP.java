package inheritance;

public interface InterfaceP {
void m1();
int m2();
void m3();
void m4();
default void m5() {
	System.out.println("InterfaceP default method m5");
}
//default int m7() {
//	System.out.println("InterfaceP default method m7");
//	return 0;
//}
default void m8(int a) {
	System.out.println("InterfaceP default method m8");
}

static void m6() {
	System.out.println("InterfaceP static method m6");
}
static void m9() {
	System.out.println("InterfaceP static method m9");
}
static void p1(int a) {
	System.out.println("InterfaceP static method p1");
}
}
