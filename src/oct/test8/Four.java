package oct.test8;

import java.util.Arrays;
import java.util.Scanner;

public class Four {

	public static void main(String[] args) {

		/*	������ķ���ʵ��һ����ά�����е�������
			public static double[ ] [ ] sortColumns(double[ ] [ ] m)
			��дһ�����Գ�����ʾ�û�����һ��3��3������ʾһ���µ�ÿ���ź���ľ���

		 * 
		 * 
		 */
		double[][] a = new double[3][3];
		System.out.println("�������һ��3x3�ľ���");
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
		for(int j=0;j<N;j++)//��ÿһ�н����������� 
	    {
	       //�Ե�j�н������� 
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


