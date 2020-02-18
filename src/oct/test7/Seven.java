package oct.test7;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {

		/*7、	使用冒泡排序算法编写一个排序方法。
		 * 冒泡排序算法遍历数组几次，在每次遍历中，对相邻的两个元素进行比较。
		 * 如果这一对元素是降序，则交换它们的值；否则，保持不变。由于较小的值像气泡一样逐渐“浮向”顶部，
		 * 同时较大的值“沉向”底部，所以，这种技术称为冒泡排序法。
		 * 编写一个程序，读取10个double型的值，调用这个方法，然后显示排好序的数字。
		 * 
		 */
		System.out.println("请输入10个double类型的数");
		Scanner input = new Scanner(System.in);
		double[] dou = new double[10];
		for(int i=0;i<dou.length;i++) {
			dou[i] = input.nextDouble();
			
		}
		double[] res = sort(dou);
		for(double s : res) {
			System.out.print(s+" ");
		}
	}

	public static double[] sort(double[] array) {
		for(int x=1;x<array.length;x++) {
			for(int y=0;y<array.length-1;y++) {
				if(array[y]>array[y+1]) {
					double temp = array[y];
					array[y] = array[y+1];
					array[y+1] = temp;				
					}
			}
		}
		return array;
		
	}
	

}
