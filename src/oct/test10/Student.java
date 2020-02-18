package oct.test10;

public class Student extends Person{

	public String grade1 = "大一";
	public String grade2 = "大二";
	public String grade3 = "大三";
	public String grade4 = "大四";
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [grade1=" + grade1 + ", grade2=" + grade2 + ", grade3=" + grade3 + ", grade4=" + grade4 + "]";
	}
	
	
}
