package oct.test10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Two {

	public static void main(String[] args) {

		/*2、	编写以下方法，返回一个整数ArrayList的最大值。
			public static Integer max(ArrayList<Integer> list)
			编写一个测试程序，提示用户输入一个以0结尾的数值序列，调用该方法返回输入的最大数值。

		 * 
		 */
		System.out.println("请输入以0结尾的数值序列");
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true){
			Integer a = input.nextInt();
			if(a==0) {
				break;
			}
            list.add(a);
        }
		max(list);
//		Iterator<Integer> it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		System.out.println("最大的数是="+max(list));
		
	}
	public static Integer max(ArrayList<Integer> list) {
		Integer max = Collections.max(list);
		return max;
		
	}
}
