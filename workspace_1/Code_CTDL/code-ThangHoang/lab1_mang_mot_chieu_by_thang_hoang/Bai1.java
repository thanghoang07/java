/*Bài 1: Viết chương trình nhập vào số nguyên n: 
1. Viết phương thức để trả v�? một mảng số thực gồm n phần tử 
2. Viết phương thức gán giá trị x cho phần tử cuối cùng 
3. Viết phương thức trả v�? tổng của 2 phần tử đầu tiên. 
4. Viết phương thức sử dụng vòng lặp tính toán tổng của tất cả các phần tử trong mảng 
5. Viết phương thức dùng vòng lặp để tìm giá trị nh�? nhất trong mảng 
6. Tự động tạo ra một số ngẫu nhiên index < n và hiển thị giá trị của phần tử tại vị trí index 
7. Dùng array initializer để tạo một mảng với giá trị khởi tạo là 3.5, 5.5, 4.52 và 5.6 
*/
package lab1_mang_mot_chieu_by_thang_hoang;

import java.util.Random;
import java.util.Scanner;

public class Bai1
{
	static Scanner nhapVao;
	static int mang1[];
	static int n = 0;
	static int m = 0;
	static int i;
	static final int MAX = 10;
	
	static int[] taoMang(int n)
	{
		int[] mang1 = new int[n];
		Random abc = new Random();  
	    for( i = 0; i < n; i++)  
	    	mang1[i] = abc.nextInt(MAX);
		return mang1;
	}
	static void  inMang(int[] mang1)
	{
		/*for( i = 0; i < n; i++)  
	      System.out.print(mang1[i] + "\t");  */
		for (int x : mang1) 
			System.out.print(x + "\t");
	}
	static void  inMang1(int[] mang_b_1)
	{
		int A = 0;
		mang_b_1[n - 1] = A;
		for( i = 0; i < n; i++)  
	      System.out.print(mang_b_1[i] + "\t");  
	}	
	static int   tinhTong(int mang1[], int n )
	{
		int tong = 0;
		for( i = 0; i < n; i++)
			tong += mang1[i];
		return tong;
	}
	static int   tingTongDauCuoi(int mang1[], int n)
	{
		int tong_Dau_Cuoi = 0;
		for( i = 0; i < n; i++)
			tong_Dau_Cuoi = mang1[n-1] + mang1[0];
		return tong_Dau_Cuoi;
	}
	static int   tingTongHaiSoDau(int mang1[], int n)
	{
		int tong_Hai_So_Dau = 0;
		for( i = 0; i < n; i++)
			tong_Hai_So_Dau = mang1[1] + mang1[0];
		return tong_Hai_So_Dau;
	}
	static float tinhTrungBinhCuaMang(int mang1[], int n)
	{
		float trung_Binh = 0;
		float tong = 0;
		for (int i = 0; i < n; i++)
			tong += mang1[i];
			trung_Binh = tong / n;
		return trung_Binh;
	}
	static void  daoNguocMang(int mang_c_1[])
	{		
		for(int j = n -1; j >= 0 ; j--)
			System.out.print(mang_c_1[j] + "\t");
	}
	static int   giaTriNhoNhat(int mang1[], int n)
	{
		int min = mang1[0];
		for (int i = 0; i < n; i++)
			if(mang1[i] < min)
				min = mang1[i];
		return min;
	}
	static int   indexOfRandom(int mang1[], int n, int m)
	{
		int index1 = m;
		for (int i = 0; i < n; i++)
		 	if(mang1[i] == mang1[m])
				index1 = mang1[i];
		return index1;
	}
	static void  arrayInitializer(double mang2[]) 
	{
		for (int i = 0; i < mang2.length; i++) 
			System.out.print(mang2[i] + "\t");
	}
	public static void main(String[] args)
	{
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao phan tu n: ");
		n = nhapVao.nextInt();
		
		System.out.print("Nhap vao so m: ");
		m = nhapVao.nextInt();
		
		System.out.print("1.Mang da tao la: \n");
		int[] mang1 = new int[n];
		mang1 = taoMang(n);
		inMang(mang1);
				
		System.out.print("\n2.Gan gia tri cho phan tu cuoi: \n" );
		int[] mang_b_1 = mang1.clone();
		
		inMang1(mang_b_1);
		System.out.print("\n3.Tinh tong hai phan tu dau tien: \t\t\t" 
				+ tingTongHaiSoDau(mang1, n));
		System.out.print("\n4.Tinh tong cac phan tu trong mang: \t\t\t" 
				+ tinhTong(mang1, n));
		System.out.print("\n4.1.Tinh trung binh cac phan tu "
				+ "trong mang: \t\t"
				+ tinhTrungBinhCuaMang(mang1, n));
		System.out.print("\n5.Gia tri nho nhat la: \t\t\t\t\t" 
				+ giaTriNhoNhat(mang1, n));
		System.out.print("\n5.1.Dao nguoc mang: \n");
				int[] mang_c_1 = mang1.clone();
				daoNguocMang(mang_c_1);
		System.out.print("\n6.Hien thi gia tri cua "
				+ "phan tu tai vi tri index(" + m + ") la: \t" 
				+ indexOfRandom(mang1, n, m));
		System.out.print("\n7.Dung array initializer de tao mot mang la: \n");
		double[] mang2 = {3.5, 5.5, 4.52, 5.6};
		arrayInitializer(mang2 );
	}
}

