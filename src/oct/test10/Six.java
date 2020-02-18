package oct.test10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Six {

	public static void main(String[] args) {

		/*6、	使用下面的方法头编写一个方法，从一个整数的数组列表中去掉重复元素。
		public static void removeDuplicate(ArrayList<Integer> list)
		编写测试程序，提示用户输入10个整数，以输入的顺序显示其中不同的整数，并以空格分隔的方式来进行显示。

		 * 
		 */
		System.out.println("请输入10个整数");
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		while(count<10){
			count++;
			Integer a = input.nextInt();
            list.add(a);
        }
		System.out.println(list);
		removeDuplicate(list);
	}
	public static void removeDuplicate(ArrayList<Integer> list) {
		HashSet<Integer> hash = new HashSet<Integer>();
		for(int x=0;x<list.size();x++) {
			hash.add(list.get(x));
		}
		System.out.println(hash);
		
		}
		
	}

