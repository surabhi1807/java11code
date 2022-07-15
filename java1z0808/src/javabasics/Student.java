package javabasics;

public class Student {
	String name = "surabhi";
	int age =23;
	String college = "sirt";
	String city = "bhopal";
	void eat(){System.out.println("Student can eat");}
	void sleep (){System.out.println("Student can sleep");}
	void walk (){System .out.println("Student can walk");}

	public static void main(String[] args) {
		Student s =new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.college);
		System.out.println(s.city);
// acces methods of a class.
		s.eat();
		s.sleep();
		s.walk();
	
	}

}
