package lab8;

import java.util.*;

public class Bai2 {
	private static Scanner nhapVao;

	public static void main(String[] args) {
		ArraySearch<Integer> mangInt = new ArraySearch<>(100000000);
		Random abc = new Random();
		nhapVao = new Scanner(System.in);
		//////////////////////////////////////////////
		System.out.println("Cach thu nhat");
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.print("\nNhap vao so phan tu mang: ");
		int nC1 = nhapVao.nextInt();
		System.out.print("Nhap vao gia tri can tim: ");
		int searchKeyC1 = nhapVao.nextInt();

		int[] mangC1 = new int[nC1];
		for (int i = 0; i < mangC1.length; i++) {
			mangC1[i] = abc.nextInt(10);
			mangInt.intsert(mangC1[i]);
		}
		System.out.println("Cach thu nhat");

		if (nC1 <= 15 && nC1 != 0) {
			System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
			System.out.println(mangInt + "\nSap xep: ");
			mangInt.mergeSort(0, nC1 - 1);
			System.out.println("In mang da sap xep: \n" + mangInt + "\nTim Kiem: ");

			if (mangInt.sequentialSearch(searchKeyC1) == -1) {
				System.out.println("Khong tim thay " + searchKeyC1 + " o trong mang!!");
			} else {
				System.out.println("Tim thay " + searchKeyC1 + " o vi tri so: " + mangInt.sequentialSearch(searchKeyC1));
			}

			System.out.println("so lan so sanh: \t" + mangInt.demSoSanhSequentialSearch);
			System.out.println("Xoa mang vua tao: ");
			mangInt.clear();
			System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
			System.out.println(mangInt.toString());
		} else if (nC1 > 15) {
			System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
			System.out.println("Sap xep: \nda sap xep");
			mangInt.mergeSort(0, nC1 - 1);
			System.out.println("Tim Kiem: ");

			if (mangInt.sequentialSearch(searchKeyC1) == -1) {
				System.out.println("Khong tim thay " + searchKeyC1 + " o trong mang!!");
			} else {
				System.out.println(
						"Tim thay " + searchKeyC1 + " o vi tri so: " + mangInt.binarySearch(searchKeyC1, 0, nC1 - 1));
			}

			System.out.println("So lan so sanh: \t" + mangInt.demSoSanhBinarySearch);
			System.out.println("Xoa mang vua tao: ");
			mangInt.clear();
			System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
			System.out.println(mangInt.toString());
		} else {
			System.out.println("mang khong ton tai!!!!");
		}
		/////////////////////////////////////////////////
		System.out.println("Cach thu hai");

		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.print("\nNhap vao so phan tu mang: ");
		int nC2 = nhapVao.nextInt();
		System.out.print("Nhap vao gia tri can tim: ");
		int searchKeyC2 = nhapVao.nextInt();
		int[] mangC2 = new int[nC2];
		for (int i = 0; i < mangC2.length; i++) {
			mangC2[i] = abc.nextInt(10);
			mangInt.intsert(mangC2[i]);
		}
		if (nC2 <= 15 && nC2 != 0) {
			System.out.println(mangInt);
			mangInt.mergeSort(0, nC2 - 1);
			System.out.println("In mang da sap xep: \n" + mangInt + "\nTim Kiem: ");			
			System.out.println(" ");
		} else {
			mangInt.mergeSort(0, nC2 - 1);
		}
		System.out.println(mangInt.binaryAndSequentialSearch(searchKeyC2, nC2));
		System.out.printf("dem so lan so sanh %s", mangInt.dem);
	}
}
