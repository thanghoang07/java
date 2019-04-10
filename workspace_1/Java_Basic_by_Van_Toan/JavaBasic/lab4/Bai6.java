package lab4;

import java.util.Scanner;

public class Bai6 {
	public static int[] createArray(int n) {
		int[] arrInts = new int[n];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.printf("myList[%d] = ", i);
			arrInts[i] = in.nextInt();
		}
		return arrInts;
	}

	public static void printArray(int[] myList) {
		System.out.print("Mảng đã nhập vào là : ");
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + "  ");
		}
	}

	public static void checkArrTang(int[] myList) {// kt day so co pha la day
		for (int i = 0; i < myList.length - 1; i++) {
			if ((myList[i] > myList[i + 1])) {
				System.out.println("Mang da cho ko tang dan");
				return;
			}
		}
		System.out.println("Mang da cho  tang dan");

	}

	public static void sapXep(int[] myList, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (myList[i] > myList[j]) {
					int banDau = myList[i];
					myList[i] = myList[j];
					myList[j] = banDau;
				}
			}
		}
		System.out.print("Mảng sau khi sắp xếp là : ");
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + "  ");
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập vào n : ");
		int n = in.nextInt();
		int[] myList = new int[n];
		myList = createArray(n);
		printArray(myList);

		checkArrTang(myList);
		sapXep(myList, n);
	}
}
