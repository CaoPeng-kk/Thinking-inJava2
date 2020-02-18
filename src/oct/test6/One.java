package oct.test6;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {

		/*
		 * 1、	编写一个方法，计算一个整数各位数字之和。使用下面的方法头：
				public static int sumDigits(long n)
				编写程序提示用户输入一个整数，然后显示这个整数所有数字的和
				例如：sumDigits(234)返回9（9=2+3+4）。
				提示：使用求余操作%提取数字，用除号/去掉提取出来的数字。
				例如：使用234%10（=4）提取4，然后使用234/10（=23）从234中去掉4。
				使用一个循环来反复提取和去掉每位数字，直到所有的位数都提取完为止。


		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数");
		Long num = input.nextLong();
		
		int res = sumDigits(num);
		System.out.println("整数和为"+res);
		
	}

	public static int sumDigits(long n) {
		int len = String.valueOf(n).length();
		int sum = 0;
		int one = 0;
		int last = (int) n;
		for(int i=0;i<len;i++) {
			one =  (int) (last%10);
			last = (int) (last/10);
			sum+=one;
		}
		return sum;
		
	}

}
