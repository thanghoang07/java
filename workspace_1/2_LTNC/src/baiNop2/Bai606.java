package baiNop2;

import java.util.Random;
import java.util.Scanner;

public class Bai606 {
	public static int[] taoMang(int n) {
		int[] arr = new int[n];
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();
		for (int i = 0; i < n; i++) {
			System.out.printf("arr[%d] = ", i);
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void in(int[] arr) {
		for (int i : arr) {
			System.out.printf("%3d", i);
		}
	}

	public static void doiXung(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[n - i - 1]) {
				System.out.println("\nYES");
			} else {
				System.out.println("\nNO");
			}
			break;
		}
	}
}
