package oct.test8;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {

		/*	��д����������˵ķ���������ͷ���£�
			public static double[ ][ ] multiplyMatrix(double[ ][ ] a, double[ ][ ] b)
			Ϊ��ʹ����a�ܹ��;���b��ˣ�����a���������������b��������ͬ��
			����Ԫ�ؾ�����ͬ����ݵ��������͡�����c��ʾ��˵Ľ������a��������n��
			��ôÿ��Ԫ��cij=ai1��b1j+ ai2��b2j+��+ ain��bnj
			��дһ�����Գ�����ʾ�û���������3��3����Ȼ����ʾ���ǵĳ˻���

		 * 
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
		
		double[][] d = multiplyMatrix(a, b);
		for(int g=0;g<d.length;g++) {
			for(int f=0;f<d[g].length;f++) {
				if(f==2) {
					System.out.println(d[g][f]+" ");
				}else
					System.out.print(d[g][f]+" ");
			}
		}
		double sum = 0;
		for(int a1=0;a1<d.length;a1++) {
			for(int t=0;t<d[a1].length;t++) {
				sum+= d[a1][t];
				
			}
		}
//		System.out.println(sum);
		
		
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];
		int l=0,m=1,n=2;
		int sum1=0,sum2=0,sum3=0;
//		for(int p=0;p<c.length;p++) {
//				c[l][p] = a[l][p]*b[p][l];
//				c[m][p] = a[m][p]*b[p][m];
//				c[n][p] = a[n][p]*b[p][n];
//		}
		for(int i=0;i<a.length;i++)
			     {
			         for(int j=0;j<b.length;j++)
			         {
			             c[i][j] = 0;
			             for(int k=0;k<3;k++)
			                 c[i][j] = c[i][j]+a[i][k]*b[k][j];
			         }
			     }
		return c;
	}

}
