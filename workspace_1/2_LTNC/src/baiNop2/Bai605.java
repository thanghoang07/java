package baiNop2;

import java.util.Random;
import java.util.Scanner;

public class Bai605 {
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
	public static int timSoX(int[] arr, int soX) {
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= soX) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap vao mot so: ");
		int n = sc.nextInt();
		int[] arr = taoMang(n);
		in(arr);
		System.out.print("\nnhap vao mot so: ");
		int soX = sc.nextInt();
		System.out.println(timSoX(arr, soX));
	}
}
