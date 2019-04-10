package lab4;

import java.util.Scanner;

public class Bai2 {
	public static int[] createArray(int n) {
		int[] arrInts = new int[n];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu [" + i + "] = ");
			arrInts[i] = in.nextInt();
		}
		return arrInts;
	}

	public static void printArray(int[] arrInts) {
		System.out.print("Mảng đã nhập vào là : ");
		for (int i = 0; i < arrInts.length; i++) {
			System.out.print(arrInts[i] + "  ");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập vào n : ");
		int n = in.nextInt();
		int[] arrInts = new int[n];
		arrInts = createArray(n);
		printArray(arrInts);

		// Tìm xem phần tử lớn nhất xuất hiện trong dãy mấy lần
		System.out.printf(
				"\nGía trị lớn nhất của mảng là %d, xuất hiện %d lần",
				maxOfArray(arrInts), countOfArray(arrInts));
	}

	public static int maxOfArray(int[] arrInts) {
		int max = arrInts[0];
		for (int i = 1; i < arrInts.length; i++) {
			if (arrInts[i] > max) {
				max = arrInts[i];
			}
		}
		return max;
	}

	public static int countOfArray(int[] arrInts) {
		int count = 0;
		for (int i = 0; i < arrInts.length; i++) {
			if (arrInts[i] == maxOfArray(arrInts))
				count++;
		}
		return count;
	}
}
