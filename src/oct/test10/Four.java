package oct.test10;

import java.util.ArrayList;
import java.util.Collections;

public class Four {

	public static void main(String[] args) {

		/*4��	��д���·�������һ����ֵ��ArrayList��������
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
