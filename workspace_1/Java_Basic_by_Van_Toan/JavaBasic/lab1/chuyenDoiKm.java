package lab1;

import java.util.Scanner;

public class chuyenDoiKm {
	public static void main(String[] args) {
		// tao ra Scanner
		Scanner input = new Scanner(System.in);
		// nhap vao so can chuyen doi
		System.out.print("So mile la: ");
		double x = input.nextDouble();
		double y = x * 1.609;
		// thong bao ra man hinh
		System.out.println("So km la: " + y);
	}
}
