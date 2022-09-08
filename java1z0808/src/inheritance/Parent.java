package inheritance;

public class Parent {
	private String name ;
	private String surname;
	int phone;
	private String address;
	
	public Parent(String name, String surname, int phone, String address) {
		super();
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.address = address;
	}
	
	public Parent() {
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
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
