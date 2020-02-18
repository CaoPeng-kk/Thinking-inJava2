package oct.test8;

import java.util.Arrays;
import java.util.Scanner;

public class Four {

	public static void main(String[] args) {

		/*	用下面的方法实现一个二维数组中的列排序，
			public static double[ ] [ ] sortColumns(double[ ] [ ] m)
			编写一个测试程序，提示用户输入一个3×3矩阵，显示一个新的每列排好序的矩阵

		 * 
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
		int N=3,M=3;
		for(int j=0;j<N;j++)//对每一列进行升序排序 
	    {
	       //对第j列进行排序 
	       int m,n;
	       int t;
	       for(m=M-1;m>0;m--)
	       {
	            for(n=0;n<m;n++)
	            {
	                  if(array[n][j]>array[n+1][j])
	                  {
	                      t=(int) array[n][j];
	                      array[n][j]=array[n+1][j];
	                      array[n+1][j]=t;
	                  }
	            } 
	       } 
	    } 	
		return array;
	}
}


