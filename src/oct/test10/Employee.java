package oct.test10;

public class Employee extends Person{

	public String office = "hbut";
	public int salary = 10000;
	public String date = "10.17";
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [office=" + office + ", salary=" + salary + ", date=" + date + "]";
	}
	
}
