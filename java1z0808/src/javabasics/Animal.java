package javabasics;

public class Animal {
	String categorty ="cat";
	int lags = 4;
	int ears =2;
	String name = "pussy";
	void eat() {System.out.println("Animal can eat");}
	void sleep() {System.out.println("Animal ca sleep");}
	void walk() {System.out.println("Animal can walk");}
	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.categorty);
		System.out.println(a.lags);
		System.out.println(a.ears);
		System.out.println(a.name);
		a.eat();
		a.sleep();
		a.walk();
	
	}
}
