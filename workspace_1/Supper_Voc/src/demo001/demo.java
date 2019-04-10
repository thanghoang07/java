package demo001;

import java.util.Scanner;

public class demo {
	public static int rFibNum(int a, int b, int n) {
		if (n == 1)
			return a;
		else if (n == 2)
			return b;
		else
			return rFibNum(a, b, n - 1) + rFibNum(a, b, n - 2);
	}
	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao so: ");
		int so = nhapVao.nextInt();
		System.out.println(rFibNum(1, 2, so));
	}
}
