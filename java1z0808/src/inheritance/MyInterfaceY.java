package inheritance;

public interface MyInterfaceY {
	int a=20;
	void m1();
	int m2();
  void m3(int a);
  int m4(int a);
  default void m5() {
	  System.out.println("MyInterfaceY default method m5");
  }
  default int m7() {
	  System.out.println("MyInterfaceY default method m7");
	  return 0;
  }
  default void m8(int a) {
	  System.out.println("MyInterfaceY default method m8");
  }
  static void m6() {
	  System.out.println("MyInterfaceY static method m6");
  }
  static void m9() {
	  System.out.println("MyInterfaceY static method m9");
  }
  static void p2() {
	  System.out.println("MyInterfaceY static method p2");
  }
}
