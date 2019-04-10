package de1;

import java.util.Random;
import java.util.Scanner;

public class Cau1 {
	public static int[] createArr(int n) {
		int[] arr = new int[n];
		Random abc = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = abc.nextInt(10);
		}
		return arr;
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%3d", arr[i]);
		}
		System.out.println();
	}
	
	public static int[] boTrung(int[] arr){
		int[] temp = new int[arr.length];
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if(arr[j] == arr[j +1]){
					temp[i] = arr[j];
				}
			}
		}
		return temp;
	}

	public static int countX(int[] arr, int soX) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (soX != arr[i]) {
				count = count;
			} else {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("Cau A: \nNhap vao so n: ");
//		int n = sc.nextInt();
//		int[] arr = createArr(n);
//		System.out.printf("Mang voi do dai %3d la: \n", n);
//		printArr(arr);
//		System.out.print("Nhap vao mot so: ");
//		int soX = sc.nextInt();
//		System.out.printf("So lan xuat hien cua %3d la: %3d\n", soX, countX(arr, soX));
		System.out.print("Cau B: \nNhap vao so m: ");
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		System.out.println("Nhap vao phan tu cua mang: ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.printf("Mang voi do dai %3d la: \n", m);
		printArr(arr2);
		printArr(boTrung(arr2));
	}
}
