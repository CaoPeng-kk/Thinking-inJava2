package oct.test10;

import java.util.ArrayList;
import java.util.HashSet;

public class Seven {

	public static void main(String[] args) {

		/*7��	ʹ������ķ���ͷ��дһ���������������������б�ĺϼ���
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
	���磬���������б�{2��3��1��5}��{3��4��6}�Ĳ���{2��3��1��5��3��4��6}��
	��д���Գ�����ʾ�û����������б�ÿ���б���5��������Ȼ����ʾ���ǵĲ���������У���һ���ո���зָ���

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
