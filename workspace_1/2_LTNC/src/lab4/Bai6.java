package lab4;

import java.util.Scanner;

public class Bai6 {
	public static int[] createArray(int n) {
		int[] arrInts = new int[n];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.printf("arr[%d] = ", i);
			arrInts[i] = in.nextInt();
		}
		return arrInts;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

	public static void checkArrTang(int[] arr) {// kt day so co pha la day
		for (int i = 0; i < arr.length - 1; i++) {
			if ((arr[i] > arr[i + 1])) {
				System.out.println("Mang da cho ko tang dan");
				return;
			}
		}
		System.out.println("Mang da cho  tang dan");

	}

	public static void sapXep(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int banDau = arr[i];
					arr[i] = arr[j];
					arr[j] = banDau;
				}
			}
		}
		System.out.print("mang sau khi sap xep la: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("nhap vao n: ");
		int n = in.nextInt();
		int[] arr = createArray(n);
		printArray(arr);

		checkArrTang(arr);
		sapXep(arr, n);
	}
}
