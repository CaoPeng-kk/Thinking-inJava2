package oct.test7;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		
		/*1��	��д���򣬶�ȡ10��������Ȼ���պͶ���˳���෴��˳��������ʾ������
		 * 
		 */
		System.out.println("������10������");
		Scanner input = new Scanner(System.in);
//		StringBuffer str = new StringBuffer();
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
//			if(input.hasNextInt()) {
				arr[i] = input.nextInt();
//			}
		}
		for(int x=9;x>=0;x--) {
			
			System.out.print(arr[x]+" ");
		}
	}

}
