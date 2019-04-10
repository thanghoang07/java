package lab3;

import java.util.Scanner;

public class Bai5 {
	public static int uocSoLe(int n) {
		int uoc = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && i % 2 != 0)
				uoc = i;
		}
		return uoc;
	}

	public static boolean testSoNguyenTo(int n) {

		int dem = 0;
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				dem++;
			}
		}
		if (n < 2 || dem > 0)
			return false;
		return true;
	}

	public static void thuaSoNguyenTo(int n) {
		System.out.printf("\nc. Phân tích số %d ra các thừa số nguyên tố :", n);
		for (int i = 2; n > 1;) {
			// if (n == i) {
			// System.out.printf("%d ", i);
			// break;
			// }
			if (n % i == 0) {
				System.out.printf("%d", i);
				// giam gia tri n
				n = n / i;
				if (n > 1)
					System.out.print(" x ");
			} else
				i++;
			// if (n % i == 0)
			// System.out.printf("%d x ", i);
			// n = n / i;
			// if (n > 1)
			// System.out.printf(" x ");
		}

	}

	public static void inSoNguyenTo(int n) {
		System.out.print("\nd. Các số nguyên tố nhỏ hơn " + n + " là: ");
		for (int i = n - 1; i >= 2; i--) {
			if (testSoNguyenTo(i) == true) {
				System.out.print("  " + i);
			}
		}
		System.out.println("  ");
	}

	public static void main(String[] args) {
		// tao scanner
		Scanner input = new Scanner(System.in);
		// yeu cau nguoi dung nhap so tu nhien n
		System.out.print("Nhập vào số tự nhiên n: ");
		int n = input.nextInt();
		System.out.println("a. Ước lẻ lớn nhất của " + n + " là " + uocSoLe(n));
		if (testSoNguyenTo(n) == true)
			System.out.printf("b. Số %d là số nguyên tố", n);
		else
			System.out.printf("b. Số %d không phải là số nguyên tố", n);

		thuaSoNguyenTo(n);
		inSoNguyenTo(n);
	}
}
