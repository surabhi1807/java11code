package inheritance;

public class Child2 extends Parent {
	public Child2() {
		super();
	}
	private String name;
	private String email;
	private String bike;
	public Child2(String name, String surname, int phone, String address, String name2, String email, String bike) {
		super(name, surname, phone, address);
		name = name2;
		this.email = email;
		this.bike = bike;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBike() {
		return bike;
	}
	public void setBike(String bike) {
		this.bike = bike;
	}
	

}
