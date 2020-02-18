package oct.test7;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {

		/*5、编写一个方法，求出整数数组中最小元素的下标。如果这样的元素个数多于1个，
		 * 则返回最小的下标。使用下面的方法头：
			public static int indexOfSmallestElement(double[] array)
			编写一个测试程序，提示用户输入10个数字，调用这个方法，返回最小元素的下标，然后显示这个下标值。

		 *
		 */
		System.out.println("请输入10个数字");
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
		int min = array[0]; //定义一个最小值
		for(int x=0;x<array.length;x++) {
				if (array[x] < min) {
					min = array[x]  ;// 交换
					index = x; //将最小角标传给index
					
				}
			
		}
		return index;
	}
}
