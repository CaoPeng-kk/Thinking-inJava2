package oct.test6;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {

		/*
		 * 7��	������ʵ����������������
			public static boolean isValid(double a, double b, double c)
			public static double area(double a, double b, double c)
			��дһ�����Գ��򣬶��������������ߵ�ֵ��ʹ��isValid������������Ƿ���Ч��
			��ʹ��area����������������������Ч������ʾ�����������ʾ������Ч��

		 */
		System.out.println("�����������ߵ�ֵ");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		
		if(isValid(a,b,c)) {
			System.out.println("���������Ϊ��"+area(a,b,c));
		}else {
			System.out.println("������Ч");
		}
	}

	public static double area(double a, double b, double c) {
		double s = (a+b+c)/2.0;
		double sumarea = Math.pow(s*(s-a)*(s-b)*(s-c), 0.5);
		return sumarea;
		
	}

	public static boolean isValid(double a, double b, double c) {
		if(a+b>c&&a+c>b&&b+c>a) {
			if(a-c<b&&a-b<b&&b-c<a) {
				return true;
			}
		}
		return false;
	}

}
