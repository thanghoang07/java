package lab3;

import java.util.Scanner;

public class Bai8 {
	public static int sum(int n) {
		int i = 0, sum = 0;
		for (i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	public static int giaiThua(int n) {
		int giaiThua = 1;
		for (int i = 1; i <= n; i++) {
			giaiThua *= i;
		}
		return giaiThua;
	}

	public static void main(String[] args) {
		// tao scanner
		Scanner input = new Scanner(System.in);
		// yeu cau nguoi dung nhap 1 so tu nhien n
		System.out.print("Nhập số tự nhiên n : ");
		int n = input.nextInt();
		System.out.println("a. Tổng S = " + sum(n));
		System.out.println("b. Giai thừa n! = " + giaiThua(n));
	}
}
