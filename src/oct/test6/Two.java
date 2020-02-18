package oct.test6;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {

		/*2、	反序显示一个整数，使用下面的方法头编写方法：
				public static void reverse(int number)
				例如：reverse(3456)返回6543。编写一个测试程序，提示用户输入一个整数，然后显示它的反序数。
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数");
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
