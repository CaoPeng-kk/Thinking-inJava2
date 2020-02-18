package oct.test6;

import java.util.Scanner;

public class Six_2 {

	public static void main(String[] args) {
		
		System.out.println("ÇëÊäÈëÃÜÂë");
		Scanner input = new Scanner(System.in);
		String password = input.next();
		rule(password);
		
	}
		
		public static int length(String str) {
			int count = 0 ;
			for(int i = 0;i<str.length();i++) {
				if(Character.isDigit(str.charAt(i))) {
					count++;
				}
			}return count;
		}
		public static boolean contains(String str) {
			boolean pw = false;
			for(int i = 0;i<str.length();i++) {
				if(Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))) {
					pw = true;
				}else {
					pw = false;
					break;
				}
			}return pw;
			
		}
		public static void rule(String str) {
			if(length(str)>= 2 && str.length()>=8 && contains(str)) {
				System.out.println("Valid Password");
			}else {
				System.out.println("Invalid Password");
			}
		}
	
}

