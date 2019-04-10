package KiemTraGiuaKy;

import java.util.Scanner;

public class Bai2_De2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		arr = createArray(n);
		System.out.println("Mang sau khi nhap vao la: ");
		print(arr);

		if (danDau(arr, n) == true)
			System.out.println("Day so tren đan dấu");
		else
			System.out.println("Day so tren không đan dấu");
	}

	public static int[] createArray(int n) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			arr[i] = in.nextInt();
		}
		return arr;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

	public static boolean danDau(int[] arr, int n) {
		for (int i = 0; arr[i] != 0; i++) {
			for (int j = i + 1; j < n; i++) {
				if (arr[i] * arr[j] >= 0)
					return false;

			}
		}
		return true;
	}
}
