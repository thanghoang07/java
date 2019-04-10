package lab1;

import java.util.Scanner;

public class Bai1 {
	public static int soGapDoi(int so) {
		int temp = 0;
		if (so <= 100) {
			temp = so * 2;
		} else {
			System.out.println("loi");
		}
		return temp;

	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao mot so nguyen: ");
		int so = nhapVao.nextInt();
		System.out.printf("So gap doi cau so %s vua nhap la: %s", so, soGapDoi(so));
	}
}
