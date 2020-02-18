package oct.test9;

public class Rectangle {
	
	
	/*2、	设计一个名为Rectangle的类表示矩形，两个名为width和height的double类型数据域，
		 * 它们分别表示矩形的宽和高，width和height的默认值都为1。包含一个名为getArea()的方法，
		 * 返回矩形的面积，一个名为getPerimeter()的方法，返回周长。编写一个测试程序，
		 * 创建两个Rectangle对象，一个矩形对象宽为4高为40，
		 * 另一个矩形对象宽为3.5高为35.9，按照顺序显示每个矩形的宽、高、面积和周长。
	 * 
	 */
	private double width = 1;
	private double height = 1;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	double getArea() {
		return width*height;
	}
	double getPerimeter() {
		return (2*width)+(2*height);
	}
	public static void main(String[] args) {
		Rectangle c = new Rectangle(4, 40);
		Rectangle d = new Rectangle(3.5, 35.9);
		System.out.println("矩形c的宽"+c.getWidth());
		System.out.println("矩形c的高"+c.getHeight());
		System.out.println("矩形d的宽"+d.getWidth());
		System.out.println("矩形d的高"+d.getHeight());
		System.out.println("矩形c的周长"+c.getPerimeter());
		System.out.println("矩形c的面积"+c.getArea());
		System.out.println("矩形d的周长"+d.getPerimeter());
		System.out.println("矩形d的面积"+d.getArea());
	}
}
