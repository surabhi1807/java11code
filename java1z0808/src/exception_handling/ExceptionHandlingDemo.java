package exception_handling;

import java.io.File;
import java.io.IOException;

// An event that disturb normal flow of the program is called exception.
// Exception handling - put the risky codes inside a try block and handle it in the catch block .
// Risky code are those which cause the abnormal termination of the program .
/*
 * Benefits of exception handling :-
 * Exception: It is caused by our program and these are recoverable.
 * provision to complete program execution
 * Easy identification of program code and error handling code.
 * Propagation of errors
 * Meaningful error reporting
 * Identifyig Error types

 */
/*
 * Note:-
 * 1) Exception is caused by our program and it is recoverable .
 * 2) Error is not caused by our program , these are due to lack of system resources and it is not 
 * recoverable.
 * 
 */
public class ExceptionHandlingDemo {
	static String s;
	public static void main(String[] args) {
		try {
			System.out.println(4/0);
			System.out.println("Happy navratri");
			String p="Surabhi";
			System.out.println(s.equals(p));
			
				
		}catch(ArithmeticException e) {
			System.out.println("Denominator must not be zero");
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Hello World");
//		int i =10;
//		while(true){
//			i=i*i;
//			System.out.println(i);
//		}
File file=new File("C:\\Users\\ADMIN\\OneDrive\\Documents\\New folder\\Hello.txt");
try {
	file.createNewFile();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
