package oct.test10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Five {

	public static void main(String[] args) {
		
		/*5、	编写以下方法，返回ArrayList中所有数字的和。
			public static double sum(ArrayList<Double> list)

		 * 
		 */
		Double a = (double) 5;
		Double b = (double) 3;
		Double c = (double) 9;
		Double d = (double) 1;
		
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		double sumnum = sum(list);
		System.out.println(sumnum);
	}
	public static double sum(ArrayList<Double> list) {
		double sum = 0d;
		for(int i=0;i<list.size();i++) {
			sum += list.get(i);
			
		}
		return sum;
		
	}
}
