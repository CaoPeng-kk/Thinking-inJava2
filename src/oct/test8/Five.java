package oct.test8;

import java.util.Random;

public class Five {

	public static void main(String[] args) {

		/*	编写一个程序，产生一个6×6的填满0和1的二维矩阵，
		 * 显示该矩阵，检测是否每行以及每列中有偶数个1。
		 * 
		 */
		Random ran = new Random();
		int[][] arr = new int[6][6];
		int sum = 0;
		for(int x=0;x<arr.length;x++) {
			for(int y=0;y<arr[x].length;y++) {
				arr[x][y] = ran.nextInt(2);
//				if(arr[x][y]==1) {
//					count++;
			}
		}
		for(int x=0;x<arr.length;x++) {
			for(int y=0;y<arr[x].length;y++) {
				sum=sum+arr[x][y];
				if(y==5) {
					if(sum%2==0) {
						System.out.println(arr[x][y]+" "+"是"); 
					}else
						System.out.println(arr[x][y]+" "+"否"); 
				}else {
					System.out.print(arr[x][y]+" "); 
				}
			}
			sum = 0;
		}
		
		
		
		
	}

}
