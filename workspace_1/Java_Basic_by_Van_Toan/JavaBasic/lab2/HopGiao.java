package lab2;

import java.util.Scanner;

public class HopGiao {
	public static void main(String[] args) {
		// tao scanner
		Scanner input = new Scanner(System.in);
		// yeau cau nhap doan [a1, b1]
		System.out.print("Nhập a1 và b1 : ");
		int a1 = input.nextInt();
		int b1 = input.nextInt();
		System.out.print("Nhập a2 và b2 : ");
		int a2 = input.nextInt();
		int b2 = input.nextInt();
		// phan hop
		int d1 = a1 < a2 ? a1 : a2;
		int d2 = b1 < b2 ? b2 : b1;
		// phan giao
		int d3 = a1 < a2 ? a2 : a1;
		int d4 = b1 < b2 ? b1 : b2;
		System.out.println("Phần hợp là : " + "[ " + d1 + "," + d2 + " ]");
		if (d3 <= d4)
			System.out.println("Phần giao là : " + "[ " + d3 + "," + d4 + " ]");
		else
			System.out.println("Đoạn không có phần chung " + "[]");

	}
}
