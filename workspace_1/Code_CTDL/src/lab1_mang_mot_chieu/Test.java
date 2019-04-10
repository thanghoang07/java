package lab1_mang_mot_chieu;

import java.util.Scanner;

public class Test 
{
	static Scanner nhapVao;
	static int mang1[];
	static int n = 0;
	static int m = 0;
	static int i;
	
	public static void main(String[] args) 
	{
		nhapVao = new Scanner(System.in);
		System.out.print("Bai 1: \nNhap vao phan tu n: ");
		n = nhapVao.nextInt();
		
		System.out.print("Nhap vao so m: ");
		m = nhapVao.nextInt();
		
		System.out.print("1.Mang da tao la: \n");
		int[] mang1 = new int[n];
		mang1 = Bai1.taoMang(n);
		Bai1.inMang(mang1);
				
		System.out.print("\n2.Gan gia tri cho phan tu cuoi: \n" );
		int[] mang_b_1 = mang1.clone();
		
		Bai1.inMang1(mang_b_1);
		System.out.print("\n3.Tinh tong hai phan tu dau tien: \t\t\t" 
				+ Bai1.tingTongHaiSoDau(mang1, n));
		System.out.print("\n4.Tinh tong cac phan tu trong mang: \t\t\t" 
				+ Bai1.tinhTong(mang1, n));
		System.out.print("\n4.1.Tinh trung binh cac phan tu "
				+ "trong mang: \t\t"
				+ Bai1.tinhTrungBinhCuaMang(mang1, n));
		System.out.print("\n5.Gia tri nho nhat la: \t\t\t\t\t" 
				+ Bai1.giaTriNhoNhat(mang1, n));
		System.out.print("\n5.1.Dao nguoc mang: \n");
				int[] mang_c_1 = mang1.clone();
				Bai1.daoNguocMang(mang_c_1);
		System.out.print("\n6.Hien thi gia tri cua "
				+ "phan tu tai vi tri index(" + m + ") la: \t" 
				+ Bai1.indexOfRandom(mang1, n, m));
		System.out.print("\n7.Dung array initializer de tao mot mang la: \n");
		double[] mang2 = {3.5, 5.5, 4.52, 5.6};
		Bai1.arrayInitializer(mang2 );
	}
}
