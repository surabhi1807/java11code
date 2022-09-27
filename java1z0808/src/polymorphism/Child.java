package polymorphism;

public class Child extends Parent {
	private String name;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public int getSalary() {
		return 0;
	}
//	@Override
//	public  String getCar() {
//		return "Honda";
//	}
// @Override
// public  int getPocketMoney() {
//	 return 500;
// }
	@Override
	public final String getBike() {
		return "Activa";
	}
	
//	public static String getSurname() {
//		return "Singh";
//	}
	public static void m1() {
		
	}
}
