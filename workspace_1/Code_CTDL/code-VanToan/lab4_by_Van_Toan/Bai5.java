package lab4_by_Van_Toan;

import java.util.Scanner;

public class Bai5 {

	private static Scanner nhapVao;

	public static void main(String args[]) {
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap 1 so nguyen : ");
		int n = nhapVao.nextInt();
		if (primes(n, (int) Math.sqrt(n)) == true)
			System.out.println("la so nguyen to");
		else
			System.out.println("khong la so nguyen to");
	}

	public static boolean primes(int n, int d) {
		if (d == 1)
			return true;
		if (n < 2 || n % d == 0)
			return false;
		else
			return primes(n, d - 1);
	}
}
