package oct.test9;

public class One {

	public static void main(String[] args) {

		/*1��	���һ����ΪCircle�����ʾԲ��������Ϊ�뾶������һ����ΪgetArea()�ķ�����
		 * ����Բ�������һ����ΪgetPerimeter()�ķ����������ܳ�����дһ�����Գ���
		 * ��������Circle����һ���뾶Ϊ5��һ���뾶Ϊ10������˳����ʾÿ��Բ�İ뾶��������ܳ���
		 * 
		 */
		Circle a = new Circle(5);
		Circle b = new Circle(10);
		
		System.out.println("circle1���Ϊ"+a.getlength());
		System.out.println("circle2�ܳ�Ϊ"+b.getlength());
		System.out.println("circle1���Ϊ"+a.getArea());
		System.out.println("circle2�ܳ�Ϊ"+a.getPerimeter());
		System.out.println("circle1���Ϊ"+b.getArea());
		System.out.println("circle2�ܳ�Ϊ"+b.getPerimeter());
		
		
	}

}
