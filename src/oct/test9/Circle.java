package oct.test9;

public class Circle {

	private double R = 0;
	private static double PI = 3.14;
	
	
//	public static double getR() {
//		return R;
//	}
//
//	public static void setR(double r) {
//		R = r;
//	}

	public Circle(double R) {
		this.R = R;
	}
	double getlength(){
		return R;
	}
	double getArea(){
		return PI*R*R;
	}
	public double getPerimeter(){
		return 2*PI*R;
	}
	public static void main(String[] args) {
		Circle a = new Circle(5);
		Circle b = new Circle(10);
		
		System.out.println("circle1�뾶Ϊ"+a.getlength());
		System.out.println("circle2�뾶Ϊ"+b.getlength());
		System.out.println("circle1���Ϊ"+a.getArea());
		System.out.println("circle2�ܳ�Ϊ"+a.getPerimeter());
		System.out.println("circle1���Ϊ"+b.getArea());
		System.out.println("circle2�ܳ�Ϊ"+b.getPerimeter());
		
		
	}
}
