package LTNC_12072012;

import java.util.*;

public class bAI1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.print("Nhap n: ");
		// int n = in.nextInt();
		System.out.print("Nhap so k: ");
		int k = in.nextInt();
		// int[] arrInts = new int[n];
		// arrInts = createArray(n);
		// System.out.println("Mảng gồm n so nguyen: ");
		int[] arrInts = { 7, 7, 5, 12, 5, 12, 7, 1, 5, 7 };
		printArray(arrInts);

		// cau b
		System.out.printf("\nSo lan xuat hien f(%d) = %d", k, count(arrInts, k));

		//System.out.println("\n" + countMin(arrInts));
	}

	public static int[] createArray(int n) {
		int[] arrInts = new int[n];
		Random r = new Random();
		for (int i = 0; i < arrInts.length; i++) {
			arrInts[i] = r.nextInt(10);
		}
		return arrInts;
	}

	public static void printArray(int[] arrInts) {
		for (int i = 0; i < arrInts.length; i++) {
			System.out.print(arrInts[i] + " ");
		}
	}

	public static int count(int[] arrInts, int k) {
		int count = 0;
		for (int i = 0; i < arrInts.length; i++) {
			if (arrInts[i] == k)
				count++;
		}
		return count;
	}

	public static int countMin(int[] arrInts) {
		int temp1;
		int temp = count(arrInts, arrInts[0]);
		int index = 0;
		for (int i = 1; i < arrInts.length; i++) {
			temp1 = count(arrInts, arrInts[i]);
			if (temp > temp1) {
				temp = temp1;
				index = i;
			}
		}
		return arrInts[index];
	}
}
