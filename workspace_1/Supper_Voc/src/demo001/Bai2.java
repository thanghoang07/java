package demo001;

import java.util.Scanner;

public class Bai2 {
	public static int dayFibonacci(int Fibonacci) {
		int a = 1, b = 1, c = 0, s = 2;
		while (c <= Fibonacci) {
			c = a + b;
			s = s + c;
			a = b;
			b = c;
		}
		return s - c;
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu day Fibonacci: ");
		int so = nhapVao.nextInt();
		System.out.printf("Tong day Fibonacci la: %d", dayFibonacci(so));
	}
}
