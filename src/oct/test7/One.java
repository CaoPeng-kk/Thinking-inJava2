package oct.test7;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		
		/*1、	编写程序，读取10个整数，然后按照和读入顺序相反的顺序将它们显示出来。
		 * 
		 */
		System.out.println("请输入10个整数");
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
