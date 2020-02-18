package oct.test6;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {

		/* 6、	一些网站对于密码具有一些规则，编写方法，检测字符串是否是一个有效密码，假定密码规则如下：
		密码必须至少8位字符
			密码仅能包含字符和数字
		密码必须包含至少两个数字
		编写一个程序，提示用户输入一个密码，如果符合规则，则显示Valid Password，否则显示Invalid Password。

		 * 
		 */
		System.out.println("请输入密码");
		Scanner input = new Scanner(System.in);
		String password = input.next();
		String regix = "[0-9a-zA-Z]";
//		String regix2 = "[a-zA-Z]";
		if (password.length() < 8) {
			System.out.println("密码长度必须在8位以上");
			
		} else {
			int count = 0;
			for (int i = 0; i < password.length(); i++) {
				char ch = password.charAt(i);
				String str = String.valueOf(ch);
					if(str.matches(regix)) {
						
						if (Character.isDigit(ch)) {
							count++;
						}
					}else {
						System.out.println("密码仅能包含字母和数字");
						return;
					}
				}
				
			if (count < 2) {
				System.out.println("密码必须包含两位数字");
			} else {
				System.out.println("密码正确");
			}
		}

	}
}

