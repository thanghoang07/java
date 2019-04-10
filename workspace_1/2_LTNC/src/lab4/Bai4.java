package lab4;

import java.util.Random;
import java.util.Scanner;

public class Bai4 {
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

	// dao nguoc
	public static void daonguoc(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.printf("|%d|", arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao mot so: ");
		int n = nhapVao.nextInt();
		int[] arr;
		arr = taoMang(n);
		in(arr);
		System.out.println();
		daonguoc(arr);
	}
}
