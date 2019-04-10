package tuan7_recursion;

import java.util.Scanner;

public class Tests 
{
	public static int n = 0;
	public static int m;
	private static Scanner nhapVao;

	public static void main(String[] args)
	{
		// bai1
		System.out.println("Bai 1: ");
		String demo = new String("live-1");
		n = demo.length();
		System.out.println("chuoi bt : " + demo + "\ndo dai: " + n);
		System.out.println("chuoi dao: " + Bai1.daoChuoi(demo, n) + "\ndodai: " + n);

		// bai2
		System.out.println("Bai 2: ");
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		n = nhapVao.nextInt();
		System.out.println("Tong cac so le tu 1 den " + n + " la: " + Bai2.tongLe(n));

		// bai3
		System.out.println("Bai 3: ");
		System.out.print("Nhap vao so can chuyen: ");
		n = nhapVao.nextInt();
		System.out.println("Chuyen sang he nhi phan: ");
		Bai3.doiHe(n);

		// bai 3_1
		nhapVao = new Scanner(System.in);
		System.out.print("\nNhap vao so n can chuyen: ");
		n = nhapVao.nextInt();
		System.out.print("Nhap vao he m can chuyen: ");
		m = nhapVao.nextInt();
		System.out.println("Chuyen qua he " + m + " la: ");
		Bai3_1.doiHe(n, m);

		// bai 4_1
		System.out.println("\nBai 4: ");
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao so giay can doi: ");
		n = nhapVao.nextInt();
		System.out.println(Bai4_1.doiGio(n));

		// bai 5
		System.out.println("Bai 5: ");
		Bai5 test = new Bai5();
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao mot so: ");
		int n = nhapVao.nextInt();
		if (test.kiemTraSoNT(n))
			System.out.println("so " + n + " la so NT");
		else
			System.out.println("so " + n + " ko la so NT");

		// bai 6
		System.out.println("Bai 6: ");
		nhapVao = new Scanner(System.in);
		System.out.println("Nhap vao mot chu so: ");
		int daySo = nhapVao.nextInt();
		System.out.println("tong cua " + daySo + " la: " + Bai6.tongChuSo(daySo));

		// bai 7
		System.out.println("Bai 7: ");
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao phan tu n: ");
		n = nhapVao.nextInt();
		System.out.println("dao nguoc so " + n + " la: ");
		Bai7.daoNguoc(n);

		// bai 8
		System.out.println("\nBai 8: ");
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao phan tu n: ");
		n = nhapVao.nextInt();
		System.out.print("Mang da tao la: \n");
		int a[] = new int[n];
		a = Bai8.taoMang(n);
		Bai8.inMang(a);
		int m = a.length;
		System.out.println("\nTong cac phan tu trong mang la: " + Bai8.tongMang(a, m));

		// bai 9
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao phan tu n: ");
		n = nhapVao.nextInt();
		System.out.print("Mang da tao la: \n");
		a = Bai9.taoMang(n);
		Bai9.inMang(a);
		System.out.println("\nGia tri nho nhat trong mang la: " + Bai9.min(a, n));
		System.out.println("Gia tri lon nhat trong mang la: " + Bai9.max(a, n));
	}
}
