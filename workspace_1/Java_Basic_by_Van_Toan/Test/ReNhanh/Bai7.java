package ReNhanh;

import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap va o 3 so a, b , c:");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();

		if (a + b > c && b + c > a && a + c > b) {
			System.out.println("a, b,c la  ba canh cá»§a tam giac");
			if (a == b && b == c & a == c)
				System.out.println("Tam giac tren la  tam giac deu");
			else if (a == b || b == c || a == c)
				System.out.println("Tam giac tren la  tam giac can");
			else if ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (a * a + c * c == b * b))
				System.out.println("Tam giac tren la  tam giac vuong");
			else if ((a * a + b * b == c * c && (a == b)) || (b * b + c * c == a * a && (b == c))
					|| (a * a + c * c == b * b && (a == c)))
				System.out.println("Tam giac tren la  tam giac vuong can");
			else
				System.out.println("Tam giac tren la  tam giac thuong");
		} else
			System.out.println("Ba canh tren khong phai la  3 canh cua tam giac");

	}
}
