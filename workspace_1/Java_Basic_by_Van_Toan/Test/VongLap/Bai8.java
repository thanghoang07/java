package VongLap;

import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap vao so tu nhien: ");
		int n = in.nextInt();

		// tinh S= 1 +2 + 3 + ... +n
		System.out.printf("Tong S = %d", tinhTong(n));
		// tinh n! = 1 x 2 x … x n.
		System.out.printf("\nGiai thua n! = %d", giaiThua(n));
	}

	public static int tinhTong(int n) {
		int tong = 0;
		for (int i = 0; i <= n; i++) {
			tong += i;
		}
		return tong;
	}

	public static int giaiThua(int n) {
		int giaiThua = 1;
		for (int i = 1; i <= n; i++) {
			giaiThua *= i;
		}
		return giaiThua;
	}

}
