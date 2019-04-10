package lab4_by_Van_Toan;

import java.util.Random;
import java.util.Scanner;

public class Bai8 {
	private static Scanner nhapVao;

	public static int[] createArray(int n) {
		int[] arrInts = new int[n];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			arrInts[i] = r.nextInt(10);
		}
		return arrInts;
	}

	public static void printArray(int[] arrInts) {
		System.out.println("Gía trị của mảng là: ");
		for (int i = 0; i < arrInts.length; i++) {
			System.out.printf("%4d", arrInts[i]);
		}
	}

	public static int tongMang(int[] a, int n) {
		if (n == 0)
			return 0;
		else
			return a[n - 1] + tongMang(a, n - 1);
	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu: ");
		int n = nhapVao.nextInt();
		int[] a = new int[n];
		a = createArray(n);
		printArray(a);
		System.out.printf("\nTổng phần tử của mảng: %d", tongMang(a, n));
	}
}
