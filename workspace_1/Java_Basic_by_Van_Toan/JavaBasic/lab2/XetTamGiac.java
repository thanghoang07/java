package lab2;

import java.util.Scanner;

public class XetTamGiac {
	public static void main(String[] args) {
		// tao scanner
		Scanner input = new Scanner(System.in);
		// nhap 3 so a, b,c
		System.out.print("Nhập 3 số a, b, c : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		// xet tam giac, hien thi ket qua
		if ((a + b > c) && (b + c > a) && (a + c > b) && (a > 0) && (b > 0)
				&& (c > 0))
			if ((a == b) && (b == c) && (a == c))
				System.out.println("Tam Giac Đều");
			else if ((a == b) || (b == c) || (a == c))
				System.out.println("Tam giác cân");
			else if ((a * a == b * b + c * c) || (b * b == a * a + c * c)
					|| (c * c == a * a + b * b))
				System.out.println("Tam giác vuông");
			else if (((a * a == b * b + c * c) && (b == c))
					|| ((b * b == a * a + c * c) && (a == c))
					|| ((c * c == a * a + b * b) && (a == b)))
				System.out.println("Tam giác vuông cân");
			else
				System.out.println("Tam giác Thường");
		else
			System.out.println("a, b,c không phải là cạnh của tam giác");
	}
}
