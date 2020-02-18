package oct.test6;

import java.util.Arrays;
import java.util.Scanner;

public class Three {

	public static void main(String[] args) {

		/*3、	按升序显示三个数，使用下面的方法头编写方法：
			public static void displaySortedNumbers(double num1,double num2,double num3)
			编写测试程序，提示用户输入三个数字，调用方法以升序显示它们。

		 * 
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三个数字     用空格分开");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		 
		displaySortedNumber(a,b,c);
		
		
	}

	public static void displaySortedNumber(double a, double b, double c) {
		double[] dou = {a,b,c};
		Arrays.sort(dou);
		for(int i=0;i<dou.length;i++) {
			System.out.print(dou[i]+" ");
		}
	}

}
