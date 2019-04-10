package lab3;

import java.util.Scanner;

public class Bai2 {
	public static int demSo(int so) {
		int count = 0;
		do {
			so = so / 10;
			count++;
		} while (so != 0);
		return count;
	}

	public static int daoSo(int so) {
		String temp = " ";
		while (so != 0) {
			temp += so % 10;
			so = so / 10;
		}
		return Integer.parseInt(temp);
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao mot so nguyen duong: ");
		int so = nhapVao.nextInt();
		if (so > 0) {
			Bai2 b2 = new Bai2();
			System.out.printf("so nhap vao: %4d \ndem so: %4d \ndao so: -%4d", so, b2.demSo(so), b2.daoSo(so));
		}
	}
}
