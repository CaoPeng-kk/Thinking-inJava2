package oct.test8;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {

		/*	һ��n��n�ľ������ÿ��Ԫ�ض�����������ÿ�е�Ԫ�صĺ�Ϊ1��
		 * ���Ϊ����ɷ���󡣱�д����ķ��������һ�������Ƿ�������ɷ����
		public static Boolean isMarkovMatrix(double[ ] [ ])
		��дһ�����Գ�����ʾ�û�����һ��3��3���󣬲������Ƿ�������ɷ����

		 * 
		 * 
		 */
		System.out.println("������һ��3x3�ľ���");
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
