package oct.test7;

public class Six {

	public static void main(String[] args) {

		/*6、	二分查找法是一种常见的对数值列表的查找方法，
		 * 	使用二分查找法的前提条件是数组中的元素必须已经排好序，假设数组已按升序排列。
		 * 	二分查找法将关键字与数组的中间元素进行比较，考虑下面三种情况：
			如果关键字小于中间元素，只需要在数组的前一半元素中继续查找关键字。
			如果关键字和中间元素相等，则匹配成功，查找结束。
			如果关键字大于中间元素，只需要在数组的后一半元素中继续查找关键字
			从列表{2，4，5，10，11，45，50，59，60，66，69，70，79}中找出关键字11

		 * 
		 */
		int[] arr = {2,4,5,10,11,45,50,59,60,66,69,70,79};		
		int min = 0;
		int max = arr.length;;
		int key = 1;
		int index = 0;
		while(min<=max) {
			int mid = (min+max)/2;//在循环内修改变量；
			if(key>arr[mid]) {
				min = mid+1;
				
			}else if (key<arr[mid]) {
				max = mid-1;
			}else if(key==arr[mid]){
				index = arr[mid];
				System.out.println("key="+index);
				break;
			}
		}
//		if(index==0) {
//			System.out.println("不存在");
//		}
		
	}
	

}
