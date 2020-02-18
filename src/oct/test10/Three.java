package oct.test10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Three {

	public static void main(String[] args) {

		/*3、	编写以下方法，打乱一个整数ArrayList中的元素。
			public static void shuffle(ArrayList<Integer> list)


		 * 
		 */
		Integer a = 2;
		Integer b = 4;
		Integer c = 6;
		Integer d = 8;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		shuffle(list);
		
	}
	public static void shuffle(ArrayList<Integer> list) {
		Collections.shuffle(list);
		System.out.println(list);
	}

}
