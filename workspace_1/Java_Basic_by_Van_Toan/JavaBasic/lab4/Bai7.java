package lab4;

import java.util.Scanner;

public class Bai7 {
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

	public static void doiXung(int[] myList, int n) {
		for (int i = 0; i < n; i++) {
			if (myList[i] == myList[n - i - 1])
				System.out.println("\na. Dãy đỗi xứng");
			else
				System.out.println("\na. Dãy không đối xứng");
			break;
		}
	}

	public static boolean danDau(int[] myList, int n) {
		for (int i = 0; myList[i] != 0; i++) {
			if (myList[i] * myList[i + 1] >= 0)
				return false;

		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập vào n : ");
		int n = in.nextInt();
		int[] myList = new int[n];
		myList = createArray(n);
		printArray(myList);

		doiXung(myList, n);
		danDau(myList, n);
	}
}
