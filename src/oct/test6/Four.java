package oct.test6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Four {

	public static void main(String[] args) {

		/*	��д����������϶Ⱥͻ��϶�֮���ת�����������������������
    		public static double celsiusToFahrenheit(double celsius)
			public static double fahrenheitToCelsius (double fahrenheit)
			ת����ʽ���£�
			���϶�=9.0/5�����϶�+32
			���϶�=5.0/9�������϶�-32��
			��дһ�����Գ��򣬵�����������������ʾ���±��
			���϶�		���϶�			���϶�		���϶�
			------------------------------------------------
			40.0			104.0			120.0		48.89
			39.0			102.2			110.0		43.33
��
			31.0			87.8				30.0			-1.11
		 */
		System.out.println("���϶�"+"\t"+"���϶�"+"\t"+"���϶�"+"\t"+"���϶�");
		DecimalFormat deci = new DecimalFormat("0.0");
		double[] fahh = new double[20];
		double[] cel = new double[20];
		int p=0,z=0 ;
		for(double x=120;x>=30;x-=10) {
			fahh[p++] = x;
			double c = fahrenheitToCelsius(x);
			cel[z++] = c;
					
		}
		int y = 0,w=0;
		for(double i=40;i>=31;i--) {
			double fah = celsiusToFahrenheit(i);
			System.out.println(i+"\t"+deci.format(fah)+"\t"+deci.format(fahh[y++])+"\t"+deci.format(cel[w++]));
		}
		
	}

	public static double fahrenheitToCelsius(double a) {
		return 5.0/9.0*(a-32);
	}

	public static double celsiusToFahrenheit(double a) {
		return (9.0/5*a+32);
		
	}

}
