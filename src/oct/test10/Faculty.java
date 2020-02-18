package oct.test10;

public class Faculty extends Employee{

	public String worktime = "08:00AM";
	public String level = "2";
	public Faculty() {
		super();
	}
	@Override
	public String toString() {
		return "Faculty [worktime=" + worktime + ", level=" + level + "]";
	}
	
}
