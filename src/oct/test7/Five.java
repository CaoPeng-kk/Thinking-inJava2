package oct.test7;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {

		/*5����дһ�����������������������СԪ�ص��±ꡣ���������Ԫ�ظ�������1����
		 * �򷵻���С���±ꡣʹ������ķ���ͷ��
			public static int indexOfSmallestElement(double[] array)
			��дһ�����Գ�����ʾ�û�����10�����֣��������������������СԪ�ص��±꣬Ȼ����ʾ����±�ֵ��

		 *
		 */
		System.out.println("������10������");
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = input.nextInt();
		}
		int small = indexOfSmallesElement(arr);
		System.out.println(small);
	}

	public static int indexOfSmallesElement(int[] array) {
		int index = 0 ;
		int min = array[0]; //����һ����Сֵ
		for(int x=0;x<array.length;x++) {
				if (array[x] < min) {
					min = array[x]  ;// ����
					index = x; //����С�Ǳ괫��index
					
				}
			
		}
		return index;
	}
}
