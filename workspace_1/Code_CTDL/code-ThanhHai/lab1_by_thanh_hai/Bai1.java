package lab1_by_thanh_hai;

import java.util.Random;
import java.util.Scanner;

public class Bai1 {
	private static Scanner nhapVao;

	public static double[] nhapMang(int n) {
		double[] arr = new double[n];
		Random rd = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = rd.nextDouble();
		}

		return arr;
	}

	public static void inMang(double[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%6.2f", a[i]);
		}
	}

	public static double tong2PhanTu(double[] b) {
		double total = 0;
		for (int i = 0; i < b.length; i++) {
			total = b[0] + b[1];
		}
		return total;
	}

	public static double tongMang(double[] c) {
		double sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum += c[i];
		}
		return sum;
	}

	public static void ganMang(double[] a, double x) {
		for (int i = 0; i < a.length; i++) {
			a[a.length - 1] = x;
		}
	}

	public static double giaTriMin(double[] increate) {
		double min = increate[0];
		for (int i = 0; i < increate.length; i++) {
			if (min > increate[i]) {
				min = increate[i];
			}
		}
		return min;
	}

	// public static double[] xoaPhanTu(double[] a, int k, int n) {
	// double[] arr = new double[n];
	// if (k < n) {
	// for (int i = k + 1; i < n; i++)
	// a[i - 1] = a[i];
	// n--;
	// for (int i = 0; i < n; i++)
	// System.out.printf("%6.2f", a[i]);
	// } else
	// System.out
	// .printf("Loi: vi tri can xoa khong hop le (vuot qua chi so cua phan tu
	// cuoi cung).");
	// return arr;
	// }

	public static void index(double[] arr, int n) {
		Random rd = new Random();
		int index = rd.nextInt(n);
		System.out.printf("\nGia tri phan tu tai vi tri index %d:%6.2f ", index, arr[index]);
	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap so nguyen n: ");
		int n = nhapVao.nextInt();
		double[] arrInts = new double[n];
		arrInts = nhapMang(n);
		System.out.println("Mang A:");
		inMang(arrInts);
		System.out.printf("\nTong 2 phan tu dau tien:" + "%6.2f", tong2PhanTu(arrInts));
		System.out.printf("\nTong tat ca cac phan tu trong mang:" + "%6.2f", tongMang(arrInts));
		System.out.printf("\nGia tri nho nhat:" + "%6.2f", giaTriMin(arrInts));
		index(arrInts, n);
		System.out.print("\nNhap gia tri X: ");
		double x = nhapVao.nextDouble();
		ganMang(arrInts, x);
		System.out.println("Mang sau khi gan: ");
		inMang(arrInts);
		double[] arrInitializer = new double[4];
		arrInitializer[0] = 3.5;
		arrInitializer[1] = 5.5;
		arrInitializer[2] = 4.52;
		arrInitializer[3] = 5.6;
		System.out.println("\nMang dung array itinializer:");
		for (int i = 0; i < 4; i++) {
			System.out.print("  " + arrInitializer[i] + "");
		}

	}

}
