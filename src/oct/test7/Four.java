package oct.test7;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {

		/*4��	ʹ������ķ���ͷ��дһ�����������һ�����������е���СԪ�أ�
			public static double min(double[] array)
			��д���Գ�����ʾ�û�����ʮ�����֣������������������Сֵ������ʾ����Сֵ��


		 * 
		 */
		System.out.println("������10������");
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = input.nextInt();
		}
		
		double average = min(arr);
		System.out.println(average);
		
		
		
		
	}

	public static double min(int[] array) {
		for(int x=0;x<array.length;x++) {
			for(int y=x+1;y<array.length;y++) {
				if (array[y] < array[x]) {
					int temp = array[x];
					array[x] = array[y];
					array[y] = temp;
				}
 			}
		}
		return array[0];
	}

}
