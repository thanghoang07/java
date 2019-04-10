package lab2_generic;

import java.util.Random;
import java.util.Scanner;

public class TestMatrixBai2_1
{
	static final int ASC = 3;
	static int soA;
	static int soB;
	static int soC;
	static int soD;
	private static Scanner nhapVao;
	
	static void taoMaTran(Double[][] matran, double n, double m)
	{
		Random abc = new Random();
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				matran[i][j] = abc.nextDouble();			
	}
	
	public static void main(String[] args)
	{
		nhapVao = new Scanner(System.in);
		System.out.print("Test Bai 2 dung double"
				 + "\nNhap vao so hang cua ma tran vuong: ");
		int n = nhapVao.nextInt();
				
		Double do1[][]  = new Double[n][n];
		Double do2[][]  = new Double[n][n];
	    
	    taoMaTran(do1, n, n);
	    taoMaTran(do2, n, n);

	    DoubleMatrix matranDouble = new DoubleMatrix();

	    System.out.println("\nCong hai ma tran so ngyuen la: ");
	    Bai2_1.inRaKetQua(do1, do2, matranDouble.congHaiMaTran(do1, do2), '+');

	    System.out.println("\nNhan hai ma tran so ngyuen la: ");
	    Bai2_1.inRaKetQua(do1, do2, matranDouble.nhanHaiMaTran2_1(do1, do2), '*');
	}
}
