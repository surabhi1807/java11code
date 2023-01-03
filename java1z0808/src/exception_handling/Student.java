package exception_handling;

import java.io.IOException;

public class Student {
	public void m1() {
		System.out.println("m1 parent class ");
		
	}
	public void m2()throws IOException {
		System.out.println("m2 parent class");
	}
   public Object getFullName(String firstName, String lastName) throws IOException{
	   System.out.println("From parent");
	   if(lastName.equals("Chudail")) {
		   throw new IOException();
	   }
	   return firstName +" "+ lastName ;
   }
}
