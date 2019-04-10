package thucHanhJavaBasic1;

import java.util.Scanner;

public class JavaBasic4 {
	public static void main(String[] args) {
//		Scanner obj
		System.out.println("tinh chu vi va dien tich hinh tron :");
		Scanner input = new Scanner(System.in);
		final double PI = 3.14159;
//		nhap vao ban kinh
		System.out.print("nhap vao ban kinh: " );
		double radius = input.nextInt();
//		chu vi
		double chuvi = radius*2*PI;
//		dien tich
		double dientich = radius*radius*PI;
//		in ra man hinh
		System.out.println("ban kinh duong tron: " +radius+ "chu vi: " +chuvi);
		System.out.println("ban kinh duong tron: " +radius+ "dien tich: " +dientich);
		
		
		
		
	}

}
