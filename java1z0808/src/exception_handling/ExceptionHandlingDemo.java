package exception_handling;

import java.io.File;
import java.io.IOException;

// An event that disturb normal flow of the program is called exception.
// Exception handling - put the risky codes inside a try block and handle it in the catch block .
// Risk code are those which cause the abnormal termination of the program .
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
 * Difference between Checked vs Unchecked
 * 1. checked exception is  recoverable where as unchecked exception is not recoverable.
 * 2. checked exception, compiler will force you to handle the exception or propagate it  to the caller 
 * where as for unchecked exception compiler will not force you.
 *  3. checked exception , if you are throwing a checked exception , in throws clause you must propagate 
 *  either same type exception or its parent type where as in unchecked exception there is no such 
 *  restrictions.
 *  
 *  Note:- 
 *  1) while handling the exception child come first then the parent (valid for both checked and unchecked).
 *  2)a. if you are throwing a checked exception , in throws clause if there are multiple exception then
 *   you have to insert "," between them to represent (here , order doesn't matter )
 *   b. In throws clause you must propagate either same type or its parent type (but in a group  child type 
 *    exception , you can also propagate ).
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
