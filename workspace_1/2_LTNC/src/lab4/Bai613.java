package lab4;

import java.util.Random;
import java.util.Scanner;

public class Bai613 {
	public final static int MAX = 10;

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
			System.out.printf("|%d|", i);
		}
	}

	public static int[] sapXep(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int banDau = arr[i];
					arr[i] = arr[j];
					arr[j] = banDau;
				}
			}
		}
		int[] arrTemp = arr;
		/*
		 * System.out.println("\nMang sau khi xap xep la: "); for (int i : arr)
		 * { System.out.printf("|%d|", i); }
		 */
		return arrTemp;
	}

	public static int[] xoaX(int[] arr, int n) {
		int i, a = 0;
		int[] temp = arr;
		for (i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (temp[i] == temp[j]) {
					temp[j] = temp[j + 1];
					j--;
					n--;
					a = n;
				}
			}
		}
		int[] temp1 = new int[a];
		for (i = 0; i < n; i++) {
			temp1[i] = temp[i];
		}
		return temp1;
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao mot so: ");
		int n = nhapVao.nextInt();
		if (n <= Math.pow(10, 5)) {
			int[] arr;
			arr = taoMang(n);
			in(arr);
			System.out.println("Mang da xoa");
			in(xoaX(sapXep(arr, n), n));
		} else {
			System.out.println("gia tri n qua lon");
		}
	}
}
