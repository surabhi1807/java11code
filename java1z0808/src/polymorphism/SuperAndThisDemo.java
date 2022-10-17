package polymorphism;

public class SuperAndThisDemo extends Parent{
private	int a;
private float b;
private long c;
private static double d;
private static float e;
public SuperAndThisDemo() {
	//int f;
	this(10,20);
	
}
public SuperAndThisDemo(int a,int b) {
	super();	
}
public static void m1(int a, int b) {
	a=a;
	b=b;
}
static {
	int i=10;
	//this.a=i;
}
public void m2(long c,double d) {
	//this(10,20);

	this.c=c;
	this.d=d;
	this.m1(1, 2);
	super.surname="Singh";
	}
	public static void main(String[] args) {
		
	}

}
