package oct.test10;

public class Staff extends Employee{

	public String called = "me";

	

	public Staff() {
		super();
	}



	@Override
	public String toString() {
		return "Staff [called=" + called + "]";
	}
	
}
