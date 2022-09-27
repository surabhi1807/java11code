package javabasics;
/**
 * 1. static things will load first
 * static variable, static blocks (FCFS);
 * 2.Instance things will get memory at the time of object creation.
 *  Instance variable or Instance block will be executed on the basic of FCFS.
 * then constructor will be execute
 * 
 */
public class ExeuctionOrder {
	int ab;
	int cd;
	static int ef;
	static int gh;
	{
		System.out.println("Istance block ab");
	}
     static {System.out.println("static block gh");}
     int a = m1();
     int b;
     static int c;
     static int	d = m2();
     {
    	System.out.println("Instance block 1"); 
     }
     static {System.out.println("static block 1");
     

}
	private static int m2() {
		return 0;
	}
	private int m1() {
		return 0;
	}
}
