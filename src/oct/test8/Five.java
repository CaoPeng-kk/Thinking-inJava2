package oct.test8;

import java.util.Random;

public class Five {

	public static void main(String[] args) {

		/*	��дһ�����򣬲���һ��6��6������0��1�Ķ�ά����
		 * ��ʾ�þ��󣬼���Ƿ�ÿ���Լ�ÿ������ż����1��
		 * 
		 */
		Random ran = new Random();
		int[][] arr = new int[6][6];
		int sum = 0;
		for(int x=0;x<arr.length;x++) {
			for(int y=0;y<arr[x].length;y++) {
				arr[x][y] = ran.nextInt(2);
//				if(arr[x][y]==1) {
//					count++;
			}
		}
		for(int x=0;x<arr.length;x++) {
			for(int y=0;y<arr[x].length;y++) {
				sum=sum+arr[x][y];
				if(y==5) {
					if(sum%2==0) {
						System.out.println(arr[x][y]+" "+"��"); 
					}else
						System.out.println(arr[x][y]+" "+"��"); 
				}else {
					System.out.print(arr[x][y]+" "); 
				}
			}
			sum = 0;
		}
		
		
		
		
	}

}
