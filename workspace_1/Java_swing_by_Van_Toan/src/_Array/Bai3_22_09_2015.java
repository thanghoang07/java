package _Array;

import java.util.Scanner;

public class Bai3_22_09_2015 {

	private static Scanner nhapVao;

	public static void main(String[] args) {
		int mang1_0 = 0, mang1_1 = 0, mang1_2 = 0, mang1_3 = 0, mang1_4 = 0, mang1_5 = 0, mang2_0 = 0, mang2_1 = 0,
				mang2_2 = 0, mang2_3 = 0, mang2_4 = 0, mang2_5 = 0;

		nhapVao = new Scanner(System.in);
		System.out.println("Mang: \n");

		System.out.print("Nhap vao phan tu thu nhat cua mang 1: ");
		mang1_0 = nhapVao.nextInt();
		System.out.print("Nhap vao phan tu thu hai cua mang 1:  ");
		mang1_1 = nhapVao.nextInt();
		System.out.print("Nhap vao phan tu thu ba cua mang 1:   ");
		mang1_2 = nhapVao.nextInt();
		System.out.print("Nhap vao phan tu thu tu cua mang 1:   ");
		mang1_3 = nhapVao.nextInt();
		System.out.print("Nhap vao phan tu thu nam cua mang 1:  ");
		mang1_4 = nhapVao.nextInt();
		System.out.print("Nhap vao phan tu thu sau cua mang 1:  ");
		mang1_5 = nhapVao.nextInt();

		System.out.print("Nhap vao phan tu thu nhat cua mang 2: ");
		mang2_0 = nhapVao.nextInt();
		System.out.print("Nhap vao phan tu thu hai cua mang 2:  ");
		mang2_1 = nhapVao.nextInt();
		System.out.print("Nhap vao phan tu thu ba cua mang 2:   ");
		mang2_2 = nhapVao.nextInt();
		System.out.print("Nhap vao phan tu thu tu cua mang 2:   ");
		mang2_3 = nhapVao.nextInt();
		System.out.print("Nhap vao phan tu thu nam cua mang 2:  ");
		mang2_4 = nhapVao.nextInt();
		System.out.print("Nhap vao phan tu thu sau cua mang 2:  ");
		mang2_5 = nhapVao.nextInt();

		int a_mangThuNhat[][] = { { mang1_0, mang1_1, mang1_2 }, { mang1_3, mang1_4, mang1_5 } };
		int b_mangThuHai[][] = { { mang2_0, mang2_1, mang2_2 }, { mang2_3, mang2_4, mang2_5 } };

		int c_mangThuBa[][] = new int[2][3];
		int d_mangThuTu[][] = new int[2][3];
		int e_mangThuNam[][] = new int[2][3];
		int f_mangThuSau[][] = new int[2][3];

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 3; j++) {
				c_mangThuBa[i][j] = a_mangThuNhat[i][j] + b_mangThuHai[i][j];
				System.out.print("\t" + c_mangThuBa[i][j] + " ");

			}
			System.out.println();
			for (int k = 0; k < 3; k++) {
				d_mangThuTu[i][k] = a_mangThuNhat[i][k] - b_mangThuHai[i][k];
				System.out.print("\t" + d_mangThuTu[i][k] + " ");

			}
			System.out.println();
			for (int l = 0; l < 3; l++) {
				e_mangThuNam[i][l] = a_mangThuNhat[i][l] * b_mangThuHai[i][l];
				System.out.print("\t" + e_mangThuNam[i][l] + " ");

			}
			System.out.println();
			for (int m = 0; m < 3; m++) {
				f_mangThuSau[i][m] = a_mangThuNhat[i][m] / b_mangThuHai[i][m];
				System.out.print("\t" + f_mangThuSau[i][m] + " ");

			}
			System.out.println();

		}
	}
}
