package oct.test7;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {

		/*3��	ʹ������ķ���ͷ��д�������صķ��������������ƽ������
				public static int average(int[] array)
				public static double average(double[] array)
				��дһ�����Գ�����ʾ�û�����10��double��ֵ��Ȼ��������������ʾƽ��ֵ��

		 * 
		 */
		System.out.println("������10��double���͵���ֵ");
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
 
