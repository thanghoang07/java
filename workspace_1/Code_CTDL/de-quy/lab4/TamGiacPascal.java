package lab4;

import java.util.Scanner;

public class TamGiacPascal 
{
	private static Scanner nhapVao;

	public static void tamGiacPascal(int mang1[][], int h, int i, int j)
	{
		if(i == h)
			return;
		else if(j == 0 && i != j)
		{
			mang1[i][j] = 1;
			System.out.print(mang1[i][j] + "--\n");
			tamGiacPascal(mang1, h, i, j + 1);
		}
		else if(i == j)
		{
			mang1[i][j] = 1;
			System.out.print(mang1[i][j]);
			tamGiacPascal(mang1, h, i + 1, 0);
		}
		else if(j > 0 && j < h)
		{
			mang1[i][j] = mang1[i - 1][j - 1] + mang1[i - 1][j];
			System.out.print(mang1[i][j] + "--\n");
			tamGiacPascal(mang1, h, i, j + 1);
		}
	}
		
	public static void main(String[] args) 
	{
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao phan tu n: ");
		int n = nhapVao.nextInt();
		int mang1[][] = new int [n][n];
		int h;
		
		System.out.println("nhap vao chieu cao tam giac: ");
		h = nhapVao.nextInt();
		System.out.println(" ");
		tamGiacPascal(mang1, h, 0, 0);
	}
}
