package oct.test9;

import java.util.Scanner;

public class LinearEquation {

	/*这个类包括：
	私有数据域a、b、c、d、e和f
	一个参数为a、b、c、d、e、f的构造方法
	a、b、c、d、e、f的六个获取方法
	一个名为isSolvable()的方法，如果ad-bc不为0则返回true
	方法getX()和getY()返回这个方程的解
	编写一个测试程序，提示用户输入a、b、c、d、e、f的值，然后显示结果。
	如果ad-bc为0，就报告“the equation has no solution”。

	 * 
	 */
		private double a = 0d;
		private double b = 0d;
		private double c = 0d;
		private double d = 0d;
		private double e = 0d;
		private double f = 0d;
		public LinearEquation(double a, double b, double c, double d, double e, double f) {
			super();
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
			this.e = e;
			this.f = f;
		}
		public double getA() {
			return a;
		}
		public double getB() {
			return b;
		}
		public double getC() {
			return c;
		}
		public double getD() {
			return d;
		}
		public double getE() {
			return e;
		}
		public double getF() {
			return f;
		}
		
		public boolean isSolvable(double a,double b,double c,double d){
			if((a*d-b*c)!=0) {
				return true;
			}
			return false;
			
		}
		
		public double getX() {
			if(!isSolvable(a, b, c, d)) {
				System.out.println("the equation has no solution");
				return 0;
				
			}else {
				return (e*d-b*f)/(a*d-b*c);
			}
			
			
		}
		
		public double getY() {
			if(!isSolvable(a, b, c, d)) {
				System.out.println("the equation has no solution");
				return 0;
			}else {
				return (a*f-e*c)/(a*d-b*c);
			}
		}
		public static void main(String[] args) {
			
			System.out.println("请输入a,b,c,d,e,f的值");
			Scanner input = new Scanner(System.in);
			double[] dou = new double[6];
			for(int i=0;i<dou.length;i++) {
				dou[i] = input.nextDouble();
			}
			
			LinearEquation lin = new LinearEquation(dou[0], dou[1], dou[2], dou[3], dou[4], dou[5]);
			double X = lin.getX();
			double Y = lin.getY();
			System.out.println(X+","+Y);
			
		}
	
}
