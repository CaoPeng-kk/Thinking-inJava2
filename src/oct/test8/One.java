package oct.test8;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {

		/* 	��д����������ӵķ���������ͷ���£�
			public static double[ ][ ] addMatrix(double[ ][ ] a, double[ ][ ] b)
			Ϊ���ܹ�������ӣ�����������������ͬ��ά����
			����Ԫ�ؾ�����ͬ����ݵ��������͡�����c��ʾ��ӵĽ������ÿ��Ԫ��cij=aij+bij
			��дһ�����Գ�����ʾ�û���������3��3����Ȼ����ʾ���ǵĺ͡�

		 * 
		 */
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		System.out.println("�������һ��3x3�ľ���");
		Scanner input = new Scanner(System.in);
		for(int x=0;x<a.length;x++) {
			for(int y=0;y<3;y++) {
				a[x][y] = input.nextDouble();
			}
		}
		System.out.println("������ڶ���3x3�ľ���");
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
