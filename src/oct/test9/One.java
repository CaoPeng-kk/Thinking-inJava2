package oct.test9;

public class One {

	public static void main(String[] args) {

		/*1、	设计一个名为Circle的类表示圆，数据域为半径，包含一个名为getArea()的方法，
		 * 返回圆的面积，一个名为getPerimeter()的方法，返回周长。编写一个测试程序，
		 * 创建两个Circle对象，一个半径为5，一个半径为10，按照顺序显示每个圆的半径、面积和周长。
		 * 
		 */
		Circle a = new Circle(5);
		Circle b = new Circle(10);
		
		System.out.println("circle1面积为"+a.getlength());
		System.out.println("circle2周长为"+b.getlength());
		System.out.println("circle1面积为"+a.getArea());
		System.out.println("circle2周长为"+a.getPerimeter());
		System.out.println("circle1面积为"+b.getArea());
		System.out.println("circle2周长为"+b.getPerimeter());
		
		
	}

}
