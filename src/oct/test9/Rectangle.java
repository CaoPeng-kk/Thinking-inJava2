package oct.test9;

public class Rectangle {
	
	
	/*2��	���һ����ΪRectangle�����ʾ���Σ�������Ϊwidth��height��double����������
		 * ���Ƿֱ��ʾ���εĿ�͸ߣ�width��height��Ĭ��ֵ��Ϊ1������һ����ΪgetArea()�ķ�����
		 * ���ؾ��ε������һ����ΪgetPerimeter()�ķ����������ܳ�����дһ�����Գ���
		 * ��������Rectangle����һ�����ζ����Ϊ4��Ϊ40��
		 * ��һ�����ζ����Ϊ3.5��Ϊ35.9������˳����ʾÿ�����εĿ��ߡ�������ܳ���
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
		System.out.println("����c�Ŀ�"+c.getWidth());
		System.out.println("����c�ĸ�"+c.getHeight());
		System.out.println("����d�Ŀ�"+d.getWidth());
		System.out.println("����d�ĸ�"+d.getHeight());
		System.out.println("����c���ܳ�"+c.getPerimeter());
		System.out.println("����c�����"+c.getArea());
		System.out.println("����d���ܳ�"+d.getPerimeter());
		System.out.println("����d�����"+d.getArea());
	}
}
