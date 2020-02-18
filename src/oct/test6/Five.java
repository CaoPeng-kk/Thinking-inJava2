package oct.test6;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Five {

	public static void main(String[] args) {
		
		/*	π可以使用下面的数列进行计算：
			π=4×(1-1/3+1/5-1/7+1/9-1/11+⋯+〖(-1)〗^(i+1)/(2i-1))
			编写一个方法，对于给定的i返回m(i)，并且编写一个测试程序，显示如下表格：
			i			m(i)
			-------------------
			101		3.1515
			201		3.1466
			301		3.1449

		 * 
		 */
		System.out.println("i"+"\t"+"m(i)");
		DecimalFormat dec = new DecimalFormat("0.0000");
		for(int x=101;x<=901;x+=100) {
			double res = pi(x);
			System.out.println(x+"\t"+dec.format(res));
			
		}
		
	}

	public static double pi(int big) {
		Double add = 0d;
		Double sum = 0d;
		for(int count=1;count<=big;count++) {
			add = (Math.pow(-1, count+1))/(2.0*count-1);
			sum+=add;
		}
		return sum*4;
	}

}
