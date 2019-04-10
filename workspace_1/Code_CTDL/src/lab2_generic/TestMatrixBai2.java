package lab2_generic;

import java.util.Random;
import java.util.Scanner;

public class TestMatrixBai2
{
	static final int ASC = 3;
	static int soA;
	static int soB;
	static int soC;
	static int soD;
	private static Scanner nhapVao;
	
	static void taoMaTran(Integer[][] matran, Integer n, Integer m)
	{
		Random abc = new Random();
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				matran[i][j] = abc.nextInt(10);			
	}
	
	public static void main(String[] args)
	{
		nhapVao = new Scanner(System.in);
		System.out.print("Test Bai 2 dung int"
				 + "\nNhap vao so hang cua ma tran vuong: ");
		int n = nhapVao.nextInt();
				
	    Integer matran1[][]  = new Integer[n][n];
	    Integer matran2[][]  = new Integer[n][n];
	    
	    taoMaTran(matran1, n, n);
	    taoMaTran(matran2, n, n);

	    IntegerMatrix1 matranSoNguyen = new IntegerMatrix1();

	    System.out.println("\nCong hai ma tran so ngyuen la: ");
	    Bai2.inRaKetQua(matran1, matran2, matranSoNguyen.congHaiMaTran(matran1, matran2), '+');

	    System.out.println("\nNhan hai ma tran so ngyuen la: ");
	    Bai2.inRaKetQua(matran1, matran2,matranSoNguyen.nhanHaiMaTran(matran1, matran2) , '*');
	}
}
