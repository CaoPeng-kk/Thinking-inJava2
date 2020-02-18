package oct.test7;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {

		/*4、	使用下面的方法头编写一个方法，求出一个整数数组中的最小元素：
			public static double min(double[] array)
			编写测试程序，提示用户输入十个数字，调用这个方法返回最小值，并显示该最小值。


		 * 
		 */
		System.out.println("请输入10个数字");
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
