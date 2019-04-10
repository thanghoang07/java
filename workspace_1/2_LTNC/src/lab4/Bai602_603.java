package lab4;

import java.util.Random;
import java.util.Scanner;

public class Bai602_603 {
	public final static int MAX = 10;

	public static int[] taoMang(int n) {
		int[] arr = new int[n];
		Random ra = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = ra.nextInt(MAX) - 2;
		}
		return arr;
	}

	public static void in(int[] arr) {
		for (int i : arr) {
			System.out.printf("|%d|", i);
		}
	}

	public static void maxMinArr(int[] arr) {
		int max = arr[0], min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			} else if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.printf("\n so lon nhat cua mang la %d \n so nho nhat cua mang la %d", max, min);
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao mot so: ");
		int n = nhapVao.nextInt();
		if (n <= Math.pow(10, 5)) {
			int[] arr;
			arr = taoMang(n);
			in(arr);
			maxMinArr(arr);
		} else {
			System.out.println("gia tri n qua lon");
		}
	}
}
