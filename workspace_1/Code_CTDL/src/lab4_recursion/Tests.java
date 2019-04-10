package lab4_recursion;

import java.util.Scanner;

public class Tests 
{
	private final static int DODAIMATRAN = 5; 
	public static int n = 0;
	public static int n1 = 0;
	public static int m;
	private static Scanner nhapVao;

	public static void main(String[] args)
	{
		// bai1
		System.out.println("------Bai 1------\n Dao chuoi");
		String demo = new String("live-1");
		
		n = demo.length();
		System.out.println(
				"chuoi binh thuong : " + demo 
				+ "\ndo dai: " + n);
		System.out.println(
				"chuoi dao: " + Bai1.daoChuoi(demo, n) 
				+ "\ndodai: " + n);
		System.out.println("Nhap vao mot chuoi bat ky: ");
		
		nhapVao = new Scanner(System.in);
		String demo1 = nhapVao.nextLine();
		n1 = demo1.length();
		System.out.println(
				"chuoi binh thuong : " + demo1 
				+ "\ndo dai: " + n1);
		System.out.println(
				"chuoi dao: " + Bai1.daoChuoi(demo1, n1) 
				+ "\ndodai: " + n1);
		
		// bai2
		System.out.println("------Bai 2------\n Tong le");
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		n = nhapVao.nextInt();
		System.out.println(
				"Tong cac so le tu 1 den " + n 
				+ " la: " + Bai2.tongLe(n));

		// bai 3
		System.out.println("------Bai 3------\n Doi he");
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao so n can chuyen: ");
		n = nhapVao.nextInt();
		System.out.print("Nhap vao he m can chuyen: ");
		m = nhapVao.nextInt();
		System.out.println("Chuyen qua he " + m + " la: ");
		Bai3.doiHe(n, m);

		// bai 4_1
		System.out.println("\n------Bai 4------\n Doi gio");
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao so giay can doi: ");
		n = nhapVao.nextInt();
		System.out.println(Bai4.doiGio(n));

		// bai 5
		System.out.println("------Bai 5------\n So nguyen to");
		Bai5 test = new Bai5();
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao mot so: ");
		int n = nhapVao.nextInt();
		if (test.kiemTraSoNT(n))
			System.out.println("so " + n + " la so NT");
		else
			System.out.println("so " + n + " ko la so NT");

		// bai 6
		System.out.println("------Bai 6------\n Tong day so");
		nhapVao = new Scanner(System.in);
		System.out.println("Nhap vao mot chu so: ");
		int daySo = nhapVao.nextInt();
		System.out.println(
				"tong cua " + daySo + " la: " 
						+ Bai6.tongChuSo(daySo));

		// bai 7
		System.out.println("------Bai 7------\n Dao so");
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao phan tu n: ");
		n = nhapVao.nextInt();
		System.out.println("dao nguoc so " + n + " la: ");
		Bai7.daoNguoc(n);

		// bai 8
		System.out.println("\n------Bai 8------\n Tong mang");
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao phan tu n: ");
		n = nhapVao.nextInt();
		System.out.print("Mang da tao la: \n");
		int a[] = new int[n];
		a = Bai8.taoMang(n);
		Bai8.inMang(a);
		int m = a.length;
		System.out.println(
				"\nTong cac phan tu trong mang la: " 
						+ Bai8.tongMang(a, m));

		// bai 9
		System.out.println("------Bai 9------\n Gia tri lon nho");
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao phan tu n: ");
		n = nhapVao.nextInt();
		System.out.print("Mang da tao la: \n");
		a = Bai9.taoMang(n);
		Bai9.inMang(a);
		System.out.println(
				"\nGia tri nho nhat trong mang la: " 
						+ Bai9.min(a, n));
		System.out.println(
				"Gia tri lon nhat trong mang la: " 
						+ Bai9.max(a, n));
		
		// bai 10
		System.out.println("------Bai 10------\n In hinh");
		System.out.print("Nhap vao so phan tu n: ");
		n = nhapVao.nextInt();

		Bai10.printStar1(1, n);
		System.out.println();
		Bai10.printStar2(1, n);
		
		// bai 11
		System.out.println("------Bai 11------\n Thap Ha Noi");
		System.out.print("Nhap vao so dia: ");
		n = nhapVao.nextInt();

		System.out.println("Cac buoc chuyen:");
		Bai11.chuyenDia(n, 'A', 'B', 'C');
		
		// bai 12
		System.out.println("------Bai 12------\n 8 quan hau");
		
		
		// bai 13
		System.out.println("------Bai 13------\n Ma di tuan");
		System.out.printf("nhap vao so hang tu 0 - " 
				+ (DODAIMATRAN - 1) + ": ");
        int hang = nhapVao.nextInt();
        System.out.printf("nhap vao so cot tu 0 - " 
        		+ (DODAIMATRAN - 1) + ": ");
        int cot = nhapVao.nextInt();
        System.out.println("In ra: ");
        Bai13.giaiQuyet(hang, cot);
        
        // bai 14
        System.out.println("------Bai 14------\n Thay tu va con quy");
	}
}
