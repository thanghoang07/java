package lab3;

import java.util.Scanner;

public class Bai4 {
	public static int USCLN(int a, int b) {
		int gcd = 1; // Initial gcd is 1
		int k = 2; // Possible gcd
		while (k <= a && k <= b) {
			if (a % k == 0 && b % k == 0)
				gcd = k;
			k++;
		}
		return gcd;
	}

	public static int BSCNN(int a, int b) {
		// if (a == 0 || b == 0)
		// return 0;
		// else
		// return (a * b) / USCLN(a, b);
		return (a * b) / USCLN(a, b);
	}

	public static void main(String[] args) {
		// tao scanner
		Scanner input = new Scanner(System.in);
		// yeu cau nguoi dung nhap 2 so a va b
		System.out.println("Nhập 2 số tự nhiên a và b: ");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("Ước số chung lớn nhất của " + a + " và " + b
				+ " là " + USCLN(a, b));
		System.out.println("Bội số chung nhỏ nhất của " + a + " và " + b
				+ " là " + BSCNN(a, b));
	}
}
