package ReNhanh;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap vao he so a: ");
		double a = in.nextInt();
		System.out.print("Nhap vao he so b: ");
		double b = in.nextInt();

		// tim nghiem phuong trinh bac nhat
		System.out.print("Nghiem cua phuong trinh la :" + giaiPT(a, b));
	}

	public static double giaiPT(double a, double b) {
		return -b / a;
	}
}
