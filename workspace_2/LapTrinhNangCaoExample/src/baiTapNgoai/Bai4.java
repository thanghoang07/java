package baiTapNgoai;

import java.util.Random;
import java.util.Scanner;

public class Bai4 {
//	public static void inSaoXuoi(int n, int max) {
//		for (int i = 1; i <= n; i++)
//			System.out.print(i);
//		System.out.println();
//		if (n < max)
//			inSaoXuoi(n + 1, max);
//	}
//	public static void main(String[] args) {
//		int max = 4;
//		inSaoXuoi(1, max);
//	}
	public final static int MAX = 100;

	public static int[] taoMang(int n) {
		int[] arr = new int[n];
		Random ra = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = ra.nextInt(MAX);
		}
		return arr;
	}

	public static void in(int[] arr) {
		for (int i : arr) {
			System.out.printf("%3d", i);
		}
	}

	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int countMax(int[] arr) {
		int max = max(arr);
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == max) {
				max = arr[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao mot so: ");
		int n = nhapVao.nextInt();
		int[] arr;
		arr = taoMang(n);
		in(arr);
		//System.out.printf("\nSo lan xuat hien cua phan tu %d la: %d", max(arr), countMax(arr));
	}
}
