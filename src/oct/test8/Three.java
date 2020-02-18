package oct.test8;

import java.util.Arrays;
import java.util.Scanner;

public class Three {

	public static void main(String[] args) {

		/*	用下面的方法实现一个二维数组中的行排序，
			public static double[ ] [ ] sortRows(double[ ] [ ] m)
			编写一个测试程序，提示用户输入一个3×3矩阵，显示一个新的每行排好序的矩阵。

		 * 
		 */
		double[][] a = new double[3][3];
		System.out.println("请输入第一个3x3的矩阵");
		Scanner input = new Scanner(System.in);
		for(int x=0;x<a.length;x++) {
			for(int y=0;y<3;y++) {
				a[x][y] = input.nextDouble();
			}
		}
		
		
		double[][] d = sortRows(a);
		for(int g=0;g<d.length;g++) {
			for(int f=0;f<d[g].length;f++) {
				if(f==2) {
					System.out.println(d[g][f]+" ");
				}else
					System.out.print(d[g][f]+" ");
			}
		}
	}

	public static double[][] sortRows(double[][] array) {
		double[] a1 = new double[3];
		double[] a2 = new double[3];
		double[] a3 = new double[3];
		int x=0,m=1,n=2; 
			for(int y=0;y<array.length;y++) {
				a1[y] = (int) array[x][y];	
				a2[y] = (int) array[m][y];
				a3[y] = (int) array[n][y];
//				System.out.print(a1[y]+" ");
//				System.out.print(a2[y]+" ");
//				System.out.print(a3[y]+" ");
				}
				
				
		Arrays.sort(a1);
		Arrays.sort(a2);
		Arrays.sort(a3);
		array = new double[][] {a1,a2,a3};	
		return array;
	}

}
