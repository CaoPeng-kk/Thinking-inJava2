package oct.test8;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {

		/* 	编写两个矩阵相加的方法，方法头如下：
			public static double[ ][ ] addMatrix(double[ ][ ] a, double[ ][ ] b)
			为了能够进行相加，两个矩阵必须具有相同的维数，
			并且元素具有相同或兼容的数据类型。假设c表示相加的结果矩阵，每个元素cij=aij+bij
			编写一个测试程序，提示用户输入两个3×3矩阵，然后显示它们的和。

		 * 
		 */
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		System.out.println("请输入第一个3x3的矩阵");
		Scanner input = new Scanner(System.in);
		for(int x=0;x<a.length;x++) {
			for(int y=0;y<3;y++) {
				a[x][y] = input.nextDouble();
			}
		}
		System.out.println("请输入第二个3x3的矩阵");
		for(int m=0;m<b.length;m++) {
			for(int n=0;n<3;n++) {
				b[m][n] = input.nextDouble();
				
			}
		}
		double[][] d = addMatrix(a, b);
		for(int g=0;g<d.length;g++) {
			for(int f=0;f<d[g].length;f++) {
				if(f==2) {
					System.out.println(d[g][f]+" ");
				}else
					System.out.print(d[g][f]+" ");
			}
		}
	}
	public static double[][] addMatrix(double[][] a,double[][]b) {
		double[][] c = new double[3][3];
		for(int p=0;p<c.length;p++) {
			for(int q=0;q<c.length;q++) {
				c[p][q] = a[p][q]+b[p][q];
			}
		}
		return c;
		
	}

}
