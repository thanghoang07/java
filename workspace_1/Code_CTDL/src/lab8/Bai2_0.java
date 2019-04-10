package lab8;

import java.util.Random;
import java.util.Scanner;

public class Bai2_0 {
	private static Scanner nhapVao;

	public static void main(String[] args) {
		ArraySearch<Integer> mangInt = new ArraySearch<>(100000000);

		Random abc = new Random();
		System.out.println(
				"=====Sequential Search=====\n" + "-----------Integer-----------\n" + "Kiem tra mang co rong khong: ");
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt.toString() + "\nChen phan tu vao mang: ");

		nhapVao = new Scanner(System.in);
		System.out.print("Nhap so phan tu mang: ");
		int nSequentialSearch = nhapVao.nextInt();
		System.out.print("Nhap vao gia tri can tim: ");
		int searchKey = nhapVao.nextInt();

		int[] aSequentialSearch = new int[nSequentialSearch];
		for (int i = 0; i < nSequentialSearch; i++) {
			aSequentialSearch[i] = abc.nextInt(10);
			mangInt.intsert(aSequentialSearch[i]);
		}
		if (nSequentialSearch > 10) {
			System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
			System.out.println("Sap xep: ");
			mangInt.mergeSort(0, nSequentialSearch - 1);
			System.out.println("\nTim Kiem: \n");
			
			if (mangInt.sequentialSearch(searchKey) == -1) {
				System.out.println("Khong tim thay " + searchKey + " o trong mang!!");
			} else {
				System.out.println("Tim thay " + searchKey + " o vi tri so: " + mangInt.sequentialSearch(searchKey));
			}
			
			System.out.println("mang da sap xep!!" + "\nso lan so sanh: \t" + mangInt.demSoSanhSequentialSearch);
			System.out.println("Xoa mang vua tao: ");
			mangInt.clear();
			System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
			System.out.println(mangInt.toString());
		} else if(nSequentialSearch <= 10 && nSequentialSearch != 0){
			System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
			System.out.println(mangInt + "\nSap xep: ");
			mangInt.mergeSort(0, nSequentialSearch - 1);
			System.out.println("In mang da sap xep: \n" + mangInt + "\nTim Kiem: ");
			
			if (mangInt.sequentialSearch(searchKey) == -1) {
				System.out.println("Khong tim thay " + searchKey + " o trong mang!!");
			} else {
				System.out.println("Tim thay " + searchKey + " o vi tri so: " + mangInt.sequentialSearch(searchKey));
			}
			
			System.out.println("\nso lan so sanh: \t" + mangInt.demSoSanhSequentialSearch);
			System.out.println("Xoa mang vua tao: ");
			mangInt.clear();
			System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
			System.out.println(mangInt.toString());
		}
		else
		{
			System.out.println("mang khong ton tai!!!!");
		}
		/////////////////////////////////////////////////
		System.out.println(
				"=====Binary Search=====\n" + "-----------Integer-----------\n" + "Kiem tra mang co rong khong: ");
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt.toString() + "\nChen phan tu vao mang: ");

		nhapVao = new Scanner(System.in);
		System.out.print("Nhap so phan tu mang: ");
		int nbinarySearch = nhapVao.nextInt();
		System.out.print("Nhap vao gia tri can tim: ");
		int searchKey1 = nhapVao.nextInt();

		int[] abinarySearch = new int[nbinarySearch];
		for (int i = 0; i < nbinarySearch; i++) {
			abinarySearch[i] = abc.nextInt(10);
			mangInt.intsert(abinarySearch[i]);
		}
		if (nbinarySearch > 10) {
			System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
			System.out.println("Sap xep: ");
			mangInt.mergeSort(0, nbinarySearch - 1);
			System.out.println("\nTim Kiem: \n");
			
			if (mangInt.sequentialSearch(searchKey1) == -1) {
				System.out.println("Khong tim thay " + searchKey1 + " o trong mang!!");
			} else {
				System.out.println("Tim thay " + searchKey1 + " o vi tri so: " + mangInt.binarySearch(searchKey1, 0, nbinarySearch -1));
			}
			
			System.out.println("mang da sap xep!!" + "\nso lan so sanh: \t" + mangInt.demSoSanhBinarySearch);
			System.out.println("Xoa mang vua tao: ");
			mangInt.clear();
			System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
			System.out.println(mangInt.toString());
		} else if(nbinarySearch <= 10 && nbinarySearch != 0){
			System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
			System.out.println(mangInt + "\nSap xep: ");
			mangInt.mergeSort(0, nbinarySearch - 1);
			System.out.println("In mang da sap xep: \n" + mangInt + "\nTim Kiem: ");
			
			if (mangInt.sequentialSearch(searchKey1) == -1) {
				System.out.println("Khong tim thay " + searchKey1 + " o trong mang!!");
			} else {
				System.out.println("Tim thay " + searchKey1 + " o vi tri so: " + mangInt.binarySearch(searchKey1, 0, nbinarySearch -1));
			}
			
			System.out.println("\nso lan so sanh: \t" + mangInt.demSoSanhBinarySearch);
			System.out.println("Xoa mang vua tao: ");
			mangInt.clear();
			System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
			System.out.println(mangInt.toString());
		}
		else
		{
			System.out.println("mang khong ton tai!!!!");
		}
	}

}
