package VongLap;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap vao so tu nhien n: ");
		int n = in.nextInt();

		// dem so chu so cau so nguyen
		System.out.printf("So chu¯ so cua so nguyen %d la : %d", n, demSo(n));
		// dao nguoc so
		System.out.printf("\nSo dao nguoc cua so %d la  : %d", n, daoSo(n));
	}

	public static int demSo(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	public static int daoSo(int n) {
		String temp = "";
		while (n != 0) {
			temp += n % 10;
			n = n / 10;
		}
		return Integer.parseInt(temp);
	}
}
