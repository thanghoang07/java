package baiNop2;

import java.util.Random;
import java.util.Scanner;

public class Bai607 {
	public final static int MAX = 10;

	public static int[] taoMang(int n) {
		int[] arr = new int[n];
		Random ra = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = ra.nextInt(MAX);
		}
		return arr;
	}

	public static void in(int[] arr) {
		for (int i : arr) {
			System.out.printf("|%d|", i);
		}
	}

	// tim min
	public static int min(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int swap(int[] arr, int soX){
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so n: ");
		int n = sc.nextInt();
		int[] arr = taoMang(n);
		in(arr);
		System.out.println("\nmin: " + min(arr));
	}
}
