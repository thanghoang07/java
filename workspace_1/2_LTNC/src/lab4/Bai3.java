package lab4;

import java.lang.ref.PhantomReference;
import java.util.Random;
import java.util.Scanner;

public class Bai3 {
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

	// dem
	public static void dem(int[] arr) {
		int countAm = 0, countDuong = 0, countKhong = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				countAm++;
			} else if (arr[i] > 0) {
				countDuong++;
			} else {
				countKhong++;
			}
		}
		System.out.printf("\nso phan tu am %d so phan tu duong %d so phan tu khong %d", countAm, countDuong,
				countKhong);
	}

	// tim so duong nho nhat va so am lon nhat
	public static void timDuong(int[] arr) {
		int phanTuDuong = 1;
		// tim phan tu duong dau tien
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 1) {
				phanTuDuong = arr[i];
				break;
			}

		}
		// so sanh phan tu duong do voi cac phan tu duong con lai
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < phanTuDuong && arr[i] >= 1) {
				phanTuDuong = arr[i];
			}
		}
		System.out.println(phanTuDuong);
	}

	// tim am
	public static void soAmLonNhat(int[] arr) {
		int max = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < max) {
				max = arr[i];
				index = i;
			}
		}
		for (int i = index; i < arr.length; i++) {
			if (arr[i] > max && arr[i] < 0)
				max = arr[i];
		}
		System.out.println(max);
	}

	
	// tong 
	public static void sum(int[] arr) {
		int sumAm = 0, sumDuong = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				sumAm += arr[i];
			} else {
				sumDuong += arr[i];
			}
		}
		System.out.println((Math.abs(sumAm) != Math.abs(sumDuong)) ? (true) : (false));
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao mot so: ");
		int n = nhapVao.nextInt();
		int[] arr;
		arr = taoMang(n);
		in(arr);
		System.out.println();
		dem(arr);
		System.out.println();
		sum(arr);
		System.out.println();
		soAmLonNhat(arr);
	}
}
