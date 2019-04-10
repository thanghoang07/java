package tuan5_generic;

import java.util.Scanner;

public class TestMatranPhanSo_lab2_ctdl_hkI_2015 
{
	static final int ASC = 3;
	static int soA ;
	static int soB ;
	static int soC ;
	static int soD ;
	private static Scanner nhapVao;
	
	 public static void main(String[] args)
	 {
		 	nhapVao = new Scanner(System.in);
			System.out.println("Phan so: \n");
			
			//phan so thu nhat
			System.out.print("Nhap vao tu so cua phan so thu nhat: ");
			soA = nhapVao.nextInt();
			System.out.print("Nhap vao mau so cua phan so thu nhat: ");
			soB = nhapVao.nextInt();
			//phan so thu hai
			System.out.print("Nhap vao tu so cua phan so thu hai: ");
			soC = nhapVao.nextInt();
			System.out.print("Nhap vao mau so cua phan so thu hai: ");
			soD = nhapVao.nextInt();
			
		    char op = '+';
		    PhanSo_lab2_ctdl_hkI_2015[][] m1 = new PhanSo_lab2_ctdl_hkI_2015[ASC][ASC];
		    PhanSo_lab2_ctdl_hkI_2015[][] m2 = new PhanSo_lab2_ctdl_hkI_2015[ASC][ASC];
		    for (int i = 0; i < m1.length; i++)
		      for (int j = 0; j < m1[0].length; j++)
		      {
		        m1[i][j] = new PhanSo_lab2_ctdl_hkI_2015(soA + 1, soB + 2);
		        m2[i][j] = new PhanSo_lab2_ctdl_hkI_2015(soC + 1, soD + 2);
		      }
		    
		    MatranPhanSo_lab2_ctdl_hkI_2015 rationalMatrix = new MatranPhanSo_lab2_ctdl_hkI_2015();

		    System.out.println("\nmatran1 + matran2 la: ");
		    MaTran_lab2_ctdl_hkI_2015.inRaKetQua(
		      m1, m2, rationalMatrix.congHaiMaTran(m1, m2), op);

		    System.out.println("\nmatran1 * matran2 la: ");
		    MaTran_lab2_ctdl_hkI_2015.inRaKetQua(
		      m1, m2, rationalMatrix.nhanHaiMaTran(m1, m2), '*');
		  }
}
