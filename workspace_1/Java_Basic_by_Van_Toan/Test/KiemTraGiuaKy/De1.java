package KiemTraGiuaKy;

import java.util.Scanner;

public class De1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("So tien goi ngan hang P: ");
		int p = in.nextInt();
		System.out.println("Lai suat tien gui hang thang");
		double r = in.nextDouble();
		System.out.println("So thang goi n");
		int n = in.nextInt();

		
		System.out.println(tien(p, r, n));

	}

	public static double mu(double d, int n) {
		double s = 1;
		for (int i = 0; i < n; i++) {
			s = s * d;
		}
		return s;

	}

	public static double tien(int p, double r, int n) {
		return (p) * (mu(r + 1, n));

	}
}
