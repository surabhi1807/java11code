package polymorphism;

public class Parent {
	private String name;
	public String surname;
	private int salary;
	private String car;
	private static  int pocketMoney;
	private String bike;
	public Parent() {
		System.out.println("This is Parent class");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	protected int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public final String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public static int getPocketMoney() {
		return pocketMoney;
	}
	public  void setPocketMoney(int pocketMoney) {
		this.pocketMoney = pocketMoney;
	}
	public String getBike() {
		return bike;
	}
	public void setBike(String bike) {
		this.bike = bike;
	}
	
	

}
