package oct.test10;

import java.util.ArrayList;
import java.util.HashSet;

public class Seven {

	public static void main(String[] args) {

		/*7、	使用下面的方法头编写一个方法，返回两个数组列表的合集。
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
	例如，两个数组列表{2，3，1，5}和{3，4，6}的并集{2，3，1，5，3，4，6}。
	编写测试程序，提示用户输入两个列表，每个列表有5个整数，然后显示它们的并集。输出中，以一个空格进行分隔。

		 * 
		 */
		Integer a = 2,b=3,c=4,d=5,e=6,f=1;
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(a);
		list1.add(b);
		list1.add(f);
		list1.add(d);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(b);
		list2.add(c);
		list2.add(e);
		
		System.out.println(union(list1, list2));
		
		
	}
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
//		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.addAll(list1);
		list3.addAll(list2);
		return list3;
		
	}

}
