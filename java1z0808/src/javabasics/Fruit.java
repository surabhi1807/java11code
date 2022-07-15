package javabasics;

public class Fruit {
	String category ="apple";
	String color = "red";
	int weight =1;
	String taste = "Sweet";
	void sweet() {System.out.println("Fruit can sweet");}
	void healthy() {System.out.println("Fruit can healty");}
	void testy() {System.out.println("Fruit can testy");}
	// purpose of main method:to test the code
	public static void main(String[] args) {
	 // create an object
		Fruit f= new Fruit(); 
		// to print on the console
		System.out.println(f.category);	
		System.out.println(f.color);
		System.out.println(f.taste);
		System.out.println(f.weight);
		f.sweet();
		f.healthy();
		f.testy();
	
	}

}
