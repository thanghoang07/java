package lab3;

import java.util.Scanner;

public class Bai3 {
	public static int tinhTuoi(int tCha, int tCon) {
		int temp = 0;
		while (tCon * 2 != tCha) {
			tCha++;
			tCon++;
			temp++;
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao so tuoi cha: ");
		int tCha = nhapVao.nextInt();
		System.out.print("Nhap vao so tuoi con: ");
		int tCon = nhapVao.nextInt();
		Bai3 b3 = new Bai3();
		System.out.printf("Vay sau %d thi tuoi cha gap doi tuoi con", b3.tinhTuoi(tCha, tCon));

	}
}
