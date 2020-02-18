package oct.test9;

import java.util.Random;

public class Five {

	public static void main(String[] args) {

		/*
		 * 5、	使用java.util.Random类，编写一个程序，
		 * 创建一个种子（以一个特定值作为种子创建一个Random对象）为1000的Random对象，
		 * 然后使用nextInt(100)方法显示0到100之间前50个随机整数。
		 */
		
		Random ran = new Random(1000);
		for(int i=1;i<=50;i++) {
			if(i%10==0) {
				System.out.println(ran.nextInt(100));
			}else {
				System.out.print(ran.nextInt(100)+" ");
			}
			
		}
		
	}

}
