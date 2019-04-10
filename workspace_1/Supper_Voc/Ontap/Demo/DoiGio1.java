package Demo;

import java.util.Scanner;

public class DoiGio1 {
	public static void main(String[] args) {
		// tao ra Scanner
		Scanner input = new Scanner(System.in);
		// nhap vao ban kinh
		System.out.print("Nhap vao so giay : ");
		int giay = input.nextInt();
		doi(giay);
	}

	public static void doi(int giay) {
		int gio = giay / 3600;
		int phut = (giay - gio * 3600) / 60;
		int giayx = giay - gio * 3600 - phut * 60;
		if (giay < 60) {
			System.out.printf("Ket qua (h:m:s): %s giay", giay);
		} else if (giay >= 60) {
			System.out.println("Ket qua (h:m:s):" + gio + ":" + phut + ":" + giayx);
		} else {
			System.out.println("loi......");
		}
	}
}
