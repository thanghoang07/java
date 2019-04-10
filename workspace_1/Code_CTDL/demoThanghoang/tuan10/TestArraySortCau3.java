package tuan10;

import java.util.Random;
import java.util.Scanner;

public class TestArraySortCau3 {
	private static Scanner nhapVao;

	public static void main(String[] args) {
		ArraySort<Integer> mangInt = new ArraySort<>(100000000);

		Random rd = new Random();

		System.out.println(
				"=====Bubble Sort=====\n" + "-----------Integer-----------\n" + "Kiem tra mang co rong khong: ");
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt + "\nChen phan tu vao mang: ");

		nhapVao = new Scanner(System.in);
		System.out.print("Nhap so phan tu mang: ");
		int nBubbleSort = nhapVao.nextInt();

		int[] aBubbleSort = new int[nBubbleSort];
		for (int i = 0; i < nBubbleSort; i++) {
			aBubbleSort[i] = rd.nextInt(50);
			mangInt.intsert(aBubbleSort[i]);
		}

		if (nBubbleSort > 10) {

			System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
			System.out.println("Sap xep: ");

			mangInt.bubbleSortNew();

			System.out.println("mang da sap xep!!" + "\nso lan so sanh: \t" + mangInt.demSoSanhBubbleSort
					+ "\nso lan hoan vi: \t" + mangInt.demHoanViBubbleSort);
			System.out.println("Xoa mang vua tao: ");
			mangInt.clear();
			System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
			System.out.println(mangInt.toString());
		} else {

			System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
			System.out.println(mangInt + "\nSap xep: ");

			mangInt.bubbleSortNew();

			System.out.println(mangInt + "\nso lan so sanh: \t" + mangInt.demSoSanhBubbleSort + "\nso lan hoan vi: \t"
					+ mangInt.demHoanViBubbleSort);
			System.out.println("Xoa mang vua tao: ");
			mangInt.clear();
			System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
			System.out.println(mangInt.toString());
		}
		///////////////////////////////////////
		System.out.println(
				"=====Insertion Sort=====\n" + "-----------Integer-----------\n" + "Kiem tra mang co rong khong: ");
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt + "\nChen phan tu vao mang: ");

		nhapVao = new Scanner(System.in);
		System.out.print("Nhap so phan tu mang: ");
		int nInsertionSort = nhapVao.nextInt();

		int[] aInsertionSort = new int[nInsertionSort];
		for (int i = 0; i < nInsertionSort; i++) {
			aInsertionSort[i] = rd.nextInt(50);
			mangInt.intsert(aInsertionSort[i]);
		}

		if (nInsertionSort > 10) {
			System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
			System.out.println("Sap xep: ");

			mangInt.insertionSort();

			System.out.println("mang da sap xep!!" + "\nso lan so sanh: \t" + mangInt.demSoSanhInsertionSort
					+ "\nso lan hoan vi: \t" + mangInt.demHoanViInsertionSort);
			System.out.println("Xoa mang vua tao: ");
			mangInt.clear();
			System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
			System.out.println(mangInt.toString());
		} else {
			System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
			System.out.println(mangInt + "\nSap xep: ");

			mangInt.insertionSort();

			System.out.println(mangInt + "\nso lan so sanh: \t" + mangInt.demSoSanhInsertionSort
					+ "\nso lan hoan vi: \t" + mangInt.demHoanViInsertionSort);
			System.out.println("Xoa mang vua tao: ");
			mangInt.clear();
			System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
			System.out.println(mangInt.toString());
		}
	}
}
