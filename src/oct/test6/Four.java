package oct.test6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Four {

	public static void main(String[] args) {

		/*	编写程序进行摄氏度和华氏度之间的转换，类包含下面两个方法：
    		public static double celsiusToFahrenheit(double celsius)
			public static double fahrenheitToCelsius (double fahrenheit)
			转换公式如下：
			华氏度=9.0/5×摄氏度+32
			摄氏度=5.0/9×（华氏度-32）
			编写一个测试程序，调用这两个方法来显示如下表格
			摄氏度		华氏度			华氏度		摄氏度
			------------------------------------------------
			40.0			104.0			120.0		48.89
			39.0			102.2			110.0		43.33
…
			31.0			87.8				30.0			-1.11
		 */
		System.out.println("摄氏度"+"\t"+"华氏度"+"\t"+"华氏度"+"\t"+"摄氏度");
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
