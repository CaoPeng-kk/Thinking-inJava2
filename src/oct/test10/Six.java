package oct.test10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Six {

	public static void main(String[] args) {

		/*6��	ʹ������ķ���ͷ��дһ����������һ�������������б���ȥ���ظ�Ԫ�ء�
		public static void removeDuplicate(ArrayList<Integer> list)
		��д���Գ�����ʾ�û�����10���������������˳����ʾ���в�ͬ�����������Կո�ָ��ķ�ʽ��������ʾ��

		 * 
		 */
		System.out.println("������10������");
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

