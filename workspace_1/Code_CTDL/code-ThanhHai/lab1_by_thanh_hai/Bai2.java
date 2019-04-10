package lab1_by_thanh_hai;

import java.util.Scanner;

public class Bai2 {
	private static Scanner nhapVao;


	public static int[] nhapMang(int n) {
		int[] arrInt = new int[n];
		nhapVao = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			arrInt[i] = nhapVao.nextInt();
		}
		return arrInt;
	}

	public static void inMang(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.printf("%4d", a[i]);
		System.out.println("");
	}

	public static int[] swapArr(int[] a, int n) {
		int[] arrInt = new int[n];
		int j = 0;
		for (int i = (a.length - 1); i >= 0; i--) {
			arrInt[j] = a[i];
			j++;
		}
		return arrInt;
	}

	public static void dayTangDan(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("-Nhap n: ");
		int n = nhapVao.nextInt();
		int[] arrInt = new int[n];
		arrInt = nhapMang(n);
		System.out.println("-Mang sau khi tao: ");
		inMang(arrInt);
		System.out.println("-Mang sap xep tang dan: ");
		dayTangDan(arrInt);
		inMang(arrInt);
		System.out.println("-Mang sau khi dao: ");
		int[] arrInt1 = new int[n];
		arrInt1 = swapArr(arrInt, n);
		inMang(arrInt1);

	}

}
