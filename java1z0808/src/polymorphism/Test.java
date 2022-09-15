package polymorphism;

public class Test {
	public static void main(String[] args) {
		Animal doggy =new Dog();
	     Human   obj = new Human();
		 Snake   s =new Snake();
		System.out.println(doggy.getName());
		doggy.message();
		System.out.println(obj.getName());
		obj.message();
		System.out.println(s.getName());
		s.message();
	}

}
