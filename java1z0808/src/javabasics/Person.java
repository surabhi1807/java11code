package javabasics;

public class Person {
String name = "priya";
int age=24;
String city ="andhra";
String gender ="female";
void eat() {System.out.println("Person can eat");}
void sleep() {System.out.println("Person can sleep");}
void walk() {System.out.println("Person can walk");}
public static void main(String[] args) {
	Person p =new Person();
	System.out.println(p.name);
	System.out.println(p.age);
	System.out.println(p.city);
	System.out.println(p.gender);
	p.eat();
	p.sleep();
	p.walk();
	
}
}
