package oct.test6;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {

		/*
		 * 1��	��дһ������������һ��������λ����֮�͡�ʹ������ķ���ͷ��
				public static int sumDigits(long n)
				��д������ʾ�û�����һ��������Ȼ����ʾ��������������ֵĺ�
				���磺sumDigits(234)����9��9=2+3+4����
				��ʾ��ʹ���������%��ȡ���֣��ó���/ȥ����ȡ���������֡�
				���磺ʹ��234%10��=4����ȡ4��Ȼ��ʹ��234/10��=23����234��ȥ��4��
				ʹ��һ��ѭ����������ȡ��ȥ��ÿλ���֣�ֱ�����е�λ������ȡ��Ϊֹ��


		 */
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		Long num = input.nextLong();
		
		int res = sumDigits(num);
		System.out.println("������Ϊ"+res);
		
	}

	public static int sumDigits(long n) {
		int len = String.valueOf(n).length();
		int sum = 0;
		int one = 0;
		int last = (int) n;
		for(int i=0;i<len;i++) {
			one =  (int) (last%10);
			last = (int) (last/10);
			sum+=one;
		}
		return sum;
		
	}

}
