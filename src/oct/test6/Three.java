package oct.test6;

import java.util.Arrays;
import java.util.Scanner;

public class Three {

	public static void main(String[] args) {

		/*3��	��������ʾ��������ʹ������ķ���ͷ��д������
			public static void displaySortedNumbers(double num1,double num2,double num3)
			��д���Գ�����ʾ�û������������֣����÷�����������ʾ���ǡ�

		 * 
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("��������������     �ÿո�ֿ�");
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
