package exception_handling;

public class ExceptionExample1 {
	public int divide (int num1,int num2 ) {
		System.out.println(num1/num2); 
		System.out.println("Hello");
		return num1/num2;
	}
	public int add(int num1,int num2) {
		int sum = 0;
		try {
			 sum= num1+divide(num1, num2);
			System.out.println("I am add method");
		
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		return sum;
		
	}

	public static void main(String[] args) {
	//	try {
			ExceptionExample1 ex =new ExceptionExample1();
			ex.add(4, 0);
			System.out.println("Hii");
	//}catch(ArithmeticException e) {
	//	e.printStackTrace();
//	}
 
}
}