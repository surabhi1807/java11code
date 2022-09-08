package inheritance;

public class Child1 extends Parent {
	private String name;
	private int totalmarks;
	private String email;

	

	public Child1(String name, String surname, int phone, String address) {
		super(name, surname, phone, address);
	}
	
public Child1( String name, int totalmarks,	String email) {
		this.name = name;
		this.totalmarks = totalmarks;
		this.email = email;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
