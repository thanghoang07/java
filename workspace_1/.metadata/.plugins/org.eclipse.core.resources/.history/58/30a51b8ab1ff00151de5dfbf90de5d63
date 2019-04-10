package lab4;

import java.util.Random;
import java.util.Scanner;

public class Bai5 {
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

	public static boolean xacDinhX(int[] arr, int soX) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == soX) {
				return true;
			}
		}
		return false;
	}

	public static void timX(int[] arr, int soX) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == soX) {
				count++;
			}
		}
		System.out.printf("\nso lan xuat hien %d", count);
	}

	public static void xoaX(int[] arr, int n, int soX) {
		int count = 0;
		int i;
		for (i = 0; i < n; i++) {
			if (arr[i] == soX)
				count++;
			else
				arr[i - count] = arr[i];
		}
		n -= count;
		System.out.printf("\nmang sau khi xoa %d la: \n", soX);
		for (i = 0; i < n; i++) {
			System.out.print("|" + arr[i] + "|");
		}
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao mot so: ");
		int n = nhapVao.nextInt();
		int[] arr;
		arr = taoMang(n);
		in(arr);
		System.out.print("\nNhap vao mot so: ");
		int soX = nhapVao.nextInt();
		System.out.println((xacDinhX(arr, soX)) ? ("co trong mang") : ("khong co trong mang"));
		timX(arr, soX);
		System.out.println();
		xoaX(arr, n, soX);
	}
}
