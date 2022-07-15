package javabasics;

public class Phone {
String name ="iphone";
String brand = "apple";
String colour ="black";
int wieght = 100;
void camera() {System.out.println("Phone can camera");}
void videocall() {System.out.println("Phone can videocall");}
void callerid() {System.out.println("Phone can callerid");}
 public static void main(String[] args) {
	Phone p =new Phone();
	System.out.println(p.brand);
	System.out.println(p.colour);
	System.out.println(p.name);
	System.out.println(p.wieght);
	p.camera();
	p.videocall();
	p.callerid();
	
	
}
}
