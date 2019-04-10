package lab4;

import java.util.Random;
import java.util.Scanner;

public class Bai1 {
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

	// tim max
	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	// tim min
	public static int min(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	// tim vi tri voi gia tri lon nhat do
	public static void maxP(int[] arr) {
		int max = arr[0], port = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				port = i;
			}
		}
		System.out.printf("\nGia tri lon nhat la %d va o vi tri %d", max, port);
	}

	// tim vi tri voi gia tri lon nhat do
	public static void minP(int[] arr) {
		int min = arr[0], port = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				port = i;
			}
		}
		System.out.printf("\nGia tri nho nhat la %d va o vi tri %d", min, port);
	}

	// tinh tong
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// tinh tich
	public static int tich(int[] arr) {
		int tich = 1;
		for (int i = 0; i < arr.length; i++) {
			tich *= arr[i];
		}
		return tich;
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao mot so: ");
		int n = nhapVao.nextInt();
		int[] arr;
		arr = taoMang(n);
		in(arr);
		/*
		 * System.out.printf("\nGia tri lon nhat: %d", max(arr));
		 * System.out.printf("\nGia tri nho nhat: %d", min(arr));
		 * System.out.printf("\nTong cua mang: %d", sum(arr));
		 * System.out.printf("\nTich cua mang: %d", tich(arr));
		 */
		maxP(arr);
		minP(arr);
	}
}
