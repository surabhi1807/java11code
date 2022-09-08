package inheritance;

public class TestInheritance {
	public static void main(String[] args) {
		Child1 c1 = new Child1("Ghanshyam", "Singh", 123, "Bihar");
		c1.setName("Surabhi");
		c1.setEmail("abc@gmail.com");
		c1.setTotalmarks(300);
		System.out.println(c1.getName()+" "+c1.getSurname()+ " "+ c1.getEmail()+" "+ c1.getPhone()+ " "+c1.getAddress());
	}

}
