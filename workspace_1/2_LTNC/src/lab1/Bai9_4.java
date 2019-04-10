package lab1;

import java.util.Scanner;

public class Bai9_4 {
	private static Scanner nhapVao;

	public static int tamGiac(double canhA, double canhB, double canhC) {
		if (canhA != 0 && canhB != 0 && canhC != 0) {
			if (canhA + canhB > canhC || canhA + canhC > canhB || canhB + canhC > canhA) {
				System.out.println("Day la hinh tam giac");
				if (canhA > canhC) {
					return 1;
				}
				if (canhA == canhC) {
					return 2;
				}
			} else {
				System.out.println("day ko phai hinh tam giac");
			}
		} else {
			System.out.println("day ko phai hinh tam giac");
		}
		return 3;
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
		switch (tamGiac(canhA, canhB, canhC)) {
		case 1:
			System.out.println("nhon");
			break;
		case 2:
			System.out.println("vuong");
			break;
		case 3:
			System.out.println("tu");
			break;
		default:
			break;
		}
	}
}
