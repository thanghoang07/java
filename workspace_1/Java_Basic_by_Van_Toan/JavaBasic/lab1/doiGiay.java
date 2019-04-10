package lab1;

import java.util.Scanner;

public class doiGiay {
	public static void main(String[] args) {
		// tao ra Scanner
		Scanner input = new Scanner(System.in);
		// nhap vao ban kinh
		System.out.print("Nhap vao so giay : ");
		int giay = input.nextInt();
		int gio = giay / 3600;
		int phut = (giay - gio * 3600) / 60;
		int giayx = giay - gio * 3600 - phut * 60;
		// thong bao ra man hinh
		System.out.println("Ket qua (h:m:s)" + ":" + gio + ":" + phut + ":" + giayx);

	}
}
