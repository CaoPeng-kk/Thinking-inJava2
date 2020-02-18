package oct.test7;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {

		/*3、	使用下面的方法头编写两个重载的方法，返回数组的平均数：
				public static int average(int[] array)
				public static double average(double[] array)
				编写一个测试程序，提示用户输入10个double型值，然后调用这个方法显示平均值。

		 * 
		 */
		System.out.println("请输入10个double类型的数值");
		Scanner input = new Scanner(System.in);
		double[] dou = new double[10];
		for(int i=0;i<dou.length;i++) {
			dou[i] = input.nextDouble();
			
		}
		double res = average(dou);
		System.out.println(res);
		
}
		
		public static int average(int[] array) {
			return 0;
			
		}
		public static double average(double[] array) {
			double sum = 0d;
			for(int x=0;x<array.length;x++) {
				sum+=array[x];
			}
			double average = sum/10.0;
			return average;
		}
		
		
}
 
