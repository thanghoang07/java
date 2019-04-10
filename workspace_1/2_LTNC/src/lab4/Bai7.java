package lab4;

import java.util.Random;
import java.util.Scanner;

public class Bai7 {
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
				System.out.println("\nla day doi xung");
			} else {
				System.out.println("\nkhong la day doi xung");
			}
			break;
		}
	}

	public static boolean danDau(int[] arr) {
		for (int i = 0; arr[i] != 0; i++) {
			if ((arr[i] * arr[i + 1]) > 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap vao mot so: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		arr = taoMang(n);
		in(arr);
		doiXung(arr, n);
		//System.out.println(danDau(arr));
	}
}