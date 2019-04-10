package lab1;

import java.util.Scanner;

public class Bai3 {
	public static int phepTinhPhucTap(int soA, int soB) {
		int temp = 0;
		if (soA <= 1000 && soB <= 1000) {
			temp = soA + soB + soA * soB;
		} else {
			System.out.println("loi");
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.println("nhap vao 2 so bat ky: ");
		int soA = nhapVao.nextInt();
		int soB = nhapVao.nextInt();
		System.out.printf("So thu nhat %s, so thu hai %s, ta co %s la ket qua", soA, soB, phepTinhPhucTap(soA, soB));
	}
}
