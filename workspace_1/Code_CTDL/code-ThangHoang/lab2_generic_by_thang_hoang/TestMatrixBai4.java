package lab2_generic_by_thang_hoang;

import java.util.Random;
import java.util.Scanner;

public class TestMatrixBai4 
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
		System.out.print("Test Bai 4"
				 + "\nNhap vao so hang cua ma tran vuong: ");
		int n = nhapVao.nextInt();
		/*System.out.print("\n nhao vao so cot cua ma tran: ");
		int m = nhapVao.nextInt();*/
		
		
	    Integer in1[][]  = new Integer[n][n];
	    Integer in2[][]  = new Integer[n][n];
	    
	    taoMaTran(in1, n, n);
	    taoMaTran(in2, n, n);

	    IntegerMatrix matranSoNguyen = new IntegerMatrix();

	    System.out.println("\nCong hai ma tran so ngyuen la: ");
	    Bai4.inRaKetQua(in1, in2, matranSoNguyen.congHaiMaTran(in1, in2), '+');

	    System.out.println("\nNhan hai ma tran so ngyuen la: ");
	    Bai4.inRaKetQua(in1, in2, matranSoNguyen.nhanHaiMaTran(in1, in2), '*');
	    //Phan So
	    Random abc = new Random();
	    
		
		Rational[][] ra1 = new Rational[n][n];
		Rational[][] ra2 = new Rational[n][n];
		
		soA = abc.nextInt(9) + 10;
		soB = abc.nextInt(9) + 10;
		soC = abc.nextInt(9) + 10;
		soD = abc.nextInt(9) + 10;
		
		for (int i = 0; i < ra1.length; i++)
			for (int j = 0; j < ra1[0].length; j++)
			{
				ra1[i][j] = new Rational(i + soA, j + soB);
		        ra2[i][j] = new Rational(i + soD, j + soD);
			}
		RationalMatrix rationalMatrix = new RationalMatrix();
		System.out.println("\nCong hai ma tran phan so la: ");		
		Bai4.inRaKetQua(
		    ra1, ra2, rationalMatrix.congHaiMaTran(ra1, ra2), '+');

		System.out.println("\nNhan hai ma tran phan so 2 la: ");
		Bai4.inRaKetQua(
		    ra1, ra2, rationalMatrix.nhanHaiMaTran(ra1, ra2), '*');
	 }
}
