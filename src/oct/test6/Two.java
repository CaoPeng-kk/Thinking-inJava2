package oct.test6;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {

		/*2��	������ʾһ��������ʹ������ķ���ͷ��д������
				public static void reverse(int number)
				���磺reverse(3456)����6543����дһ�����Գ�����ʾ�û�����һ��������Ȼ����ʾ���ķ�������
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int num = input.nextInt();
		
		reverse(num);
		
		
	}
	public static void reverse(int num) {
		StringBuffer str = new StringBuffer();
		str.append(num);
		StringBuffer s = str.reverse();
		System.out.println(s.toString());
		
	}

}
