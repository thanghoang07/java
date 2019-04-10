package lab4;

import java.util.Random;
import java.util.Scanner;

public class Bai601 {
	public final static int MAX = 10;

	public static int[] taoMang(int n) {
		int[] arr = new int[n];
		Random ra = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = ra.nextInt(MAX) - 4;
		}
		return arr;
	}

	public static void in(int[] arr) {
		for (int i : arr) {
			System.out.printf("|%d|", i);
		}
	}

	public static void average(int[] arr) {
		double sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				sum += arr[i];
				count++;
			}
		}
		System.out.printf("\nTrung binh cong cua mang khong am la %.2f", (double) (sum / count));
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao mot so: ");
		int n = nhapVao.nextInt();
		if (n <= Math.pow(10, 5)) {
			int[] arr;
			arr = taoMang(n);
			in(arr);
			average(arr);
		} else {
			System.out.println("gia tri n qua lon");
		}
	}
}
