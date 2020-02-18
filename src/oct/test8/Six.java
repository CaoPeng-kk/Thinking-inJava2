package oct.test8;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {

		/*	一个n×n的矩阵，如果每个元素都是正数，且每列的元素的和为1，
		 * 则称为马尔可夫矩阵。编写下面的方法来检测一个矩阵是否是马尔可夫矩阵，
		public static Boolean isMarkovMatrix(double[ ] [ ])
		编写一个测试程序，提示用户输入一个3×3矩阵，测试它是否是马尔可夫矩阵。

		 * 
		 * 
		 */
		System.out.println("请输入一个3x3的矩阵");
		Scanner input = new Scanner(System.in);
		double[][] dou = new double[3][3];
		for(int x=0;x<dou.length;x++) {
			for(int y=0;y<dou.length;y++) {
				dou[x][y] = input.nextDouble();
				
			}
		}
		
		System.out.println(isMarkovMatrix(dou));
		
		
		
	}
	public static Boolean isMarkovMatrix(double[][] array) {
		int l=0,m=1,n=2;
		int count = 0;
		for(int x=0;x<array.length;x++) {
			if(array[l][x]+array[m][x]+array[n][x]==1.0) {
				count++;
			}
		}
		if(count==3) {
			return true;
		}
		return false;
		
	}

}
