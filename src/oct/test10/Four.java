package oct.test10;

import java.util.ArrayList;
import java.util.Collections;

public class Four {

	public static void main(String[] args) {

		/*4、	编写以下方法，对一个数值的ArrayList进行排序。
			public static void sort(ArrayList<Integer> list)

		 * 
		 */
		
		Integer a = 5;
		Integer b = 3;
		Integer c = 9;
		Integer d = 1;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		sort(list);;
		
	}
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
		System.out.println(list);
	}

}
