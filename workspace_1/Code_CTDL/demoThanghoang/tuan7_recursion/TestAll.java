package tuan7_recursion;

import java.util.Random;
import java.util.Scanner;

public class TestAll {
	static Scanner nhapVao;
	static int soN = 0;
	static int heMCanChuyen;
	static int soGiayCanChuyen;
	static TestAll test;
	static int daoNguoc;
	static int mang1[];
	static int i;
	static final int MAX = 10;

	static int[] taoMang(int n) {
		int[] mang1 = new int[n];
		Random abc = new Random();
		for (i = 0; i < n; i++)
			mang1[i] = abc.nextInt(MAX);
		return mang1;
	}

	static void inMang(int[] mang1) {
		for (int x : mang1)
			System.out.print(x + "|");
	}

	public static String daoChuoi(String str, int n) {
		if (n == 1)
			return str.charAt(n - 1) + " ";// base cases
		else
			return str.charAt(n - 1) + daoChuoi(str, n - 1); // general case
	}

	public static int tongLe(int n) {
		if (n <= 2)
			return 1;
		else {
			if (n % 2 != 0)
				return n + tongLe(n - 2);
			else
				return n + tongLe(n - 3);
		}
	}

	public static void doiHe(int n) {
		if (heMCanChuyen < 16) {
			if (n < heMCanChuyen)
				System.out.print(n);
			else {
				doiHe(n / heMCanChuyen);
				doiHe(n % heMCanChuyen);
			}
		} else
			System.out.println("-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-");
	}

	public static String doiGio(int n) {
		if (n == 0)
			return 0 + " gio " + 0 + " phut " + 0 + " giay";
		else {
			if (n < 60)
				return n + " giay";
			else if (n < 3600 && n >= 60)
				return 0 + " gio " + n / 60 + " phut " + doiGio(n % 60);
			else
				return (n / 3600) + " gio " + (n % 3600) / 60 + " phut " + doiGio((n % 3600) % 60);
		}
	}

	public boolean kiemTraSoNT(int a) {
		int i = 2;
		if (a < 2)
			return false;
		else if (a % i == 0 && i <= Math.sqrt(a)) {
			return false;
		}
		return true;
	}

	public static int tongChuSo(int n) {
		if (n == 0)
			return 0;
		else
			return n % 10 + tongChuSo(n / 10);
	}

	public static void daoNguoc(int n) {
		if (n < 10)
			System.out.print(n);
		else {
			System.out.print(n % 10);
			daoNguoc(n / 10);
		}
	}

	public static int tongMang(int a[], int m) {
		if (m == 1)
			return a[0];
		else
			return a[m - 1] + tongMang(a, m - 1);
	}

	public static int min(int[] mang, int cuoi) {
		if (cuoi == 0)
			return mang[0];
		else {
			if (mang[cuoi - 1] < min(mang, cuoi - 1))
				return mang[cuoi - 1];
			else
				return min(mang, cuoi - 1);
		}
	}

	public static int max(int[] mang1, int dau) {
		if (dau == 0)
			return mang1[0];
		else {
			if (mang1[dau - 1] > max(mang1, dau - 1))
				return mang1[dau - 1];
			else
				return max(mang1, dau - 1);
		}
	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);

		// chuoi

		System.out.println("Bai 1: ");
		System.out.println("Nhap vao mot chuoi ky tu: ");
		String demo = nhapVao.nextLine();
		int chuoi = demo.length();

		System.out.println("chuoi bt : " + demo + "\ndo dai: " + chuoi);
		System.out.println("chuoi dao: " + daoChuoi(demo, chuoi) + "\ndo dai: " + chuoi);
		// tong so le tu 1 den 2 * n - 1

		System.out.println("\nBai 2: ");
		System.out.print("Nhap vao n: ");
		soN = nhapVao.nextInt();

		System.out.println("Tong cac so le tu 1 den " + soN + " la: " + tongLe(soN));
		// doi mot so tu thap phan sang he bat ky

		System.out.println("\nBai 3: ");
		System.out.print("Nhap vao he m can chuyen: ");
		heMCanChuyen = nhapVao.nextInt();
		System.out.print("Nhap vao so n can chuyen: ");
		soN = nhapVao.nextInt();

		System.out.println("Chuyen qua he " + heMCanChuyen + " la: ");
		doiHe(soN);
		// doi giay

		System.out.println("\nBai 4: ");
		System.out.print("Nhap vao so giay can doi: ");
		soGiayCanChuyen = nhapVao.nextInt();

		System.out.println(doiGio(soGiayCanChuyen));
		// kiem tra so NT

		System.out.println("\nBai 5: ");
		test = new TestAll();
		System.out.print("Nhap vao mot so de kiem tra: ");
		int soTest = nhapVao.nextInt();

		if (test.kiemTraSoNT(soTest))
			System.out.println("so " + soTest + " la so NT");
		else
			System.out.println("so " + soTest + " ko la so NT");
		// tong cac chu so trong mot so

		System.out.println("\nBai 6: ");
		System.out.println("Nhap vao mot day chu so: ");
		soN = nhapVao.nextInt();

		System.out.println("tong cua " + soN + " la: " + tongChuSo(soN));
		// dao nguoc

		System.out.println("\nBai 7: ");
		System.out.print("Nhap vao phan tu n: ");
		daoNguoc = nhapVao.nextInt();

		System.out.println("dao nguoc so " + daoNguoc + " la: ");
		daoNguoc(daoNguoc);
		// mang

		System.out.println("\n\nBai 8: ");
		System.out.print("Nhap vao phan tu n: ");
		soN = nhapVao.nextInt();

		System.out.print("Mang da tao la: \n");
		int a[] = new int[soN];
		a = taoMang(soN);
		inMang(a);

		int m = a.length;

		System.out.println("\nTong cac phan tu" + " trong mang la: " + tongMang(a, m));
		// tim min max trong mang

		System.out.println("\nBai 9: ");
		System.out.print("Nhap vao phan tu n: ");
		soN = nhapVao.nextInt();

		System.out.print("Mang da tao la: \n");
		a = taoMang(soN);
		inMang(a);

		System.out.println("\nGia tri nho nhat" + " trong mang la: " + min(a, soN));

		System.out.println("Gia tri lon nhat" + " trong mang la: " + max(a, soN));
	}
}
