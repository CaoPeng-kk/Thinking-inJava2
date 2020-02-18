package oct.test9;

import java.util.Date;

public class Four {

	public static void main(String[] args) {

		/*4、	使用java.util.Date类，编写程序创建一个Date对象，
		 * 设置它的流逝时间（针对一个从格林威治时间1970年1月1日至今流逝的以毫秒为单位计算的给定时间）
		 * 分别为104、105、106、107、108、109、1010、1011毫秒，然后使用toString()方法分别显示上述日期。
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
