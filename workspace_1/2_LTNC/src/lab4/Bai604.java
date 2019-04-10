package lab4;

import java.util.Random;
import java.util.Scanner;

public class Bai604 {
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

	public static void consecutiveGaps(int[] arr) {
		int temp = 0, temp1 = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			temp = arr[i] + arr[i + 1];
			if (temp1 < temp) {
				temp1 = temp;
			}
		}
		System.out.printf("\nTong lon nhat cua hai phan tu lien tiep la %d", temp1);
	}
	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao mot so: ");
		int n = nhapVao.nextInt();
		if (n <= Math.pow(10, 5)) {
			int[] arr;
			arr = taoMang(n);
			in(arr);
			consecutiveGaps(arr);
		} else {
			System.out.println("gia tri n qua lon");
		}
	}
}
