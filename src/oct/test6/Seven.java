package oct.test6;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {

		/*
		 * 7、	三角形实现以下两个方法：
			public static boolean isValid(double a, double b, double c)
			public static double area(double a, double b, double c)
			编写一个测试程序，读入三角形三条边的值，使用isValid方法检测输入是否有效，
			并使用area方法计算面积。如果输入有效，则显示面积，否则显示输入无效。

		 */
		System.out.println("请输入三条边的值");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		
		if(isValid(a,b,c)) {
			System.out.println("三角形面积为："+area(a,b,c));
		}else {
			System.out.println("输入无效");
		}
	}

	public static double area(double a, double b, double c) {
		double s = (a+b+c)/2.0;
		double sumarea = Math.pow(s*(s-a)*(s-b)*(s-c), 0.5);
		return sumarea;
		
	}

	public static boolean isValid(double a, double b, double c) {
		if(a+b>c&&a+c>b&&b+c>a) {
			if(a-c<b&&a-b<b&&b-c<a) {
				return true;
			}
		}
		return false;
	}

}
