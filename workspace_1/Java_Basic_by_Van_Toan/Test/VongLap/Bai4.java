package VongLap;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap vao so a:");
		int a = in.nextInt();
		System.out.print("Nhap vao so b: ");
		int b = in.nextInt();

		// uoc chung lon nhat cua 2 so nguyen a va b la
		System.out.printf("uc chung lon nhat cua %d va  %d la  : %d", a, b,
				UCLN(a, b));
		// boi so chung nho nhat cua a va b
		System.out.printf("\nBoi chung nho nhat cua %d va  %d la  : %d", a, b,
				BCNN(a, b));
	}

	public static int UCLN(int a, int b) {
		int UCLN = 1;
		int k = 2;
		while (k <= a && k <= b) {
			if (a % k == 0 && b % k == 0)
				UCLN = k;
			k++;
		}
		return UCLN;
	}

	public static int BCNN(int a, int b) {
		return (a * b) / UCLN(a, b);
	}
}
