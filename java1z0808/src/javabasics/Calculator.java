package javabasics;

public class Calculator{
	int add (int a,int b) {
		return a+b;
		
	}
	int  subtract(int a, int b) {
		return a-b;
		
	}
	int multiply (int a,int b) {
		return a*b;
	}
	int divide(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
	Calculator c= new Calculator();
	int sum = c.add(10,20);
	System.out.println(sum);
	int sub = c.subtract(16, 20);
	System.out.println(sub);
	int multi = c.multiply(98, 24);
	System.out.println(multi);
	int divi = c.divide(2600, 87);
	System.out.println(divi);
	
	}
	
}
