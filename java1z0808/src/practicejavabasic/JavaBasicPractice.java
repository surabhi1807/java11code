package practicejavabasic;

public class JavaBasicPractice {
	private static int a;
	private final int B=10; 
	private int c;
	public static  void myMethod() {
		final int d=10;
		 int e;
		System.out.println("in stactic method only static members can be called " +a);
		
	}
	public void myMethod1() {
		final int e=10;
		int f;
		
		System.out.println(a+ " " +B+ " "+ c );
		
		
	}
	public static void main(String[] args) {
		myMethod();
		JavaBasicPractice j=new JavaBasicPractice();
		j.myMethod1();
			
		}
	}


