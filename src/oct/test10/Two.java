package oct.test10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Two {

	public static void main(String[] args) {

		/*2��	��д���·���������һ������ArrayList�����ֵ��
			public static Integer max(ArrayList<Integer> list)
			��дһ�����Գ�����ʾ�û�����һ����0��β����ֵ���У����ø÷�����������������ֵ��

		 * 
		 */
		System.out.println("��������0��β����ֵ����");
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
		System.out.println("��������="+max(list));
		
	}
	public static Integer max(ArrayList<Integer> list) {
		Integer max = Collections.max(list);
		return max;
		
	}
}
