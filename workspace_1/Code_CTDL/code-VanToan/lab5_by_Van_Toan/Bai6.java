package lab5_by_Van_Toan;

import java.util.Scanner;

public class Bai6 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap so can chuyen : ");
		int n = in.nextInt();
		System.out.print("Nhap he so : ");
		int m = in.nextInt();
		System.out.printf("He 10 sang he %d la : " ,m);
		convertToFactor.convertTo(n, m);

	}
}
