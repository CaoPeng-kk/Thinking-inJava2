package oct.test7;

import java.util.Random;

public class Two {

	public static void main(String[] args) {

		/*2、	编写一个程序，生成0到9之间的100个随机整数，然后显示每一个数出现的次数。
		 * 
		 */
		Random ran = new Random();
		int[] arr = new int[10];
		int count = 0;
		for(int i=0;i<100;i++) {
			int rannum = ran.nextInt(10);
				switch (rannum) {
				case 0:arr[0]+=1;break;
				case 1:arr[1]+=1;break;
				case 2:arr[2]+=1;break;
				case 3:arr[3]+=1;break;
				case 4:arr[4]+=1;break;
				case 5:arr[5]+=1;break;
				case 6:arr[6]+=1;break;
				case 7:arr[7]+=1;break;
				case 8:arr[8]+=1;break;
				case 9:arr[9]+=1;break;
				}
			}
		
		for(int x=0;x<arr.length;x++) {
			System.out.print(arr[x]+" ");
		}
	}

}
