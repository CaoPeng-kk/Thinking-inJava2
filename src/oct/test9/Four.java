package oct.test9;

import java.util.Date;

public class Four {

	public static void main(String[] args) {

		/*4��	ʹ��java.util.Date�࣬��д���򴴽�һ��Date����
		 * ������������ʱ�䣨���һ���Ӹ�������ʱ��1970��1��1���������ŵ��Ժ���Ϊ��λ����ĸ���ʱ�䣩
		 * �ֱ�Ϊ104��105��106��107��108��109��1010��1011���룬Ȼ��ʹ��toString()�����ֱ���ʾ�������ڡ�
		 * 
		 */
		Date date1 = new Date((long) Math.pow(10, 4)); 
		Date date2 = new Date((long) Math.pow(10, 5)); 
		Date date3 = new Date((long) Math.pow(10, 6)); 
		Date date4 = new Date((long) Math.pow(10, 7)); 
		Date date5 = new Date((long) Math.pow(10, 8)); 
		Date date6 = new Date((long) Math.pow(10, 9)); 
		Date date7 = new Date((long) Math.pow(10, 10)); 
		Date date8 = new Date((long) Math.pow(10, 11)); 
		System.out.println(date1.toString());
		System.out.println(date2.toString());
		System.out.println(date3.toString());
		System.out.println(date4.toString());
		System.out.println(date5.toString());
		System.out.println(date6.toString());
		System.out.println(date7.toString());
		System.out.println(date8.toString());
		
		
	}
	
	

}
