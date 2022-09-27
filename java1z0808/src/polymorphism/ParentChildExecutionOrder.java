package polymorphism;

public class ParentChildExecutionOrder extends ParentExecutionOrder{
	private int a1;
	private static float f1=m5();
	private String su="Surabhi";
	private long l1=m6();
	private static double d1=100.3;
	{
		int b1=2;
		System.out.println("This is first instance block of child class" +b1);
		b1++;
	}
	static {
		System.out.println("This is first static block of child class");
	}
	public static void m1() {
		System.out.println("This is first static method  m1 of child class "+ d1);
	}
	{
		System.out.println("This is second instance block of child class "+ l1);
	}
public void m2() {
	System.out.println("This is first instance method m2 of child class "+ su);
}
public static int m5() {
	System.out.println("This is second static method  m5 of child class");
	return 47;
}
public ParentChildExecutionOrder() {
	System.out.println("This is constructor of child class"+a1);
}
static {
	System.out.println("This is second static block of child class"+f1);
}
public int m6() {
	System.out.println("This is second instance method m6 of child class");
	return 50;
}
	public static void main(String[] args) {
        ParentChildExecutionOrder p=new ParentChildExecutionOrder();
        p.m4();
		ParentExecutionOrder parent=new ParentChildExecutionOrder();
	    ParentChildExecutionOrder child = (ParentChildExecutionOrder)parent;
	    
 
	}

}
