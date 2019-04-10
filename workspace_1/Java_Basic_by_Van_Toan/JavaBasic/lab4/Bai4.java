package lab4;

import java.util.Scanner;

public class Bai4 {
	public static int[] createArray(int n) {
		int[] arrInts = new int[n];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			arrInts[i] = in.nextInt();
		}
		return arrInts;
	}

	public static void printArray(int[] arrInts) {
		System.out.print("Mảng đã nhập vào là : ");
		for (int i = 0; i < arrInts.length; i++) {
			System.out.print(arrInts[i] + "  ");
		}
	}

	public static void daoThuTu(int[] myList) {
		// chia mang thanh 2 phan bang nhau
		for (int i = 0; i < myList.length / 2; i++) {
			int temp = myList[i];
			// hoan doi myList[i] vs myList[do dai - i - 1]
			// gan gia tri a[0] cho a[6]
			myList[i] = myList[myList.length - i - 1];
			// gan gia tri a[6] cho a[0]
			myList[myList.length - i - 1] = temp;
		}
		// in cac gia tri sau khi dao nguoc
		System.out.print("\nMảng sau khi chuyển là : ");
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + "  ");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập vào n : ");
		int n = in.nextInt();
		int[] myList = new int[n];

		// gán gía trị cho mang
		myList = createArray(n);
		// in mang
		printArray(myList);

		// đảo thứ tự dãy
		daoThuTu(myList);
	}
}
