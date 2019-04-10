package BaiTapJavaFull;

import java.util.Random;
import java.util.Scanner;

public class Bai2Mang {
	public static int[] taoMang(int n) {
		int[] arrInts = new int[n];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			System.out.printf("A[%d] = ", i);
			arrInts[i] = r.nextInt();
		}
		return arrInts;
	}

	public static void inMang(int[] arrInts) {
		for (int i = 0; i < arrInts.length; i++) {
			System.out.print(" " + arrInts[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap n ");
		int n = in.nextInt();

	}

	public static void inSoNguyenTo(int[] arrInts) {
		for(int i = 0; i < arrInts.length; i++){
			for(int j = 2; i < arrInts[i] ; i++){
			
					
			}
		}
	}
}
