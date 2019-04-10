package lab2;

import java.util.Scanner;

public class soLonNhat {
	public static void main(String[] args) {
		// tao ra Scanner
		Scanner inputX = new Scanner(System.in);
		// Scanner inputY = new Scanner(System.in);
		// nhap vao ban kinh
		System.out.println("Nhập vào 2 số thực : ");
		double a = inputX.nextDouble();
		double b = inputX.nextDouble();
		// thong bao ra man hinh
		System.out.println("Số lớn nhất là : " + soSanh1(a, b));

	}

	public static double soSanh(double a, double b) {
		return Math.max(a, b);
	}
	public static String soSanh1(double a, double b) {
		if (a < b) {
			return "" + b;
		} else 
			return "" + a;
	}
}
