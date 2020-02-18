package oct.test8;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {

		/*7、	在计算几何中经常需要从一个点集中找到最右下角的点。
		 * 编写一个方法，从一个点的集合中返回最右下角的点，
		public static double[ ] getRightmostLowestPoint(double[ ][ ] points)
		编写一个测试程序，提示用户输入6个点的坐标，然后显示最右下角的点。

		 */
		
		System.out.println("请输入一个6x2的矩阵");
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
