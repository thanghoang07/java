package lab1_by_thanh_hai;

import java.util.Random;
import java.util.Scanner;

public class Bai3 {
	private static Scanner nhapVao;

	public static int[] nhapMang(int n) {
		Random rd = new Random();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			while (true) {
				int x = Integer.valueOf(rd.nextInt(100));
				if (x != 0 && i < n) {
					arr[i] = x;
				} else {
					break;
				}
			}
		}
		return arr;
	}
	public static int[] taoMang(int n)
	{
		nhapVao = new Scanner(System.in);
		int[] mang1 = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.print("Nhap phan tu thu " + i + ": \t");
			mang1[i] = nhapVao.nextInt();
			if (mang1[i] == 0)
				break;
		}
		return mang1;
	}
	public static void inMang(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i]);
		}
	}

	public static void lietKe(int[] a) {
		int dem = 0;
		for (int i = 0; i < a.length; i++) {
			dem = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					if (i <= j) {
						dem++;
					} else {
						break;
					}
				}
			}
			if (dem != 0) {
				System.out.printf("\n%d xuat hien %d lan", a[i], dem);
			}
		}
	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("nhap so nguyen n: ");
		int n = nhapVao.nextInt();
		int[] arrInts = new int[n];
		//arrInts = nhapMang(n);
		arrInts = taoMang(n);
		System.out.println("mang vua tao:");
		inMang(arrInts);
		lietKe(arrInts);

	}
}