package lab1;

import java.util.Random;
import java.util.Scanner;

public class MangMotChieu
{
	private static Scanner nhapVao;
	
	public static int[] nhapMang(int n)
	{
		Random abc = new Random();
		int[] mang1 = new int[n];
		for (int i = 0; i < n; i++) 
			mang1[i] = abc.nextInt(10);
		return mang1;
	}
	public static void inMang(int[] mang1)
	{
		for (int x : mang1) 
			System.out.print("|" + x + "|");
	}
	public static int demPhanTuX(int mang1[], int n, int x)
	{
		int dem = 0;
		for (int i = 0; i < n; i++)
		{
			if(mang1[i] == x)
				dem++;
		}
		return dem;
	}	
	public static int max(int mang1[], int n)
	{
		int max = mang1[0];
		for (int i = 1; i < n; i++)
		{
			if(mang1[i] > max)
				max = mang1[i];
		}
		return max;
	}
	public static int min(int mang1[], int n)
	{
		int min = mang1[0];
		for (int i = 1; i < n; i++)
		{
			if(mang1[i] < min)
				min = mang1[i];
		}
		return min;
	}
	public static int tongMang(int mang1[], int n)
	{
		int tong = 0;
		for (int i = 0; i < n; i++)
		{
			tong += mang1[i];
		}
		return tong;
	}
	public static int tongHaiPhanTuDau(int mang1[], int n)
	{
		int tongDau = 0;
		for (int i = 0; i < n; i++) 
		{
			tongDau = mang1[0] + mang1[1];
		}
		return tongDau;
	}
	public static int tongHaiPhanTuDauCuoi(int mang1[], int n)
	{
		int tongDauCuoi = 0;
		for (int i = 0; i < n; i++) 
		{
			tongDauCuoi = mang1[0] + mang1[n - 1];
		}
		return tongDauCuoi;
	}
	public static int tongHaiPhanBatKy(int mang1[], int n, int viTriThuNhat, int viTriThuHai)
	{
		int tongBatKy = 0;
		for (int i = 0; i < n; i++) 
		{
			tongBatKy= mang1[0 + viTriThuNhat] + mang1[0 + viTriThuHai];
		}
		return tongBatKy;
	}
	public static int tichMang(int mang1[], int n)
	{
		int tich = 1;
		for (int i = 0; i < n; i++)
		{
			tich *= mang1[i];
		}
		return tich;
	}
	public static int tichHaiPhanTuDau(int mang1[], int n)
	{
		int tichDau = 1;
		for (int i = 0; i < n; i++)
		{
			tichDau = mang1[0] * mang1[1];
		}
		return tichDau;
	}
	public static int tichHaiPhanTuDauCuoi(int mang1[], int n)
	{
		int tichDauCuoi = 0;
		for (int i = 0; i < n; i++) 
		{
			tichDauCuoi = mang1[0] * mang1[n - 1];
		}
		return tichDauCuoi;
	}
	public static int tichHaiPhanBatKy(int mang1[], int n, int viTriThuNhat, int viTriThuHai)
	{
		int tichBatKy = 0;
		for (int i = 0; i < n; i++) 
		{
			tichBatKy= mang1[0 + viTriThuNhat] * mang1[0 + viTriThuHai];
		}
		return tichBatKy;
	}
	public static int giaTriTrungBinhTong(int mang1[], int n)
	{
		int tong = 0;
		int trungBinh = 0;
		for (int i = 0; i < n; i++)
		{
			tong += mang1[i];
		}
		trungBinh = tong / n;
		return trungBinh;
	}
	public static int giaTriTrungBinhTich(int mang1[], int n)
	{
		int tich = 1;
		int trungBinh = 0;
		for (int i = 0; i < n; i++)
		{
			tich *= mang1[i];
		}
		trungBinh = tich / n;
		return trungBinh;
	}
	public static void daoNguocMang(int mang1[], int n)
	{
		for(int j = n - 1; j >= 0 ; j--)
			System.out.print("|" + mang1[j] + "|");
	}
	
	
	public static void main(String[] args) 
	{
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao phan tu n: ");
		int n = nhapVao.nextInt();
		System.out.print("Nhap vao so m: ");
		int m = nhapVao.nextInt();
		System.out.print("Nhap vao so k: ");
		int k = nhapVao.nextInt();
		
		System.out.print("Mang da tao la: \n");
		int[] mang1 = new int[n];
		mang1 = nhapMang(n);
		inMang(mang1);
		System.out.println("\ndao nguoc mang");
		daoNguocMang(mang1, n);
		
		System.out.println("\nmax: " + max(mang1, n));
		System.out.println("min: " + min(mang1, n));
		System.out.println("dem phan tu " + m + ": " + demPhanTuX(mang1, n, m));
		
		System.out.println("tong mang: " + tongMang(mang1, n));
		System.out.println("tong dau cuoi: " + tongHaiPhanTuDauCuoi(mang1, n));
		System.out.println("tong dau: " + tongHaiPhanTuDau(mang1, n));
		System.out.println("tong vi tri " + m + " + " + k  + " la: " + tongHaiPhanBatKy(mang1, n, m, k));
		System.out.println("trung binh: " + giaTriTrungBinhTong(mang1, n));
		
		System.out.println("tich mang: " + tichMang(mang1, n));
		System.out.println("tich dau cuoi: " + tichHaiPhanTuDauCuoi(mang1, n));
		System.out.println("tich dau: " + tichHaiPhanTuDau(mang1, n));
		System.out.println("tich vi tri " + m + " + " + k  + " la: " + tichHaiPhanBatKy(mang1, n, m, k));
		System.out.println("trung binh: " + giaTriTrungBinhTich(mang1, n));
		
		
	}
}
