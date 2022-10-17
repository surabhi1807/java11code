package exception_handling;

public class ExceptionExample2 {
	public void m1() {
		int a=20;
		try {
			a++;
			System.out.println(10/0);
		}catch(Exception e) {
			a++;
		}
		finally {
			a++;
		}
     System.out.println(a);
	}
	public int m2() {
		int a= 10;
		try {
			a++;
	    System.out.println(10/0);
			a++;
			return a;
		}catch(Exception e) {
			a++;
			return a;
			
		}finally {
			a++;
			return a;
			
		}
		
	}
	public int m3() {
		int a =5;
		try {
			a++;
	//		System.out.println(10/0);
			a++;
			return a;
		}catch(Exception e) {
			a++;
			return a;
			
		}finally {
			a++;
			
		}
	}
	
		
	

		
	
	public static void main(String[] args) {
 
		ExceptionExample2 e= new ExceptionExample2();
		//e.m1();
//	int result= e.m2();
  //  System.out.println(result);
		int result =e.m3();
		System.out.println(result);
	}
 
}
