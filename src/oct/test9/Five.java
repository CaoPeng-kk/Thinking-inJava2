package oct.test9;

import java.util.Random;

public class Five {

	public static void main(String[] args) {

		/*
		 * 5��	ʹ��java.util.Random�࣬��дһ������
		 * ����һ�����ӣ���һ���ض�ֵ��Ϊ���Ӵ���һ��Random����Ϊ1000��Random����
		 * Ȼ��ʹ��nextInt(100)������ʾ0��100֮��ǰ50�����������
		 */
		
		Random ran = new Random(1000);
		for(int i=1;i<=50;i++) {
			if(i%10==0) {
				System.out.println(ran.nextInt(100));
			}else {
				System.out.print(ran.nextInt(100)+" ");
			}
			
		}
		
	}

}
