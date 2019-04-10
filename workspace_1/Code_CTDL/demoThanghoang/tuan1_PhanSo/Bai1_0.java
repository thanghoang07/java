/*
 * nhap vao 2 phan so co dang 1/2, 3/7, 1/1 = 1 
 * va thuc hien cac phep tinh cong, tru , nhan ,chia
 * dung toString
 */
package tuan1_PhanSo;

import java.util.Scanner;

public class Bai1_0
{
	
	static Scanner nhapVao;
	static int soAB;
	static int soCD;
	static int soA;
	static int soB;
	static int soC;
	static int soD;
	static int tongPhanTu;
	static int tongPhanMau;
	static int truPhanTu;
	static int truPhanMau;
	static int tichPhanTu;
	static int tichPhanMau;
	static int thuongPhanTu;
	static int thuongPhanMau;
	
	public static void main(String[] args) 
	{
		nhapVao = new Scanner(System.in);
		System.out.println("Nhap vao phan so: ");
		//nhap vao phan so 1:
		//tu so
		System.out.print("\nnhap vao tu so cua phan so mot: ");
		soA = nhapVao.nextInt();
		//mau so
		System.out.print("\nnhap vao mau so cua phan so mot: ");
		soB = nhapVao.nextInt();
		//nhap vao phan so 2:
		//tu so
		System.out.print("\nnhap vao tu so cua phan so hai: ");
		soC = nhapVao.nextInt();
		//mau so
		System.out.print("\nnhap vao mau so cua phan so hai: ");
		soD = nhapVao.nextInt();
		//xet truong hop mau so bang 0, mau so am, mau so khong am:
		//mau so B
		if(soB == 0)
		{
			System.out.print(
					"\nphan mau so ban nhap sai, moi ban nhap lai: ");
			soB = nhapVao.nextInt();
			System.out.print(
					"\nphan so ban nhap vao la: " + soA + "/" + soB);
			setSoAB(soA / soB);
		}
		else if (soB != 0 && soB >= 0)
		{
			System.out.print(
					"\nphan so ban nhap vao la: " + soA + "/" + soB);
			setSoAB(soA / soB);
		}
		else if (soB != 0 && soB < 0)
		{
			System.out.print(
					"\nphan so ban nhap vao la: " + soA + "/" + soB);
			setSoAB(- soA / soB);
		}
		else if (soB == 1 && soA == 1 || soA == soB)
		{
			System.out.print(
					"\nphan so ban nhap vao la: " + soA + "/" + soB + 
					"hay: " + soA/soB );
			setSoAB(soA / soB);
		}
		//mau so D
		if(soD == 0)
		{
			System.out.print(
					"\nphan mau so ban nhap sai, moi ban nhap lai: ");
			soD = nhapVao.nextInt();
			System.out.print(
					"\nphan so ban nhap vao la: " + soC + "/" + soD);
			setSoCD(soC / soD);
		}
		else if (soD != 0 && soD >= 0)
		{
			System.out.print(
					"\nphan so ban nhap vao la: " + soC + "/" + soD);
			setSoCD(soC / soD);
		}
		else if (soD != 0 && soD < 0)
		{
			System.out.print(
					"\nphan so ban nhap vao la: "  + soC + "/" + soD);
			setSoCD(- soC / soD);
		}
		else if (soD == 1 && soC == 1 || soC == soD)
		{
			System.out.print(
					"\nphan so ban nhap vao la: " + soC + "/" + soD + 
					"hay: " + soC/soD );
			setSoCD(soC / soD);
		}
		//tinh
		//cong hai phan so:
		tongPhanTu = soA * soD + soC * soB;
		tongPhanMau = soB * soD;
		System.out.println("\ntong hai phan so vua nhap la: " +
							tongPhanTu + "/" + tongPhanMau);
		//tru hai phan so
		if(soA >= soC && soB >= soD)
		{
		truPhanTu = soA * soD - soC * soB;
		truPhanMau = soB * soD;
		System.out.println("\ntru hai phan so vua nhap la: " + 
							truPhanTu + "/" + truPhanMau);
		}
		else if (soA >= soC && soB < soD)
		{
		truPhanTu = soA * soD - soC * soB;
		truPhanMau = soB * soD;
		System.out.println("\ntru hai phan so vua nhap la: " +
							truPhanTu + "/" + truPhanMau);	
		}
		else if (soA < soC && soB < soD)
		{
		truPhanTu = - soA * soD + soC * soB;
		truPhanMau = soB * soD;
		System.out.println("\ntru hai phan so vua nhap la: " +
							truPhanTu + "/" + truPhanMau);	
		}
		else if (soA < 0 && soC < 0 && soB >= soD)
		{
		truPhanTu = soA * soD - soC * soB;
		truPhanMau = soB * soD;
		System.out.println("\ntru hai phan so vua nhap la: " + 
							truPhanTu + "/" + truPhanMau);	
		}

		//nhan hai phan so
		tichPhanTu = soA * soC;
		tichPhanMau = soB * soD;
		System.out.println("\nnhan hai phan so la: " + 
							tichPhanTu + "/" + tichPhanMau);
		//chia hai phan so
		if(soA > 0 && soC > 0)
		{
		thuongPhanTu = soA * soD;
		thuongPhanMau = soB * soC;
		System.out.println("\nchia hai phan so la: " + 
				thuongPhanTu + "/" + thuongPhanMau);
		}
		else if(soA < 0 && soC > 0)
		{
		thuongPhanTu = soA * soD;
		thuongPhanMau = soB * soC;
		System.out.println("\nchia hai phan so la: " + 
				thuongPhanTu + "/" + thuongPhanMau);
		}
		else if(soA < 0 && soC < 0)
		{
		thuongPhanTu = - soA * soD;
		thuongPhanMau = - soB * soC;
		System.out.println("\nchia hai phan so la: " + 
				thuongPhanTu + "/" + thuongPhanMau);
		}
		
	}
	public static int getSoAB() {
		return soAB;
	}
	public static void setSoAB(int soAB) {
		Bai1_0.soAB = soAB;
	}
	public static int getSoCD() {
		return soCD;
	}
	public static void setSoCD(int soCD) {
		Bai1_0.soCD = soCD;
	}
}
