package oct.test10;

public class Person {
	
	public String name = "CP";
	public String address = "湖北工业大学";
	public int phonenumber = 123;
	public String email = "@123";
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phonenumber=" + phonenumber + ", email=" + email
				+ "]";
	}
	
	
	
}
