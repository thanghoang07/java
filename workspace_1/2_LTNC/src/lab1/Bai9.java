package lab1;

import java.util.Scanner;

public class Bai9 {

	private static Scanner nhapVao;

	public static void tamGiac(double canhA, double canhB, double canhC) {
		if (canhA != 0 && canhB != 0 && canhC != 0) {
			if (canhA + canhB > canhC || canhA + canhC > canhB || canhB + canhC > canhA) {
				System.out.println("Day la hinh tam giac");
				double ax1 = canhA * canhA, ax2 = canhB * canhB, ax3 = canhC * canhC;
				double temp = (-ax1 + ax2 + ax3) / (2 * canhB * canhC);
				if (temp < 0) {
					System.out.println("day la tam giac tu");
				} else if (temp > 0) {
					System.out.println("day la tam giac nhon");
				} else {
					System.out.println("day la tam giac vuong");
				}
			} else {
				System.out.println("day ko phai hinh tam giac");
			}
		} else {
			System.out.println("day ko phai hinh tam giac");
		}
	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("nhap vao canh thu nhat: ");
		int canhA = nhapVao.nextInt();
		System.out.print("nhap vao canh thu hai: ");
		int canhB = nhapVao.nextInt();
		System.out.print("nhap vao canh thu ba: ");
		int canhC = nhapVao.nextInt();
		System.out.println();
		Bai9.tamGiac(canhA, canhB, canhC);
	}
}
