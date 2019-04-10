package Demo;

import java.util.Scanner;

public class PhuongTrinhBacHai {
	public static void main(String[] args) {
		// tao scanner
		Scanner input = new Scanner(System.in);
		// nhap 3 so a, b va c
		System.out.print("He so a: ");
		double a = input.nextInt();
		System.out.print("He so b: ");
		double b = input.nextInt();
		System.out.print("He so c: ");
		double c = input.nextInt();
		nghiemPT(a, b, c);
	}

	public static void nghiemPT(double a, double b, double c) {
		double delta = b * b - (4 * a * c);
		if (a != 0)
			if (delta > 0)
				System.out.println("Phuong trinh co 2 nghiem phan biet" + "\nx1 = "
						+ ((-b + Math.sqrt(delta)) / (2 * a)) + "\nx2 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
			else if (delta == 0)
				System.out.println("Phuong trinh co nghiem kep " + "\nx1 = x2 = " + (-b / 2 * a));
			else
				System.out.println("Phuong trinh vo nghiem");
		else if (b != 0)
			System.out.println("Phuong trinh co nghiem x = " + (-c / b));
		else
			System.out.println("Phuong trinh vo Nghiem");
	}
}
