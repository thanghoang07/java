package Demo;

import java.util.Scanner;

public class ChuongTrinh {
	public static void main(String[] args) {
		Scanner inputx = new Scanner(System.in);
		Scanner inputy = new Scanner(System.in);
		// in ra man hinh thong bao
		System.out.println("Please input one integer and one floating-point number");
		// nhap vao 1 so nguyen x, 1 so thap phan y
		System.out.print("input x: ");
		int x = inputx.nextInt();
		System.out.print("input x: ");
		double y = inputy.nextDouble();
		// hien thi ket qua
		tinh(x, y);
	}

	public static void tinh(int x, double y) {
		double multiplication = 0;
		multiplication = x * y;
		System.out.println("Input values are " + x + " and " + y + " their product is " + multiplication);
	}
}
