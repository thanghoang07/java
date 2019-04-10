package tuan4_mang_mot_chieu_mang_hai_chieu;

import java.util.Scanner;

public class Bai3_lab1_ctdl_hkI_2015 {
	public static int[] createArray(int n)
	{
		Scanner in = new Scanner(System.in);
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
		{
			arr[i] = in.nextInt();
			if (arr[i] == 0)
				break;
		}
		return arr;
	}

	public static void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.printf("%4d ", arr[i]);
		}
	}

	public static void lietke(int[] arr, int n)
	{
		for (int i = 0; i < n; i++)
		{
			int dem = 0;
			for (int j = 0; j < n; j++)
			{
				if (arr[i] == arr[j])
				{
					dem++;
				}
			}
			if (arr[i] != 0)
			{
				System.out.print("\n" + arr[i] + ": " + dem);
			}
		}

	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap so phan tu: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		arr = createArray(n);
		printArray(arr);
		lietke(arr, n);
	}
}
