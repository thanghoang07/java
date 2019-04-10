package lab1;

import java.util.Scanner;

public class hinhTron {
	public static void main(String[] args) {
		// tao ra Scanner
		Scanner input = new Scanner(System.in);
		// nhap vao ban kinh
		System.out.print("Nhap vao ban kinh: ");
		double radius = input.nextDouble();
		double chuVi = (radius * 2) * Math.PI;
		double dienTich = (radius * radius) * Math.PI;
		// thong bao ra man hinh
		System.out.println("Chu vi la  : " + chuVi);
		System.out.println("Dien tich la :" + dienTich);
	}
}
