package lab4;

import java.util.Scanner;

public class Bai5 {
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
		System.out.print("Máº£ng Ä‘Ã£ nháº­p vÃ o lÃ  : ");
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + "  ");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nháº­p vÃ o n : ");
		int n = in.nextInt();
		int[] myList = new int[n];
		myList = createArray(n);
		printArray(myList);
		System.out.print("\nSá»‘ x : ");
		int x = in.nextInt();

		// cau a: XÃ¡c Ä‘á»‹nh xem sá»‘ x cÃ³ xuáº¥t hiá»‡n trong dÃ£y khÃ´ng
		if (xetX(myList, n, x) == true)
			System.out.printf("a. Sá»‘ %d cÃ³ xuáº¥t hiá»‡n trong dÃ£y", x);
		else
			System.out.printf(
					"a. KhÃ´ng cÃ³ pháº¥n tá»­ nÃ o trong máº£ng cÃ³ giÃ¡ trá»‹ %d", x);
		// cÃ¢u b: Cho biáº¿t sá»‘ x xuáº¥t hiá»‡n trong dÃ£y bao nhiÃªu láº§n vÃ  táº¡i cÃ¡c vá»‹
		// trÃ­ nÃ o?
		System.out.print("\nb. Sá»‘ x xuáº¥t hiá»‡n trong dÃ£y " + demX(myList, x)
				+ " vÃ  táº¡i cÃ¡c vá»‹ trÃ­ : ");
		viTriX(myList, x);
		// cau c : Loáº¡i bá»� khá»�i dÃ£y táº¥t cáº£ cÃ¡c pháº§n tá»­ báº±ng x. In cáº£ 2 dÃ£y ra
		// mÃ n hÃ¬nh.
		xoaX(myList, n, x);
	}

	public static boolean xetX(int[] myList, int n, int x) {
		for (int i = 0; i < n; i++) {
			if (myList[i] == x)
				return true;
		}
		return false;
	}

	public static int demX(int[] myList, int x) {
		int dem = 0;
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] == x)
				dem++;
		}
		return dem;
	}

	public static void viTriX(int[] myList, int x) {
		int dem1 = 0;
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] == x) {
				dem1++;
				System.out.print(" " + i);
				if (dem1 < demX(myList, x)) {
					System.out.print(" va");
				} else
					break;
			}
		}

	}

	public static void xoaX(int[] myList, int n, int k) {
		int i;
		int count = 0;

		for (i = 0; i < n; i++) {
			if (myList[i] == k)
				count++;
			else
				myList[i - count] = myList[i];
		}
		n -= count;
		System.out.printf("\nc. Máº£ng sau khi xÃ³a pháº§n tá»­ x = %d lÃ  : ", k);
		for (i = 0; i < n; i++) {
			System.out.print(myList[i] + "  ");
		}
	}
}
