package VongLap;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nh·∫≠p v√†o n: ");
		int n = in.nextInt();

		// uoc le nhat
		System.out.printf("a. Uoc le nhat cua %d la† %d", n, uocLeNhat(n));
		// kiem tra so nguyen to
		if (xetNguyeTo(n) == true)
			System.out.printf("\nb. So %d la†so nguyen to", n);
		else
			System.out.printf("\nb. So %d khong phai la†so nguyen to", n);
		// tim va in so nguyen to nho hon n
		inSoNguyenTo(n);
		// phan tich so n thanh thua so nguyen to
		phanTichThuaSo(n);
	}

	public static int uocLeNhat(int n) {
		int uocLe = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0 && i % 2 != 0)
				uocLe = i;
		}
		return uocLe;
	}

	public static boolean xetNguyeTo(int n) {
		if (n == 0 || n == 1)
			return false;
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void inSoNguyenTo(int n) {
		System.out.printf("\nd. Cac so nguyen to nho hon %d la†: ", n);
		for (int i = 2; i < n - 1; i++) {
			if (xetNguyeTo(i) == true)
				System.out.print("  " + i);
		}
		System.out.println();
	}

	public static void phanTichThuaSo(int n) {
		System.out.print("c. Phan tich so %d ra cac thua so nguyen to la† : ");
		for (int i = 2; n > 1;)
			if (n % 1 == 0) {
				System.out.printf("%d", i);
				// giam n
				n = n / i;
				if (n > 1)
					System.out.print(" x ");
			} else
				i++;
	}

}
