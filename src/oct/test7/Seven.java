package oct.test7;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {

		/*7��	ʹ��ð�������㷨��дһ�����򷽷���
		 * ð�������㷨�������鼸�Σ���ÿ�α����У������ڵ�����Ԫ�ؽ��бȽϡ�
		 * �����һ��Ԫ���ǽ����򽻻����ǵ�ֵ�����򣬱��ֲ��䡣���ڽ�С��ֵ������һ���𽥡����򡱶�����
		 * ͬʱ�ϴ��ֵ�����򡱵ײ������ԣ����ּ�����Ϊð�����򷨡�
		 * ��дһ�����򣬶�ȡ10��double�͵�ֵ���������������Ȼ����ʾ�ź�������֡�
		 * 
		 */
		System.out.println("������10��double���͵���");
		Scanner input = new Scanner(System.in);
		double[] dou = new double[10];
		for(int i=0;i<dou.length;i++) {
			dou[i] = input.nextDouble();
			
		}
		double[] res = sort(dou);
		for(double s : res) {
			System.out.print(s+" ");
		}
	}

	public static double[] sort(double[] array) {
		for(int x=1;x<array.length;x++) {
			for(int y=0;y<array.length-1;y++) {
				if(array[y]>array[y+1]) {
					double temp = array[y];
					array[y] = array[y+1];
					array[y+1] = temp;				
					}
			}
		}
		return array;
		
	}
	

}
