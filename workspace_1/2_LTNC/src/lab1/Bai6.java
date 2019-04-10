package lab1;

import java.util.Scanner;

public class Bai6 {
	public static int binhPhuong(int so) {
		int temp = 0;
		if (so >= 0) {
			temp = so * so;
		} else {
			System.out.println("loi");
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao mot so nguyen: ");
		int so = nhapVao.nextInt();
		System.out.printf("Binh phuong cua so %s vua nhap la: %s", so, binhPhuong(so));
	}
}
