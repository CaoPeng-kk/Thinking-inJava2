package oct.test8;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {

		/*7��	�ڼ��㼸���о�����Ҫ��һ���㼯���ҵ������½ǵĵ㡣
		 * ��дһ����������һ����ļ����з��������½ǵĵ㣬
		public static double[ ] getRightmostLowestPoint(double[ ][ ] points)
		��дһ�����Գ�����ʾ�û�����6��������꣬Ȼ����ʾ�����½ǵĵ㡣

		 */
		
		System.out.println("������һ��6x2�ľ���");
		Scanner input = new Scanner(System.in);
		double[][] dou = new double[2][6];
		for(int x=0;x<dou.length;x++) {
			for(int y=0;y<dou[x].length;y++) {
				dou[x][y] = input.nextDouble();
			}
		}
		double[] b = getRightmostLowestPoint(dou);
		System.out.println(b[0]+","+b[1]);
		
		for(int x=0;x<dou.length;x++) {
			for(int y=0;y<dou[x].length;y++) {
				if(y==5) {
					System.out.println(dou[x][y]+" ");
				}else
					System.out.print(dou[x][y]+" ");
			}
		}
		
	}
	public static double[] getRightmostLowestPoint(double[][] points) {
		double[] d = new double[2];
		d[0] =  points[points.length-1][points[1].length-2];
		d[1] = points[points.length-1][points[1].length-1];
		return d;
		
	}
	

}
