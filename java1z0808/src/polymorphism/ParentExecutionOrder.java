package polymorphism;

public class ParentExecutionOrder {
	static {
		System.out.println("This is newly first static block of parent class");

	}
private int a;
private static float f=m4();
private String s="Surabhi";
private long l=m6();
private static double d=20.01;
{
int b=2;
System.out.println("This is first instance block of parent class" + " " +b);
b++;
}
static {
	System.out.println("This is first static block of parent class");
	
}
public static void  m1() {
	System.out.println("This is m1 static method of parent class" + " "+ d );
}
{
	System.out.println("This is second instance block of parents class"+ " " + l);
}
public void m2() {
	System.out.println("This is m2 instance method of parent class"+ " "+ s);
}
public static int m4() {
	System.out.println("This is m4 static method of parent class");
	return 41;
}
public ParentExecutionOrder() {
	System.out.println("This is constructor of parent class"+ " " + a);
}
static {
System.out.println("This is second static block of parent class"+ " "+ f);	
}
public int m6() {
	System.out.println("This is m6 instance method of parent class  ");
	return 45;
}
	public static void main(String[] args) {
 ParentExecutionOrder parent= new  ParentExecutionOrder();
 
	}

}
