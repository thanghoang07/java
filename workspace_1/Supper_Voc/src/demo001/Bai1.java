package demo001;

import java.util.Scanner;

public class Bai1 {
	public static double tongBoiSo(int so) {
		double sum = 1.5 * (int) ((so - 1) / 3) * (int) ((so + 2) / 3)
				+ 2.5 * (int) ((so - 1) / 5) * (int) ((so + 4) / 5)
				- 7.5 * (int) ((so - 1) / 15) * (int) ((so + 14) / 15);
		return sum;
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao so: ");
		int so = nhapVao.nextInt();
		System.out.println(tongBoiSo(so));
	}
}
