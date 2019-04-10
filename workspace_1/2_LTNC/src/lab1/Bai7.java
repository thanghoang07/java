package lab1;

import java.util.Scanner;

public class Bai7 {
	public static boolean kiemTraSoNT(int a) {
		int i = 2;
		if (a < 2) {
			return false;
		} else {
			if (a % i == 0 && i <= Math.sqrt(a)) {
				return false;
			}
		}
		return true;
	}

	private static Scanner nhapVao;

	public static void main(String args[]) {
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap 1 so nguyen : ");
		int n = nhapVao.nextInt();
		if (kiemTraSoNT(n))
			System.out.println("Yes");
		else {
			System.out.println("khong la so nguyen to");
			for (int i = 0; i < Math.sqrt(n); i++) {
				if (n % i == 0) {
					System.out.printf("%s", i);
				}
				break;
			}
		}
	}
}
