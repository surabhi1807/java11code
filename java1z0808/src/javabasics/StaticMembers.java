package javabasics;

public class StaticMembers {
	static int a;
	static int b;

	static void m1() {
		System.out.println("m1");
	}

	static void m2() {
		System.out.println("m2");
	}
public static void main(String[] args) {
	System.out.println(StaticMembers.a);
	System.out.println(StaticMembers.b);
//	System.out.println(StaticMembers.m1());
	StaticMembers.m1();
	StaticMembers.m2();
}
}
