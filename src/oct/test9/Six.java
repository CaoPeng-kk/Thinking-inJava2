package oct.test9;

import java.util.Date;
import java.util.GregorianCalendar;


public class Six {

	public static void main(String[] args) {

		/*6、	使用java.util.GregorianCalendar类，
		 * 可以使用它获得某个日期的年、月、日。它的无参构造方法构建一个当前日期的实例，
		 * get(GregorianCalendar.YEAR)、get(GregorianCalendar.MONTH)、
		 * get(GregorianCalendar.DAY_OF_MONTH)方法返回年、月和日。编写一个程序完成两个任务：
			显示当前的年、月和日。
			GregorianCalendar类包含setTimeInMillis(long)方法，
		可以用于设置从1970年1月1日算起的一个特定的流逝时间值。将这个值设置为1234567898765L，
		显示对应的年、月和日。

		 * 
		 */
		GregorianCalendar gre = new GregorianCalendar();
		String today = showTime(gre);
		
		System.out.println(today);
		gre.setTimeInMillis(1234567898765L);
		Date date = gre.getTime();
		System.out.println(date.toString());
		
		
	}

	public static String showTime(GregorianCalendar g) {
		int year = g.get(GregorianCalendar.YEAR);
		int month = g.get(GregorianCalendar.MONTH);
		int day = g.get(GregorianCalendar.DAY_OF_MONTH);
		return year+"."+(month+1)+"."+day;
		
	}

}
