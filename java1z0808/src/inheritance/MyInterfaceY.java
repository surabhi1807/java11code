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
}
