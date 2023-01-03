package exception_handling;

import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * Some of the rules of exception handling with respect to method overriding -
 * 1. if the parent class method doesn't declare any exception than child class overridden 
 *    method can not declare the checked exception but it can declare unchecked exception .
 * 2. if the parent class method declares an exception than child class overridden method
 *    can declare either same exception or its subclass exception or no exception at all 
 *    but can not declare .
 */

public class ExceptionWRTOverriding extends Student {
	@Override
	public Object getFullName (String firstName, String lastName) throws IOException{
		return firstName+ " "+ lastName;
	}
	public void m1()throws ArithmeticException {
		System.out.println("m1 method from child class");
	}
	public void m2()throws ArithmeticException{
		System.out.println("m2 method from child class");
	}
	public static void main(String[] args) throws IOException {
		Student s=new ExceptionWRTOverriding();
  Object result = s.getFullName("Surabhi", "Chudail");
  System.out.println(result);
	}

}
